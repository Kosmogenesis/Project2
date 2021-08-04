package com.revature.daos;

import java.util.ArrayList;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Cards;

import com.revature.models.Users;
import com.revature.utils.HibernateUtil;

public class CardDAO {

	public void addCards(Cards newCard) {
		//Open a hibernate Session object so that we can connect to the database
		Session ses = HibernateUtil.getSession(); //there is some parallels between ConnectionUtil.getConnection() in JDBC!
		Transaction tx = ses.beginTransaction();
		
		if(!tx.isActive()) {
			tx.begin();
		}
		
		ses.save(newCard); //use save method to insert into the data base it's a method for Insert fucntionality
		tx.commit();
		
		HibernateUtil.closeSession(); //Close our Session (not super necessary here, but good practice)
		
	}
	
	public void deleteCards(Cards deleteCard) {
		//Open a hibernate Session object so that we can connect to the database
		Session ses = HibernateUtil.getSession(); //there is some parallels between ConnectionUtil.getConnection() in JDBC!
		Transaction tx = ses.beginTransaction();
		
		if(!tx.isActive()) {
			tx.begin();
		}
		
		ses.delete(deleteCard); //use save method to insert into the data base it's a method for Insert fucntionality
		tx.commit();
		
		HibernateUtil.closeSession(); //Close our Session (not super necessary here, but good practice)
		
	}
	
	
	public void updateCardStatus(Cards card) {
		//Open a hibernate Session object so that we can connect to the database
		Session ses = HibernateUtil.getSession(); //there is some parallels between ConnectionUtil.getConnection() in JDBC!
		Transaction tx = ses.beginTransaction();
		
		Cards card1 = (Cards) ses.createQuery("UPDATE Card SET card_status_id set = ?1 WHERE card__id = ?2").setParameter(1, 2).setParameter(2, card.getStatus());
		
		if(!tx.isActive()) {
			tx.begin();
		}
		
		ses.delete(card1); //use save method to insert into the data base it's a method for Insert fucntionality
		tx.commit();
		
		HibernateUtil.closeSession(); //Close our Session (not super necessary here, but good practice)
		
	}
	public boolean deleteCardById(int card_id) {
		//get hibernate session
		Session ses = HibernateUtil.getSession();
		
		//use get method to get reimbursement id
		Cards cGone = ses.get(Cards.class,card_id);
        
		//use delete method
		ses.delete(cGone);
		HibernateUtil.closeSession();
		return true;
        
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
	
	
	public Cards getCardById(int card_id) {
		Session ses = HibernateUtil.getSession();
		Cards card = ses.get(Cards.class, card_id);
		HibernateUtil.closeSession();
		return card;
	}

	
	public void deleteCard(Cards card) {
		Session ses = HibernateUtil.getSession();
		
		ses.delete(card);
		
		HibernateUtil.closeSession();		
		}



	
	public List<Cards> getAllCards() {
		Session ses = HibernateUtil.getSession();
		
		//Using HQL! Hibernate Query Language it references the Java class, not the DB table
		//e.g. "Author" in our models package instead of "authors" in our DB
		
		List<Cards> cardList = ses.createQuery("FROM Cards").list(); //at the end, we're turning the Query object into a List
		
		//warning is unimportant, it's complaining about conversion
		//it wants a specific generic but it's not important. We could probably use casting to get rid of it
		
		HibernateUtil.closeSession();
		
		return cardList;
		
	}
	
//	public List<Cards> getCardsByUserId(int userId){
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		
//		if(!tx.isActive()) {
//			tx.begin();
//		}
//		
//		//Using HQL! Hibernate Query Language it references the Java class, not the DB table
//		//e.g. "Author" in our models package instead of "authors" in our DB
//		
//		Cards cardList = (Cards) ses.createQuery("FROM Cards WHERE user_id = ?1;").setParameter(1, userId).list(); //at the end, we're turning the Query object into a List
//		
//		if(cardList.getUserId().equals(userId) ) {
//			return   (List<Cards>) cardList;
//		}
//		tx.commit();
//	
//		
//		//warning is unimportant, it's complaining about conversion
//		//it wants a specific generic but it's not important. We could probably use casting to get rid of it
//		
//		HibernateUtil.closeSession();
//		return null;
//		
//		
//	}
	
	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//Get all cards from individual user below
	
	public List<Cards> getCardsByUser1(int userId) {
		
		Session ses = HibernateUtil.getSession();
		
		List<Cards> cardList = getAllCards();
		
		List<Cards> returnList = new ArrayList<>();
		
		for(Cards c : cardList)
		{
			
			if(c.getUserId().getId() == 1)
			{
				returnList.add(c);
			}
		}
		
		HibernateUtil.closeSession();
		
		return returnList;
	}
	
public List<Cards> getCardsByUser2(int userId) {
		
		Session ses = HibernateUtil.getSession();
		
		List<Cards> cardList = getAllCards();
		
		List<Cards> returnList = new ArrayList<>();
		
		for(Cards c : cardList)
		{
			
			if(c.getUserId().getId() == 2)
			{
				returnList.add(c);
			}
		}
		
		HibernateUtil.closeSession();
		
		return returnList;
	}

	public List<Cards> getCardsByUser3(int userId) {
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCards();
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 3)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}
	
	
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//get all green, yellow, and red cards from each individual user below (9 methods total)
	

	
	
	public List<Cards> getAllGreenCardsByUser1(int card_status_id, int userId){
		
			Session ses = HibernateUtil.getSession();
			
			List<Cards> cardList = getAllGreenCards(1);
			
			List<Cards> returnList = new ArrayList<>();
			
			for(Cards c : cardList)
			{
				
				if(c.getUserId().getId() == 1)
				{
					returnList.add(c);
				}
			}
			
			HibernateUtil.closeSession();
			
			return returnList;
		}
	
	public List<Cards> getAllGreenCardsByUser2(int card_status_id, int userId){
		
		Session ses = HibernateUtil.getSession();
		
		List<Cards> cardList = getAllGreenCards(1);
		
		List<Cards> returnList = new ArrayList<>();
		
		for(Cards c : cardList)
		{
			
			if(c.getUserId().getId() == 2)
			{
				returnList.add(c);
			}
		}
		
		HibernateUtil.closeSession();
		
		return returnList;
	}
	
	public List<Cards> getAllGreenCardsByUser3(int card_status_id, int userId){
		
		Session ses = HibernateUtil.getSession();
		
		List<Cards> cardList = getAllGreenCards(1);
		
		List<Cards> returnList = new ArrayList<>();
		
		for(Cards c : cardList)
		{
			
			if(c.getUserId().getId() == 3)
			{
				returnList.add(c);
			}
		}
		
		HibernateUtil.closeSession();
		
		return returnList;
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------
	//Get all yellow cards per individual user
	
public List<Cards> getAllYellowCardsByUser1(int card_status_id, int userId){
		
		Session ses = HibernateUtil.getSession();
		
		List<Cards> cardList = getAllYellowCards(2);
		
		List<Cards> returnList = new ArrayList<>();
		
		for(Cards c : cardList)
		{
			
			if(c.getUserId().getId() == 1)
			{
				returnList.add(c);
			}
		}
		
		HibernateUtil.closeSession();
		
		return returnList;
	}

public List<Cards> getAllYellowCardsByUser2(int card_status_id, int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllYellowCards(2);
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 2)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

public List<Cards> getAllYellowCardsByUser3(int card_status_id, int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllYellowCards(2);
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 3)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

//------------------------------------------------------------------------------------------------------------------------------------------------

//Get all red cards per individual user below

public List<Cards> getAllRedCardsByUser1(int card_status_id, int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllRedCards(3);
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 1)
		{
			System.out.println("This is status: " + c.getStatus().getId());
			System.out.println("This is user: " + c.getUserId().getId());
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

public List<Cards> getAllRedCardsByUser2(int card_status_id, int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllRedCards(3);
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 2)
			
		{
			System.out.println("This is status: " + c.getStatus().getId());
			System.out.println("This is user: " + c.getUserId().getId());
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

public List<Cards> getAllRedCardsByUser3(int card_status_id, int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllRedCards(3);
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 3)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}
	

public List<Cards> getAllMathCardsFromUser1(int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCardsByMath("Math");
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 1)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}
	

public List<Cards> getAllMathCardsFromUser2(int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCardsByMath("Math");
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 2)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}
	


public List<Cards> getAllHistoryCardsFromUser1(int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCardsByHistory("History");
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 1)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

public List<Cards> getAllHistoryCardsFromUser2(int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCardsByHistory("History");
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 2)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

public List<Cards> getAllCSCardsFromUser1(int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCardsByComputerScience("Computer Science");
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 1)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

public List<Cards> getAllCSCardsFromUser2(int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCardsByComputerScience("Computer Science");
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 2)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

public List<Cards> getAllCSCardsFromUser3(int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCardsByComputerScience("Computer Science");
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 3)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

public List<Cards> getAllPhysicsCardsFromUser1(int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCardsByPhysics("Physics");
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 1)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

public List<Cards> getAllPhysicsCardsFromUser2(int userId){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCardsByPhysics("Physics");
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getUserId().getId() == 2)
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Cards> getAllGreenCards(int card_status_id){
		
		Session ses = HibernateUtil.getSession();
		
		List<Cards> cardList = getAllCards();
		
		List<Cards> returnList = new ArrayList<>();
		
		for(Cards c : cardList)
		{
			
			if(c.getStatus().getId() == 1)
			{
				returnList.add(c);
			}
		}
		
		HibernateUtil.closeSession();
		
		return returnList;
	}
	
	
	
	public List<Cards> getAllYellowCards(int card_status_id){
		
		Session ses = HibernateUtil.getSession();
		
		List<Cards> cardList = getAllCards();
		
		List<Cards> returnList = new ArrayList<>();
		
		for(Cards c : cardList)
		{
			
			if(c.getStatus().getId() == 2)
			{
				returnList.add(c);
			}
		}
		
		HibernateUtil.closeSession();
		
		return returnList;
	}
	
	public List<Cards> getAllRedCards(int card_status_id){
		
		Session ses = HibernateUtil.getSession();
		
		List<Cards> cardList = getAllCards();
		
		List<Cards> returnList = new ArrayList<>();
		
		for(Cards c : cardList)
		{
			
			if(c.getStatus().getId() == 3)
			{
				returnList.add(c);
			}
		}
		
		HibernateUtil.closeSession();
		
		return returnList;
	}
	
	
public List<Cards> getAllCardsByMath(String subject){
		
		Session ses = HibernateUtil.getSession();
		
		List<Cards> cardList = getAllCards();
		
		List<Cards> returnList = new ArrayList<>();
		
		for(Cards c : cardList)
		{
			
			if(c.getSubject().getSubjectName().equals("Math"))
			{
				returnList.add(c);
			}
		}
		
		HibernateUtil.closeSession();
		
		return returnList;
	}

public List<Cards> getAllCardsByHistory(String subject){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCards();
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getSubject().getSubjectName().equals("History"))
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

//public List<Cards> getAllCardsByGeography(String subject){
//	
//	Session ses = HibernateUtil.getSession();
//	
//	List<Cards> cardList = getAllCards();
//	
//	List<Cards> returnList = new ArrayList<>();
//	
//	for(Cards c : cardList)
//	{
//		
//		if(c.getSubject().getSubjectName().equals("Geography"))
//		{
//			returnList.add(c);
//		}
//	}
//	
//	HibernateUtil.closeSession();
//	
//	return returnList;
//}

public List<Cards> getAllCardsByPhysics(String subject){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCards();
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getSubject().getSubjectName().equals("Physics"))
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

public List<Cards> getAllCardsByComputerScience(String subject){
	
	Session ses = HibernateUtil.getSession();
	
	List<Cards> cardList = getAllCards();
	
	List<Cards> returnList = new ArrayList<>();
	
	for(Cards c : cardList)
	{
		
		if(c.getSubject().getSubjectName().equals("Computer Science"))
		{
			returnList.add(c);
		}
	}
	
	HibernateUtil.closeSession();
	
	return returnList;
}

	
	
	
	
	
	
	
	
	
//	public List<Cards> getCardsFromUser(Users user) {
//		Session ses = HibernateUtil.getSession();
//		int userID = user.getId();
//		
//		List<Cards> myCards = ses.createQuery("FROM Cards WHERE user_id = ?1").setParameter(1,  userID).list();
//
//		HibernateUtil.closeSession();
//		
//		
//		return myCards;
//	}
}
	
	
	





