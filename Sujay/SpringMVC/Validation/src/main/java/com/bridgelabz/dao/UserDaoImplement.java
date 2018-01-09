package com.bridgelabz.dao;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.model.User;

public class UserDaoImplement implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveUser(User user) {
		System.out.println("123 User");
		if(sessionFactory==null) {
			System.out.println("null");
		} else {
			System.out.println("not null");
		}
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		try
		{
			System.out.println("inside save");
			session.save(user);
			transaction.commit();
			System.out.println("Saved");
			session.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			session.close();
		}
		
		
	}

	@Override
	public User checkUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserExit(String email) {
		System.out.println("inside dao impl");
		Session session=sessionFactory.openSession();
		try
		{
			Criteria criteria=session.createCriteria(User.class);
			List list=criteria.list();
			for(Iterator itr= list.iterator(); itr.hasNext();)
			{
				User user=(User) itr.next();
				String email1=user.getUserEmail();
				if(email.equals(email1))
				{
					return true;
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<User> retrieveAllUsers() {
		System.out.println("inside Retrieve All");
		Session session=sessionFactory.openSession();
		try
		{
			Criteria criteria=session.createCriteria(User.class);
			List list=criteria.list();
			return list;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User retrieveById(int id) {
		System.out.println("inside Retrieve by id");
		Session session=sessionFactory.openSession();
		try
		{
			Criteria criteria=session.createCriteria(User.class);
			Criterion id1=Restrictions.eq("id", id);
			criteria.add(id1);
			User user=(User) criteria.uniqueResult();
			//List list=criteria.list();
			return user;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateUser(User currentUser) {
		
		Session session=sessionFactory.openSession();
		Transaction transaction=null;
		try{
			transaction=session.beginTransaction();
			
			
		}
		catch (Exception e) {
			if(transaction!=null)
				transaction.rollback();
			
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUserById(int id) {
		Session session=sessionFactory.openSession();
		Transaction transaction=null;
		try{
			transaction=session.beginTransaction();
			String sql="delete User where id =:id";
			Query query=session.createQuery(sql);
			query.setParameter("id", id);
			query.executeUpdate();
			transaction.commit();
			session.close();
		}
		catch (Exception e) {
			if(transaction!=null)
				transaction.rollback();
			
			e.printStackTrace();
		}
		
	}

}
