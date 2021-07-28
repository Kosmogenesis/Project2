package com.revature.services;

import com.revature.daos.UserDAO;
import com.revature.models.Users;

public class UserService {

	private UserDAO uDAO = new UserDAO();
	
	public Users validateUser(String username, String password) {
		return uDAO.getUserByUsernamePassword(username,password);
	}
}
