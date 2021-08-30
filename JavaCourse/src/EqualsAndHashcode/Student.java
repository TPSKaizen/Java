package EqualsAndHashcode;

public class Student {
	
	private String name;
	private int rollNumber;
	private String address;
	
	public Student(String name, int rollNumber, String address) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//GET functions allow for us to access private variable values but not modify them
	public String getName() {
		return this.name;
	}
	
	public int getRollNumber() {
		return this.rollNumber;
	}
	
	public String getAddress() {
		return this.address;
	}	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) //comparing foreign object with object of the class
			return true; //We are asking "Are these two references pointing to the same obj?
		
		//if the above doesnt hold true : 
		if (obj == null || obj.getClass() != this.getClass()) 
			return false;	//getClass returns the class type
							//So we are checking if they are of the same class type and checking for null
							//if either of these are true, then we have to return false cause the objs wouldnt be matching
		
		//Explicit casting
		Student student = (Student) obj;
		 
		//Defining custom business logic below
		// IN this example, we are identifying by rollNumber
		return (student.rollNumber == this.rollNumber);
	}
	
	@Override
	public int hashCode() {
		return this.rollNumber;
	}
	
	/*
	@Override
	public int hashCode() {
		return 1;
	}	//If you use this implementation, all the objects
		// will be stored at a single memory location
		// and hence when we are fetching, it will point to a single mem location
		// and equals will find the right obj we are trying to fetch
		*/
	
}
