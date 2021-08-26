package StaticKeyword;

public class staticImplemenation {
	/*
	 * static keyword identfies an attribute or method as belonging to the Class
	 * This means that EVERY object instantiated will have the same copy
	 * of the static member variable or method
	 * 
	 * 
	 * You can have static variables and methods and constants
	 * 
	 * 	static final double PI = 3.141592653589793
	 * 
	 * E.g If you had a bicycle class, we can make a
	 * static vairable called numOfBicycles which would
	 * increment everytime an object is created and every
	 * obj created would have access to it
	 * 	
	 * 	private static int numOfBicycles = 0;
	 * 	
	 * E.g a function which returns the num of bicycles
	 * 
	 * public static int getNumOfBicycles(){
	 * 		return numberOfBicycles;
	 * }
	 * 
	 * Static methods can only access static variables
	 * 
	 * Non static methods can access static variables
	 * 
	 * Static blocks are ran only once when the class is loaded into the run time
	 */
}
