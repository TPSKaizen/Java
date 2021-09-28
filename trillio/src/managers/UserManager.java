package managers;

import dao.UserDao;
import trillio.entities.User;

public class UserManager {
	/* Singleton Pattern */

	/*
	 * This is how we create an instance without letting clients be able to create
	 * their own instances
	 */

	// Step One : Create instance and private constructor
	// Step Two : Method for instantiating user

	private static UserManager instance = new UserManager(); // 1
	// Private constructor means clients cannot make instances freely
	
	//DAO Layer 
	private static UserDao dao = new UserDao();
	
	private UserManager() {
	}

	public static UserManager getInstance() {
		return instance;
	} // 2
	
	

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender, String userType) {
		User user = new User();
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setPassword(password);
		user.setUserType(userType);
		user.setId(id);
		
		return user;
	}
	
	public User[] getUsers() {
		return dao.getUsers();
	}
}
