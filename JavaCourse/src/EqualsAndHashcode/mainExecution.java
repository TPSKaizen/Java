package EqualsAndHashcode;

public class mainExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Student john = new Student("John", 1 , "Hammy");
		Student john2 = new Student("John", 2 , "Hammy");
		Student john3 = new Student("John", 3 , "Hammy");
		
		//This will return false because they are different
		//memory locations
		System.out.println(john.equals(john2));
	}

}
