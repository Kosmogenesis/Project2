package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Status;
import com.revature.models.Users;
import com.revature.utils.HibernateUtil;

public class StatusDAO {

	public void addStatus(Status newStatus) {
		//Open a hibernate Session object so that we can connect to the database
		Session ses = HibernateUtil.getSession(); //there is some parallels between ConnectionUtil.getConnection() in JDBC!
		Transaction tx = ses.beginTransaction();
		
		if(!tx.isActive()) {
			tx.begin();
		}
		
		ses.save(newStatus); //use save method to insert into the data base it's a method for Insert fucntionality
		tx.commit();
		
		HibernateUtil.closeSession(); //Close our Session (not super necessary here, but good practice)
		
	}
	
	public void updateStatus(Status newStatus) {
		//Open a hibernate Session object so that we can connect to the database
		Session ses = HibernateUtil.getSession(); //there is some parallels between ConnectionUtil.getConnection() in JDBC!
		Transaction tx = ses.beginTransaction();
		
		if(!tx.isActive()) {
			tx.begin();
		}
		
		ses.merge(newStatus); //use save method to insert into the data base it's a method for Insert fucntionality
		tx.commit();
		
		HibernateUtil.closeSession(); //Close our Session (not super necessary here, but good practice)
		
	}
	
	
//	@Override
//	public void updateUser(User user) {
//		Session ses = HibernateUtil.getSession();
//		
//		ses.merge(user); //this will update the entire book record in the database, if it exists
//		
//		
//		//update() would throw an error if the book object already existed in Hibernate's cache
//		//hence why  merge() is safer
//		
//		HibernateUtil.closeSession(); //Close our Session (not super necessary here, but good practice)
//	}
	
	
	public Status getStatusById(int status_id) {
		Session ses = HibernateUtil.getSession();
		Status status = ses.get(Status.class, status_id);
		HibernateUtil.closeSession();
		return status;
	}

	
	public void deleteStatus(Status status) {
		Session ses = HibernateUtil.getSession();
		
		ses.delete(status);
		
		HibernateUtil.closeSession();		
		}



	
	public List<Status> getAllStatuses() {
		Session ses = HibernateUtil.getSession();
		
		//Using HQL! Hibernate Query Language it references the Java class, not the DB table
		//e.g. "Author" in our models package instead of "authors" in our DB
		
		List<Status> userList = ses.createQuery("FROM Status").list(); //at the end, we're turning the Query object into a List
		
		//warning is unimportant, it's complaining about conversion
		//it wants a specific generic but it's not important. We could probably use casting to get rid of it
		
		HibernateUtil.closeSession();
		
		return userList;
		
	}
}
