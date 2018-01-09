package com.bridgelabz.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.dao.UserDao;
import com.bridgelabz.model.User;

public class userServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	@Override
	public void saveUserData(User user) {
		System.out.println("user service method");
		userDao.saveUser(user);
		
	}

	@Override
	public User checkUserData(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserExist(String email) {
		System.out.println("inside service impl");
		return userDao.isUserExit(email);
	}

	@Override
	public List<User> retrieveAllUsers() {
		return userDao.retrieveAllUsers();
	}

	@Override
	public User retrieveById(int id) {
		return userDao.retrieveById(id);
	}

	@Override
	public void updateUser(User currentUser) {
		userDao.updateUser(currentUser);
	}

	@Override
	public void deleteUserById(int id) {
		userDao.deleteUserById(id);
		
	}

}
