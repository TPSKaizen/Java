package SectionNine.polymorphismExample;

public class UserTest {
	public void printUserType(User u) {
		u.printUserType();
	}

	// Object Casting
	public void approveReview(Staff s) {
		if (s instanceof Editor) // we have to do this because s can be of other types
			((Editor) s).approveReview();
		else
			System.out.println("Invalid Object Passed");
	}

	public static void main(String[] args) {
		// Part 1
		// Implicit Casting example
		// With Implicit casting, the objet on the right had side can't utilize its own
		// methods unless they are already defined in the superclass
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();
		Editor e1 = new Editor();

		UserTest ut = new UserTest();
		// ut.printUserType(user);
		// ut.printUserType(staff);
		// ut.printUserType(editor);

		// Part 2

		// editor.approveReview(); // Not in User class so it will throw an error
		editor.postAReview(); // Will search the inheritance tree from Editor and go up. So since there is an
								// implementation in Staff, that one will be executed
		editor.saveWebLink(); // Will execute from User since no implementation exists in either Editor or
								// Staff

		editor.printUserType();

		// OBJECT CASTING
		// ut.approveReview(new Editor());
	}
}