package EqualsAndHashcode;

public class mainExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Student john = new Student("John", 1 , "Hammy");
		Student john2 = new Student("John", 1 , "Hammy");
		Student john3 = new Student("John", 3 , "Hammy");
		
		/*
		 * With the default equals method, this will return false
		 * with the custom implemented equals method, it will return true
		 * because we are basing it on rollNumber
		 */
		System.out.println(john.equals(john2));
	}

}
