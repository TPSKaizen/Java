package StaticKeyword;

public class Student {


	 String name;
	 int age;
	 String address;
	 static String college;
	 static int count;
	 
	 static { //everything in the static block is already declared as static
			System.out.println("initialzer code");
		     college = "XYZ";
			 count = 0;
		}
	
	//Constructor, public to be accessible to the outside world
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	String getCollege() {
		return college;
	}
	
	@Override
	public String toString() {
		return ("Student name is " + this.getName() + ", age is: " + this.getAge() + ", address: " + this.getAddress());
	}
}
