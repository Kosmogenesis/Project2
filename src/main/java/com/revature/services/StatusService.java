package com.revature.services;

import java.util.List;

import com.revature.daos.StatusDAO;
import com.revature.models.Status;

public class StatusService {
	private static StatusDAO sDAO = new StatusDAO();

	public List<Status> getAllStatuses() {
		return sDAO.getAllStatuses();
	}
	
	public Status getStatusById(int status_id) {
		return sDAO.getStatusById(status_id);
	}
	
	public void updateStatus(Status status) {
		sDAO.updateStatus(status);
	}
	
	
}
