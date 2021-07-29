package com.revature.daos;

import java.util.List;

import org.hibernate.Session;

import com.revature.models.Cards;
import com.revature.models.Subject;
import com.revature.utils.HibernateUtil;

public class SubjectDAO {

	
	public void addSubject(Subject newSubject) {
		//Open a hibernate Session object so that we can connect to the database
		Session ses = HibernateUtil.getSession(); //there is some parallels between ConnectionUtil.getConnection() in JDBC!
		
		ses.save(newSubject); //use save method to insert into the data base it's a method for Insert fucntionality
		
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
	
	
	public Subject getSubjectById(int subject_id) {
		Session ses = HibernateUtil.getSession();
		Subject subject = ses.get(Subject.class, subject_id);
		HibernateUtil.closeSession();
		return subject;
	}

	
	public void deleteSubject(Subject subject) {
		Session ses = HibernateUtil.getSession();
		
		ses.delete(subject);
		
		HibernateUtil.closeSession();		
		}



	
	public List<Subject> getAllSubjects() {
		Session ses = HibernateUtil.getSession();
		
		//Using HQL! Hibernate Query Language it references the Java class, not the DB table
		//e.g. "Author" in our models package instead of "authors" in our DB
		
		List<Subject> subjectList = ses.createQuery("FROM Subject").list(); //at the end, we're turning the Query object into a List
		
		//warning is unimportant, it's complaining about conversion
		//it wants a specific generic but it's not important. We could probably use casting to get rid of it
		
		HibernateUtil.closeSession();
		
		return subjectList;
		
	}
}
