package com.revature.services;

import java.util.List;

import com.revature.daos.UserDAO;
import com.revature.models.Users;

public class LoginService {

public int login(String username, String password) {
		
		
		 
		
		UserDAO allUsers = new UserDAO();
		List<Users> checkLogin = allUsers.getAllUsers();
		
		for(Users test : checkLogin) {
			
			if(username.equals(test.getUsername()) && password.equals(test.getPassword())) {
				
				return test.getId();
			}
			
			
		}
		
		return -1;
	}
}
