package com.revature.controllers;

import java.io.BufferedReader;

import java.io.IOException;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.internal.build.AllowSysOut;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.DTO.CardDTO;
import com.revature.DTO.SignUpDTO;
import com.revature.DTO.UpdateStatusDTO;
import com.revature.daos.CardDAO;
import com.revature.models.Cards;

import com.revature.models.Status;
import com.revature.models.Subject;
import com.revature.models.Users;
import com.revature.services.CardService;
import com.revature.services.StatusService;
import com.revature.services.SubjectService;
import com.revature.services.UserService;
import com.revature.utils.HibernateUtil;


public class CardController {

	private static ObjectMapper om = new ObjectMapper();
	private static CardService cs = new CardService();
	private static StatusService statService = new StatusService();
	private static SubjectService subService = new SubjectService();
	private static UserService us = new UserService();
	
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
	
	public void deleteCardById(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		{
			List<Cards> cardList = cs.getAllCards();
			
			String data = null;
	
			data = om.writeValueAsString(cardList);
	
			
			response.getWriter().print(data);
			response.setStatus(200);
		}
	}
	
//	public void updateCardStatus(HttpServletRequest req, HttpServletResponse res) throws IOException
//	{
//		
//if(req.getMethod().equals("POST")) { //making sure we actually got a POST request before executing. 
//			
//			//this process below is to get our JSON String
//	
//			CardDAO cDAO = new CardDAO();
//			CardService cs =  new CardService();
//	
//			
//			BufferedReader reader = req.getReader(); //BufferedReader reads text from an input string (in our case JSON)
//			
//			StringBuilder sb = new StringBuilder(); //create an empty StringBuilder
//			
//			String line = reader.readLine(); //this will read the contents of the BufferedReader into a String
//			//int userID;
//			
//			while(line != null) { 
//				
//				sb.append(line); //add the contents of "line" to the StringBuilder
//				line = reader.readLine(); //assign line to the next line of data in the reader
//				
//				//so for every line of data that received from the response, 
//				//we want to append it to the StringBuilder 
//				//So we get all this previously JSON into one StringBuilder object. Parsing JSON into Java!!
//			}
//			
//			//ObjectMapper only works with Strings... (not StringBuilders...)
//			String body = new String(sb); //so we make a new String to hold the StringBuilder content
//			
//			//Use the ObjectMapper to read our JSON username/password (which is now a Java String) 
//				//remember the readValue() method of ObjectMapper turns JSON into Java
//			//and put it into a LoginDTO class as fields
//			UpdateStatusDTO usDTO = om.readValue(body, UpdateStatusDTO.class); //we created a LoginDTO using the JSON-turned-Java
//			
//			
//			//control flow to determine what happens in the event of a successful/unsuccessful login--------
//			
////			if(us.login(sDTO.username, sDTO.password) != -1) { 
//		
////				Subject subject = new Subject(cDTO.getSubject());
//				
//				Status status = statService.getStatusById(usDTO.getStatus());
//				
//				Status status2 = cs.updateCardStatus(usDTO.getStatus());
////				subService.addSubject(subject);
//				
////				List<Users> users =  us.getAllUsers();
////				
////				Users correctUser = new Users();
////				for(Users u: users) {
////					System.out.println(u);
////					
////					if(u.getUsername().equals(cDTO.getUsername())) {
////						correctUser = u;
////					}
////				}
//				
//				
////				Cards card = new Cards(
////					cDTO.getName(),
////					cDTO.getQuestion(),
////					cDTO.getAnswer(),
////					correctUser,
////					status,
////					subject
////				
////					);
////				
////				System.out.println(card);
////				//added getId in the signupDTO, may need to delete later 
////				
////				
////				
////				cs.addCard(card);
//				
//				//author = uDao.getUserById(userID);
//				
//
//				
//				String json = om.writeValueAsString(card);
//				res.getWriter().print(json);
//				
//
//				HttpSession ses = req.getSession(); //return a Session to hold user info (if one doesn't exist yet)
//				//remember, sessions are how you remember the different users on the client
//				res.setStatus(201);
//				System.out.println("Signup successful!");
////				res.getWriter().print("Sign up was successful!");
//				
////				Users user = us.validateUser(lDTO.username, lDTO.password);
////				String json = om.writeValueAsString(user);
////				res.getWriter().print(json);
//			
////				
////					Cookie[] cookies = req.getCookies();
////					for (cookie : cookies) {
////						info.log(cookie);
////					}
////				
////				); //this is how I'd assume you can log cookies, getCookies returns an array
//				
//				//this info stays on the server, all the client gets is the request's cookie created by getSession()
//				//when a user gets a session, they get a cookie returned that uniquely identifies their session
////				ses.setAttribute("user", sDTO); //we'll probably just use a USer object if this was for real
////				ses.setAttribute("loggedin", true);
//				
//		
//				//res.setStatus(200); //because login was successful
//				//res.getWriter().print("Hi Login was successful"); //we won't see this message anywhere but postman
//
//				
//			} else {
//				HttpSession ses = req.getSession(false); //this will only return a session if one is already active
//				
//				if(ses != null) { //if a session exists...
//					ses.invalidate(); //kill the session
//				}
//				
//				res.setStatus(401); //unauthorized
//				res.getWriter().print("Sign Up Invalidated"); //we won't see this message anywhere but postman
//					
//			}
//			
//		}
//	}
	
	public void createCard(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		if(req.getMethod().equals("POST")) { //making sure we actually got a POST request before executing. 
			
			//this process below is to get our JSON String
			
			BufferedReader reader = req.getReader(); //BufferedReader reads text from an input string (in our case JSON)
			
			StringBuilder sb = new StringBuilder(); //create an empty StringBuilder
			
			String line = reader.readLine(); //this will read the contents of the BufferedReader into a String
			//int userID;
			
			while(line != null) { 
				
				sb.append(line); //add the contents of "line" to the StringBuilder
				line = reader.readLine(); //assign line to the next line of data in the reader
				
				//so for every line of data that received from the response, 
				//we want to append it to the StringBuilder 
				//So we get all this previously JSON into one StringBuilder object. Parsing JSON into Java!!
			}
			
			//ObjectMapper only works with Strings... (not StringBuilders...)
			String body = new String(sb); //so we make a new String to hold the StringBuilder content
			
			//Use the ObjectMapper to read our JSON username/password (which is now a Java String) 
				//remember the readValue() method of ObjectMapper turns JSON into Java
			//and put it into a LoginDTO class as fields
			CardDTO cDTO = om.readValue(body, CardDTO.class); //we created a LoginDTO using the JSON-turned-Java
			
			
			//control flow to determine what happens in the event of a successful/unsuccessful login--------
			
//			if(us.login(sDTO.username, sDTO.password) != -1) { 
		
				Subject subject = new Subject(cDTO.getSubject());
				
				Status status = statService.getStatusById(cDTO.getStatus());
				subService.addSubject(subject);
				
				List<Users> users =  us.getAllUsers();
				
				Users correctUser = new Users();
				for(Users u: users) {
					System.out.println(u);
					
					if(u.getUsername().equals(cDTO.getUsername())) {
						correctUser = u;
					}
				}
				
				
				Cards card = new Cards(
					cDTO.getName(),
					cDTO.getQuestion(),
					cDTO.getAnswer(),
					correctUser,
					status,
					subject
				
					);
				
				System.out.println(card);
				//added getId in the signupDTO, may need to delete later 
				
				
				
				cs.addCard(card);
				
				//author = uDao.getUserById(userID);
				

				
				String json = om.writeValueAsString(card);
				res.getWriter().print(json);
				

				HttpSession ses = req.getSession(); //return a Session to hold user info (if one doesn't exist yet)
				//remember, sessions are how you remember the different users on the client
				res.setStatus(201);
				System.out.println("Signup successful!");
//				res.getWriter().print("Sign up was successful!");
				
//				Users user = us.validateUser(lDTO.username, lDTO.password);
//				String json = om.writeValueAsString(user);
//				res.getWriter().print(json);
			
//				
//					Cookie[] cookies = req.getCookies();
//					for (cookie : cookies) {
//						info.log(cookie);
//					}
//				
//				); //this is how I'd assume you can log cookies, getCookies returns an array
				
				//this info stays on the server, all the client gets is the request's cookie created by getSession()
				//when a user gets a session, they get a cookie returned that uniquely identifies their session
//				ses.setAttribute("user", sDTO); //we'll probably just use a USer object if this was for real
//				ses.setAttribute("loggedin", true);
				
		
				//res.setStatus(200); //because login was successful
				//res.getWriter().print("Hi Login was successful"); //we won't see this message anywhere but postman

				
			} else {
				HttpSession ses = req.getSession(false); //this will only return a session if one is already active
				
				if(ses != null) { //if a session exists...
					ses.invalidate(); //kill the session
				}
				
				res.setStatus(401); //unauthorized
				res.getWriter().print("Sign Up Invalidated"); //we won't see this message anywhere but postman
					
			}
			
		}
	
//	public void getCardByUserID(HttpServletRequest request, HttpServletResponse response) throws IOException
//	{
//		
//		{
//			List<Cards> cardList = cs.getCardsByUserId();
//			
//			String data = null;
//	
//			data = om.writeValueAsString(cardList);
//	
//			
//			response.getWriter().print(data);
//			response.setStatus(200);
//		}
//	}
	
	public void getAllGreenCards(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> greenList = cs.getAllGreenCards();
		
		String data = null;

		data = om.writeValueAsString(greenList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllYellowCards(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> yellowList = cs.getAllYellowCards();
		
		String data = null;

		data = om.writeValueAsString(yellowList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllRedCards(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> redList = cs.getAllRedCards();
		
		String data = null;

		data = om.writeValueAsString(redList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getCardsByUser1(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getCardsByUser1();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getCardsByUser2(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getCardsByUser2();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getCardsByUser3(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getCardsByUser3();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllGreenCardsByUser1(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> greenList = cs.getAllGreenCardsByUser1();
		
		String data = null;

		data = om.writeValueAsString(greenList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllGreenCardsByUser2(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> greenList = cs.getAllGreenCardsByUser2();
		
		String data = null;

		data = om.writeValueAsString(greenList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllGreenCardsByUser3(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> greenList = cs.getAllGreenCardsByUser3();
		
		String data = null;

		data = om.writeValueAsString(greenList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllYellowCardsByUser1(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> yellowList = cs.getAllYellowCardsByUser1();
		
		String data = null;

		data = om.writeValueAsString(yellowList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllYellowCardsByUser2(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> yellowList = cs.getAllYellowCardsByUser2();
		
		String data = null;

		data = om.writeValueAsString(yellowList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllYellowCardsByUser3(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> yellowList = cs.getAllYellowCardsByUser3();
		
		String data = null;

		data = om.writeValueAsString(yellowList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllRedCardsByUser1(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> redList = cs.getAllRedCardsByUser1();
		
		String data = null;

		data = om.writeValueAsString(redList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllRedCardsByUser2(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> redList = cs.getAllRedCardsByUser2();
		
		String data = null;

		data = om.writeValueAsString(redList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllRedCardsByUser3(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> redList = cs.getAllRedCardsByUser3();
		
		String data = null;

		data = om.writeValueAsString(redList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllByMath(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> mathList = cs.getAllCardsByMath();
		
		String data = null;

		data = om.writeValueAsString(mathList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllByHistory(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllCardsByHistory();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllByPhysics(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllCardsByPhysics();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllByComputerScience(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllCardsByComputerScience();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
//	public void getAllByGeography(HttpServletRequest request, HttpServletResponse response) throws IOException{
//		List<Cards> cardList = cs.getAllCardsByGeography();
//		
//		String data = null;
//
//		data = om.writeValueAsString(cardList);
//		
//		response.getWriter().print(data);
//		response.setStatus(200);
//	}
	
	
	
	public void getAllMathCardsFromUser1(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllMathCardsFromUser1();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllMathCardsFromUser2(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllMathCardsFromUser2();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	
	
	
	
	
	
	
	public void getAllHistoryCardsFromUser1(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllHistoryCardsFromUser1();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllHistoryCardsFromUser2(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllHistoryCardsFromUser2();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	
	
	public void getAllCSCardsFromUser1(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllCSCardsFromUser1();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllCSCardsFromUser2(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllCSCardsFromUser2();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllCSCardsFromUser3(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllCSCardsFromUser3();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}

	public void getAllPhysicsCardsFromUser1(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllPhysicsCardsFromUser1();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	public void getAllPhysicsCardsFromUser2(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Cards> cardList = cs.getAllPhysicsCardsFromUser2();
		
		String data = null;

		data = om.writeValueAsString(cardList);
		
		response.getWriter().print(data);
		response.setStatus(200);
	}
	
	
	
	
//	public void getCardsFromUser(HttpServletRequest request, HttpServletResponse response) throws IOException{
//		List<Cards> cardList = cs.getCardsFromUser();
//		
//		String data = null;
//
//		data = om.writeValueAsString(cardList);
//		
//		response.getWriter().print(data);
//		response.setStatus(200);
//	}
	
		
	}
	
	

