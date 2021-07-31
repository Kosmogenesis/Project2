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
	
	
}
