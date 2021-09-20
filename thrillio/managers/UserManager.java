package thrillio.managers;

import thrillio.Daos.UserDao;
import thrillio.entities.User;

public class UserManager {
	//Create Singleton
	public static UserManager instance = new UserManager();
	private UserManager() {}
	
	public static UserManager getInstance() {
		return instance;
	}
	
	/* DAO LAYER instantiation */
	private static UserDao dao = new UserDao();
	
	//Method for instantiating user
	public User createUser(long id, String email, String password, String firstName, String lastName, int gender, String userType) {
		User user = new User();
		
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		
		return user;
	}
	
	//This method originates from DAO. 
	//This method will be invoked by the controller layer
	
	public User[] getUsers() {
		return dao.getUsers();
	}
	
}
