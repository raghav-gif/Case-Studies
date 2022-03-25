package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int userId;
	private String role;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userSAddress;
	private String userBAddress;
	public User() {
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserSAddress() {
		return userSAddress;
	}
	public void setUserSAddress(String userSAddress) {
		this.userSAddress = userSAddress;
	}
	public String getUserBAddress() {
		return userBAddress;
	}
	public void setUserBAddress(String userBAddress) {
		this.userBAddress = userBAddress;
	}
	
	

}
