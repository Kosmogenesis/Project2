package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controllers.CardController;
import com.revature.controllers.LoginController;
import com.revature.controllers.StatusController;
import com.revature.controllers.SubjectController;
import com.revature.controllers.UserController;

public class MasterServlet extends HttpServlet {
	private LoginController lc = new LoginController();
	private UserController uc = new UserController();
	private CardController cc = new CardController();
	private SubjectController sc = new SubjectController();
	private StatusController statusC = new StatusController();

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/json"); //set the content of our resposne object to be JSON
		
		//by default, Tomcat will send back a successful status code (200) if a request gets handled.
		//since we have a master servlet that takes all requests, this means all requests will get handled.
		//this can lead to problems - we don't want a 200 if the request isn't handled correctly
		//thus, by default, we'll set the status code to 404, and change it in our code upon success. 
		res.setStatus(404);
		
		//Now we want to write some code that will determine where requests get sent
		String URI = req.getRequestURI().replace("/Project2/", "");
		//getting the request URI, and stripping out the base path
		//so we'll just be left with the endpoint  to use in a switch statement
		System.out.println(URI);
		
		
		
		switch(URI) {
		
		case "login": {
			lc.login(req, res);
			break;
		}
		
		case "getAllUsers": {
			uc.getAllUsers(req, res);
			break;
		}
		
		case "getAllCards": {
			cc.getAllCards(req, res);
			break;
		}
		
		case "getAllSubjects": {
			sc.getAllSubjects(req, res);
			break;
		}
		
		case "getAllStatuses":{
			statusC.getAllStatuses(req, res);
			break;
		}
		
		case "signup":{
			uc.SignUpUsers(req, res);
			break;
		}
		
		case "createcard": {
			cc.createCard(req, res);
			break;
		}
		
		case "getCardsByUser1":{
			cc.getCardsByUser1(req, res);
			break;
		}
		
		case "getCardsByUser2":{
			cc.getCardsByUser2(req, res);
			break;
		}
		
		case "getCardsByUser3":{
			cc.getCardsByUser3(req, res);
			break;
		}
		
		case "getGreenCardsByUser1":{
			cc.getAllGreenCardsByUser1(req, res);
			break;
		}
		
		case "getGreenCardsByUser2":{
			cc.getAllGreenCardsByUser2(req, res);
			break;
		}
		
		case "getGreenCardsByUser3":{
			cc.getAllGreenCardsByUser3(req, res);
			break;
		}
		
		case "getYellowCardsByUser1":{
			cc.getAllYellowCardsByUser1(req, res);
			break;
		}
		
		case "getYellowCardsByUser2":{
			cc.getAllYellowCardsByUser2(req, res);
			break;
		}
		
		case "getYellowCardsByUser3":{
			cc.getAllYellowCardsByUser3(req, res);
			break;
		}
		
		case "getRedCardsByUser1":{
			cc.getAllRedCardsByUser1(req, res);
			break;
		}
		
		case "getRedCardsByUser2":{
			cc.getAllRedCardsByUser2(req, res);
			break;
		}
		
		case "getRedCardsByUser3":{
			cc.getAllRedCardsByUser3(req, res);
			break;
		}
		
		case "getAllGreenCards":{
			cc.getAllGreenCards(req, res);
			break;
		}
		
		case "getAllYellowCards":{
			cc.getAllYellowCards(req, res);
			break;
		}
		
		case "getAllRedCards":{
			cc.getAllRedCards(req, res);
			break;
		}
		
		case "getAllCardsByMath":{
			cc.getAllByMath(req, res);
			break;
		}
		
		case "getAllCardsByHistory":{
			cc.getAllByHistory(req, res);
			break;
		}
		
		case "getAllCardsByCS":{
			cc.getAllByComputerScience(req, res);
			break;
		}
		
		case "getAllCardsByPhysics":{
			cc.getAllByPhysics(req, res);
			break;
		}
		
		
		case "getAllMathCardsFromUser1":{
			cc.getAllMathCardsFromUser1(req, res);
			break;
		}
		
		case "getAllMathCardsFromUser2":{
			cc.getAllMathCardsFromUser2(req, res);
			break;
		}
		
		case "getAllHistoryCardsFromUser1":{
			cc.getAllHistoryCardsFromUser1(req, res);
			break;
		}
		
		case "getAllHistoryCardsFromUser2":{
			cc.getAllHistoryCardsFromUser2(req, res);
			break;
		}
		
		case "getAllCSCardsFromUser1":{
			cc.getAllCSCardsFromUser1(req, res);
			break;
		}
		
		case "getAllCSCardsFromUser2":{
			cc.getAllCSCardsFromUser2(req, res);
			break;
		}
		
		case "getAllCSCardsFromUser3":{
			cc.getAllCSCardsFromUser3(req, res);
			break;
		}
		
		case "getAllPhysicsCardsFromUser1":{
			cc.getAllPhysicsCardsFromUser1(req, res);
			break;
		}
		
		case "getAllPhysicsCardsFromUser2":{
			cc.getAllCSCardsFromUser2(req, res);
			break;
		}
		
		
		
		}			
		
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
		//this sends every POST request to the doGet method, why??
		//I only want one switch statement in this servlet. It can get very messy otherwise
		//and we'll differentiate get from post in the controllers instead of the servlet 
	}

}

