package com.revature.daos;

import org.hibernate.Session;

import com.revature.models.Users;
import com.revature.utils.HibernateUtil;

public class LoginDAO {

public Users getUserPass(String username, String password) {
		
		Session session = HibernateUtil.getSession();
		
		Users user = (Users) session.createQuery("FROM Users WHERE username = ?1 AND password = ?2").setParameter(1,  username).setParameter(2,  password).getSingleResult();
		
		HibernateUtil.closeSession();
		
		if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
			return user;
		}
		
		return null;
	}
}
