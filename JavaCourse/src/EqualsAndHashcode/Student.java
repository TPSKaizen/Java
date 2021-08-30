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
	
}
