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
		Cards c1 = new Cards();
		Cards c2 = new Cards();
		Cards c3 = new Cards();
		Cards c4 = new Cards();
				
		//add roles
		cDAO.addCards(c1);
		cDAO.addCards(c2);
		
		
		
		//create the user object
		Users u1 = new Users(1,  "Mary_Jane", "Mary2021", "Mary", "Jane", "Mary_Jane@revature.com", c1);
		
		Users u2 = new Users(2, "Billy_Bob", "Bob", "Billy", "Bob", "BillyBob@yahoo.com", c2 );
		
		uDAO.addUser(u1);
		uDAO.addUser(u2);
		
		
		
		
		Subject sub1 = new Subject(1, "Math");
		Subject sub2 = new Subject(2, "History");
		Subject sub3 = new Subject(3, "Computer Science");
		
		sDAO.addSubject(sub1);
		sDAO.addSubject(sub2);
		
		
		
		Status stat1 = new Status(1, "Green");
		Status stat2 = new Status(2, "Yellow");
		Status stat3 = new Status(3, "Red");
		
		statDAO.addStatus(stat1);
		statDAO.addStatus(stat2);
		statDAO.addStatus(stat3);
		
	}
}
