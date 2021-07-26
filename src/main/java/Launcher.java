import com.revature.daos.CardDAO;
import com.revature.daos.StatusDAO;
import com.revature.daos.SubjectDAO;
import com.revature.daos.UserDAO;
import com.revature.models.Cards;

import com.revature.models.Status;
import com.revature.models.Subject;
import com.revature.models.Users;


public class Launcher {

	private static UserDAO uDAO = new UserDAO();
	private static CardDAO cDAO = new CardDAO();
	private static SubjectDAO sDAO = new SubjectDAO(); 
	private static StatusDAO statDAO = new StatusDAO();
	
	public static void main(String[] args) {
		
		Users u =new Users();
		
		
		//create card objects
//		Cards c1 = new Cards(null, "What is 2+2?", "4", 1, 1, 1);
//		Cards c2 = new Cards();
//		Cards c3 = new Cards();
//		Cards c4 = new Cards();
//				
//		//add roles
//		cDAO.addCards(c1);
//		cDAO.addCards(c2);
		
//		Cards id1 = new Cards(1);
//		Cards id2 = new Cards(2);
		
		//create the user object
		Users u1 = new Users(1,  "Mary_Jane", "Mary2021", "Mary", "Jane", "Mary_Jane@revature.com", null);
		
		Users u2 = new Users(2, "Billy_Bob", "Bob", "Billy", "Bob", "BillyBob@yahoo.com", null );
		
		uDAO.addUser(u1);
		uDAO.addUser(u2);
		
		
		
		
		Subject sub1 = new Subject(1, "Math");
		Subject sub2 = new Subject(2, "History");
		Subject sub3 = new Subject(3, "Computer Science");
		Subject sub4 = new Subject(4, "English");
		
		sDAO.addSubject(sub1);
		sDAO.addSubject(sub2);
		sDAO.addSubject(sub3);
		sDAO.addSubject(sub4);
		
		
		
		Status stat1 = new Status(1, "Green");
		Status stat2 = new Status(2, "Yellow");
		Status stat3 = new Status(3, "Red");
		
		statDAO.addStatus(stat1);
		statDAO.addStatus(stat2);
		statDAO.addStatus(stat3);
		
		Cards c1 = new Cards("Basic Math", "What is 2+2?", "4", u1, stat1, sub1);
		Cards c2 = new Cards("Basic History", "When did WW2 end?", "1945", u2, stat2, sub2);
		Cards c3 = new Cards("Basic History", "Who was the first U.S President?", "George Washington", u2, stat1, sub2);
		Cards c4 = new Cards("Basic CS", "What are the 4 pillars of OOP>", "Inheritance, Abstraction, Encapsulation, Polymorphism", u1, stat1, sub3);
		Cards c5 = new Cards("Calculus", "What is the derivative of e^x?", "e^x", u2, stat1, sub1);
		Cards c6 = new Cards("Basic CS", "True or False: Strings are objects in Java?", "True", u2, stat3, sub3);
				
		//add roles
		cDAO.addCards(c1);
		cDAO.addCards(c2);
		cDAO.addCards(c3);
		cDAO.addCards(c4);
		cDAO.addCards(c5);
		cDAO.addCards(c6);
		
		
		
	}
}
