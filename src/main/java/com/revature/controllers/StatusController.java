package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Status;
import com.revature.models.Users;
import com.revature.services.StatusService;
import com.revature.services.UserService;

public class StatusController {

	private static ObjectMapper om = new ObjectMapper();
	private static StatusService ss = new StatusService();
	
	public void getAllStatuses(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		{
			List<Status> statusList = ss.getAllStatuses();			
			String data = null;
	
			data = om.writeValueAsString(statusList);
	
			
			response.getWriter().print(data);
			response.setStatus(200);
		}
	}
	
	public void updateStatus(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		Status statusList = ss.getStatusById(1);
		String data = null;
		
		data = om.writeValueAsString(statusList);
		response.setStatus(200);
	}
}
