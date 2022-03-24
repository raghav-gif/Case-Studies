package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface UserDAO {
	List<Product> getAllUsers();
	

}
