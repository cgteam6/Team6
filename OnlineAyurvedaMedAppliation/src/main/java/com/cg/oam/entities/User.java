package com.cg.oam.entities;

public class User {
	int userId;
	String userName;
	String userType;

	public User() {
	}

	public User(int userId, String userName, String userType) {
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
}