package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.revature.models.Users;
import com.revature.services.UserService;

public class UserController {

	private static ObjectMapper om = new ObjectMapper();
	private static UserService us = new UserService();
	
	public void getAllUsers(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		{
			List<Users> userList = us.getAllUsers();
			
			String data = null;
	
			data = om.writeValueAsString(userList);
	
			
			response.getWriter().print(data);
			response.setStatus(200);
		}
	}
}
