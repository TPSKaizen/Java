package Classes;

public class Student {

	 String name;
	 int age;
	 String address;
	
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
	
	@Override
	public String toString() {
		return ("Student name is " + this.getName() + ", age is: " + this.getAge() + ", address: " + this.getAddress());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A class is an blueprint of an object
		//An object is an instance of a class
		
		Student a1 = new Student("Brian", 22, "Barbados");
		
		System.out.println(a1.toString());
	}

}
