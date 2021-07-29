package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Cards;

import com.revature.services.CardService;


public class CardController {

	private static ObjectMapper om = new ObjectMapper();
	private static CardService cs = new CardService();
	
	public void getAllCards(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		{
			List<Cards> cardList = cs.getAllCards();
			
			String data = null;
	
			data = om.writeValueAsString(cardList);
	
			
			response.getWriter().print(data);
			response.setStatus(200);
		}
	}
}
