package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
	
	@Autowired
	UserDAO userDAOImpl;
	
	public List<User> getAllUsers(){
		return userDAOImpl.getAllUsers();
	}
	
	public void registerUser(User user) {
		userDAOImpl.registerUser(user);
	}
	
	public User findUser(int id) {
		return userDAOImpl.findUser(id);
	}
	
	public boolean deleteUser(int id) {
		return userDAOImpl.deleteUser(id);
	}

}
