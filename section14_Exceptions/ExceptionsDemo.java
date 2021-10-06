package section14_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nInside of main...");
		share();
		System.out.println("\nEnd of main");
	}
	
	private static void share() { //share has to handle the exception that can thrown by send method
		System.out.println("\nInside share...");
		
		try {
			HttpConnect.send(0, "hello", "http://www.goodsnips.com");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// Recovery code is written in the catch block
			e.printStackTrace();
		} // catch blocks can also throw the exception, but if we do that, in our case, the main method will have to handle it since main is calling the share method
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Connecting to a different server");
		} 
		
		System.out.println("\nEnd of share....");
	} // If you don't want share() to handle the exception, but want the method invoking share to handle it, 
	  // add throws keyword and Exception name to method signature as we did with send. 
	  // When you do this, none of the code below where send() was call will be reached because share() will be popped off the stack.
}

//We can get rid of the first catch block since we can catch exceptions polymorphically, but it is good to have 
// recovery code for the different types of exceptions, so your logic depends on the situation.
// Runtime errors aren't caught because we want the program to fail when they occur.