package com.hamsa.webApps.service;

import java.util.HashMap;

import com.hamsa.webApps.dto.User;

public class LoginService {
	HashMap<String,String> users = new HashMap<String,String>();
	
	public LoginService() {
		users.put("hamsam","Hamsa M");
		users.put("vaibhavig", "Vaibhavi G");
		users.put("ganeshk", " Ganesh K");
		users.put("chintu", "Shobith");
	}
	public boolean authenticate(String userId,String password) {
		if(password == null || password.trim() == "") {
			return false;
		}
		return true;
	}
	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}

}
