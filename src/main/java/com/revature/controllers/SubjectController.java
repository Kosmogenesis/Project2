package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Subject;

import com.revature.services.SubjectService;


public class SubjectController {

	
	private static ObjectMapper om = new ObjectMapper();
	private static SubjectService ss = new SubjectService();
	
	public void getAllSubjects(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		{
			List<Subject> subjectList = ss.getAllSubjects();
			
			String data = null;
	
			data = om.writeValueAsString(subjectList);
	
			
			response.getWriter().print(data);
			response.setStatus(200);
		}
	}
}
