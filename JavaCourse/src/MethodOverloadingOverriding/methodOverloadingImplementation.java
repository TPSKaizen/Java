package MethodOverloadingOverriding;

public class methodOverloadingImplementation {
	
	//Overloading functions must have the same name
	//Can have different return type
	//Can have more or less argumentss
	
	public int multiply(int x, int y) {
		return (x*y);
	}
	
	public int multiply(int x, int y, int z) {
		return (x*y*z);
	}
	
	public double multiply(double x, double y) {
		return (x * y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Polymorphism is when an entity takes multiple forms
		 * 
		 */
		
		methodOverloadingImplementation demo = new methodOverloadingImplementation();
		
		System.out.println(demo.multiply(2.231, 5.123213));
		System.out.println(demo.multiply(2,4));
		System.out.println(demo.multiply(10,20,30));
		
	}

}
