package SectionNine.methodOverriding;

public class Staff extends User {
	public int id = 2;

	public void printId() {
		System.out.println("id: " + id);
		System.out.println("super.id: " + super.id);// Accessing 'hidden' variables.
		// Its called hidden because there is variable called id in both Staff and User
	}

	public void printUserType() {
		System.out.println("Staff");
	}

	public Review postAReview(String reviewText) {
		System.out.println("Staff: postAReview");
		Review review = super.postAReview(reviewText); // returns superClass implementation
		review.setApproved(true); // Extending behaviour of Superclass function.
		return review;
	}
}