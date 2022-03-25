package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface UserDAO {
	List<User> getAllUsers();
	void registerUser(User user);
	boolean deleteUser(int id);
	User findUser(int id);

}
