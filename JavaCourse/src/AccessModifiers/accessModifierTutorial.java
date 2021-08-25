package AccessModifiers;

public class accessModifierTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Access Levels
		 * Class	Package		Subclass	World
public		 Y		   Y            Y         Y
protected	 Y         Y            Y         N
no modifer	 Y         Y            N         N
private		 Y         N            N         N
		 */
		
		Test t1 = new Test();
		t1.display();
	}

}
