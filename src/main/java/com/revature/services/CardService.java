package com.revature.services;

import java.util.List;

import com.revature.daos.CardDAO;
import com.revature.models.Cards;


public class CardService {
	CardDAO cDAO = new CardDAO();

	public List<Cards> getAllCards()
	{
		return cDAO.getAllCards();
	}
}
