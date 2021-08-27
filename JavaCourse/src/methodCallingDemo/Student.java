package methodCallingDemo;

public class Student {
	/*
	 * 1. Make attributes private
	 * 2. Create getter for each attribute
	 * 3. Create setters for overwritting
	 */
	//to begin encapsulation, the properties must be private
	private String name;
	private int age;
	private String address;
	
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//GET functions allow for us to access private variable values but not modify them
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getAddress() {
		return this.address;
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
