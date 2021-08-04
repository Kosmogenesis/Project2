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
		Users u1 = new Users(1,  "ASmith", "Adam2021", "Adam", "Smith", "Adam_Smith@revature.com", null);
		
		Users u2 = new Users(2, "JJohnson", "John2021", "John", "Johnson", "John_Johnson@yahoo.com", null );
		
		uDAO.addUser(u1);
		uDAO.addUser(u2);
		
		
		
		
		Subject sub1 = new Subject(1, "Math");
		Subject sub2 = new Subject(2, "History");
		Subject sub3 = new Subject(3, "Computer Science");
		Subject sub4 = new Subject(4, "Physics");
		
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
		
		Cards c1 = new Cards( "Basic Math", "What is the square root of 100?", "10", u1, stat1, sub1);
		Cards c2 = new Cards( "Intermediate Math", "Simplify (x²y³)³", "x²*³ * y³*³ => x^6 * y^9", u1, stat2, sub1);
		Cards c3 = new Cards( "Advanced Math", "Determine if the following vector field is conservative: F=(x³-4xy²+2)i+(6x-7y+x³y³)j ", "Py =-8xy & Qx =6+3x²y³; Py =/ Qx => Not Conservative "  , u1, stat3, sub1);
		Cards c4 = new Cards( "Basic History", "When did WW2 end?", "1945", u1, stat1, sub2);
		Cards c5 = new Cards( "Basic CS", "What are the 4 pillars of Java OOP?", "Inheritance, Abstraction, Encapsulation, Polymorphism", u1, stat1, sub3);
		Cards c6 = new Cards( "Intermediate CS", "True or False: The Heap is what manages application flow", "False: The heap is where objects are stored in memory", u1, stat2, sub3);
		Cards c7 = new Cards( "Advanced CS", "List the Maven lifecycle :,)", "Validate, Compile, Test, Package, Verify, Install, Deploy", u1, stat3, sub3);
		Cards c8 = new Cards( "Basic Physics", "What is Newton's Second Law?", "F = ma", u1, stat1, sub4);
		Cards c9 = new Cards( "Intermediate Physics", "Consider two pendulums of equal length. At the end of one is a tennis ball, and the other a bowling ball. Which pendulum has the faster period? ", "They both have the same period. A pendulum's period is independent of mass.", u1, stat2, sub4);
		Cards c10 = new Cards( "Advanced Physics", "Heisenberg's Uncertainty Principle states what?", "That you cannot determine the position and momentum of a particle simultaneously", u1, stat3, sub4);
		
		
		Cards c11 = new Cards( "Basic Math", "What is 8/2(2+2)?", "16", u2, stat1, sub1);
		Cards c12 = new Cards( "Intermediate Math", "What is the derivative of e^x", "e^x", u2, stat1, sub1);
		Cards c13 = new Cards( "Basic History", "When did Apollo 11 occur?", "1969", u2, stat2, sub2);
		Cards c14 = new Cards( "Basic CS", "What are the four access modifiers of a Java class?", "Private, Default, Protected, and Public", u2, stat1, sub3);
		Cards c15 = new Cards( "Intermediate CS", "True or False: Strings are objects in Java", "True", u2, stat2, sub3);
		Cards c16 = new Cards( "Advanced CS", "1. int -> Integer; 2. Boolean -> boolean: This process is called what? And which is which?", "Boxing: 1 is auto-boxing, and 2 is auto-unboxing", u2, stat3, sub3);
		Cards c17 = new Cards( "Basic Physics", "True or False: Mass and Weight are the same", "False", u2, stat2, sub4);
		Cards c18 = new Cards( "Intermediate Physics", "What is the reason for the pitch change of a police siren?", "Doppler Effect", u2, stat2, sub4);
		
		
				
		//add roles
		cDAO.addCards(c1);
		cDAO.addCards(c2);
		cDAO.addCards(c3);
		cDAO.addCards(c4);
		cDAO.addCards(c5);
		cDAO.addCards(c6);
		cDAO.addCards(c7);
		cDAO.addCards(c8);
		cDAO.addCards(c9);
		cDAO.addCards(c10);
		cDAO.addCards(c11);
		cDAO.addCards(c12);
		cDAO.addCards(c13);
		cDAO.addCards(c14);
		cDAO.addCards(c15);
		cDAO.addCards(c16);
		cDAO.addCards(c17);
		cDAO.addCards(c18);
		
		
		
		
	}
}
