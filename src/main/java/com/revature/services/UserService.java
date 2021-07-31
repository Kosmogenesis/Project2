package com.revature.services;

import java.util.List;

import com.revature.daos.UserDAO;

import com.revature.models.Users;

public class UserService {

	private UserDAO uDAO = new UserDAO();
	
	public Users validateUser(String username, String password) {
		return uDAO.getUserByUsernamePassword(username,password);
	}
	
	public List<Users> getAllUsers()
	{
		return uDAO.getAllUsers();
	}
	
	public void addUser(Users user) {
		 uDAO.addUser(user);
	}
	
//	public Users getUsers(String username) {
//		return uDAO.getUser
//	}
}
