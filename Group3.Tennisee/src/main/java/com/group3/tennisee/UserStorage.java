package com.group3.tennisee;

import java.util.ArrayList;

public class UserStorage {

	ArrayList<User> userList;

	public UserStorage() {
		this.userList = new ArrayList<User>();
		this.userList.add(new User("John", "Doe","premium", "premium","premium@tennisee.com",1));
	}
	
	public User getPremiumUser(String username, String password) {
		for(User user : userList) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

}
