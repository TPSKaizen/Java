package thrillio.Controllers;

public class UserController {
	//Implement Singleton Pattern
	private final UserController instance = new UserController();
	private UserController() {}
	
	public final UserController getInstance() {
		return instance;
	}
	
}
