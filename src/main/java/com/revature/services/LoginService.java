package com.revature.services;

import java.util.List;

import com.revature.daos.LoginDAO;
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



//LoginDAO lDAO = new LoginDAO();
//public boolean login2(String username, String password) {
//	//Users u = lDAO.getUserPass(username, password);
//	if(username.equals(lDAO.getUserPass(username, password))) {
//		return true;
//	} 
//	
//		return false;
//	}
//}

