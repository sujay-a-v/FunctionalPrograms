package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.model.User;

public interface UserService {

	public void saveUserData(User user);
	
	public boolean isUserExist(String email);
	
	public User checkUserData(String email, String password);
	
	
	public List<User> retrieveAllUsers();
	
	public User retrieveById(int id);
	
	public void updateUser(User currentUser);
	
	public void deleteUserById(int id);
}
