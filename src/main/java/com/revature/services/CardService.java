package com.revature.services;

import java.util.List;

import com.revature.daos.CardDAO;
import com.revature.models.Cards;
import com.revature.models.Users;


public class CardService {
	CardDAO cDAO = new CardDAO();

	public List<Cards> getAllCards()
	{
		return cDAO.getAllCards();
	}
	
	public void addCard(Cards card) {
		 cDAO.addCards(card);
	}
	
//	public List<Cards> getCardsByUserId(){
//		return cDAO.getCardsByUserId(1);
//	}
	
	public List<Cards> getAllGreenCards(){
		return cDAO.getAllGreenCards(1);
	}
	public List<Cards> getAllYellowCards(){
		return cDAO.getAllYellowCards(2);
	}
	public List<Cards> getAllRedCards(){
		return cDAO.getAllRedCards(3);
	}
	
	public List<Cards> getCardsByUser1(){
		return cDAO.getCardsByUser1(1);
	}
	
	public List<Cards> getCardsByUser2(){
		return cDAO.getCardsByUser2(2);
	}
	
	public List<Cards> getCardsByUser3(){
		return cDAO.getCardsByUser3(3);
	}
	
	public List<Cards> getAllGreenCardsByUser1(){
		return cDAO.getAllGreenCardsByUser1(1, 1);
	}
	
	public List<Cards> getAllGreenCardsByUser2(){
		return cDAO.getAllGreenCardsByUser2(1, 2);
	}
	
	public List<Cards> getAllGreenCardsByUser3(){
		return cDAO.getAllGreenCardsByUser3(1, 3);
	}
	
	public List<Cards> getAllYellowCardsByUser1(){
		return cDAO.getAllYellowCardsByUser1(2, 1);
	}
	
	public List<Cards> getAllYellowCardsByUser2(){
		return cDAO.getAllYellowCardsByUser2(2, 2);
	}
	
	public List<Cards> getAllYellowCardsByUser3(){
		return cDAO.getAllYellowCardsByUser3(2, 3);
	}
	
	public List<Cards> getAllRedCardsByUser1(){
		return cDAO.getAllRedCardsByUser1(3, 1);
	}
	
	public List<Cards> getAllRedCardsByUser2(){
		return cDAO.getAllRedCardsByUser2(3, 2);
	}
	
	public List<Cards> getAllRedCardsByUser3(){
		return cDAO.getAllRedCardsByUser3(3, 3);
	}
	
//	public List<Cards> getCardsFromUser(){
//		return cDAO.getCardsFromUser(null);
//	}
}
