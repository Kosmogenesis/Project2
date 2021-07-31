package com.revature.services;

import java.util.List;

import com.revature.daos.SubjectDAO;
import com.revature.models.Status;
import com.revature.models.Subject;
import com.revature.models.Users;

public class SubjectService {
	private static SubjectDAO sDAO = new SubjectDAO();

	public List<Subject> getAllSubjects()
	{
		return sDAO.getAllSubjects();
	}
	
	public void addSubject(Subject subject) {
		sDAO.addSubject(subject);
	}
}
