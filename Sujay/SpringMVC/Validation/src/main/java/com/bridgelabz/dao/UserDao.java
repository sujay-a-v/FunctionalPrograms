package com.bridgelabz.dao;

import java.util.List;

import com.bridgelabz.model.User;

public interface UserDao {

	public void saveUser(User user);
	public boolean isUserExit(String email);
	public User checkUser(String email,String password);
	
	
	public List<User> retrieveAllUsers();
	
	public User retrieveById(int id);
	
	public void updateUser(User currentUser);
	
	public void deleteUserById(int id);
}
