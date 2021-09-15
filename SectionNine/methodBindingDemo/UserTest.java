package SectionNine.methodBindingDemo;

public class UserTest {

	public void printUserType(User u) {
		u.printUserType();
	}

	public void approveReview(Staff s) {
		if (s instanceof Editor) {
			((Editor) s).approveReview();
		} else {
			System.out.println("Invalid object passed!!");
		}
	}

	public static void main(String[] args) {
		// Part 1
		/*
		 * User user = new User(); User staff = new Staff(); User editor = new Editor();
		 */

		// staff.postAReview("");

		// ((Staff)staff).printId();

		/*
		 * UserTest ut = new UserTest(); ut.printUserType(user);
		 * ut.printUserType(staff); ut.printUserType(editor);
		 */

		// Part 2
		// editor.approveReview();
		// editor.postAReview("");
		// editor.saveWebLink();

		// Casting & instanceof demo
		// UserTest ut = new UserTest();
		// ut.approveReview(new Staff());
		// ut.approveReview(new Editor());

		// Method binding demo
		User staff = new Staff();
		staff.staticMethod(); // part 1
		// staff.postAReview("");
		// staff.instanceMethod(10); // part 2
		/*
		 * the above instance method is NOT being overriden. When you have similar
		 * method names for instance methods but they are not being overriden, the
		 * compiler will start at the super class and look downwards for a compatiable
		 * method.
		 */
		// staff.instanceMethod(new Staff());

		// ((Staff) staff).staticMethod();
	}
}