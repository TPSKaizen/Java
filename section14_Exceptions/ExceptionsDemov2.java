package section14_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemov2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("\nInside of main...");
		share();
		System.out.println("\nEnd of main");
	}

	private static void share() throws FileNotFoundException { 
		System.out.println("\nInside share...");

		try {
			String response = creatingNewExceptions_BestPractices.send(1, "hello", "http://www.goodsnips.com");
			System.out.println("\nAfter invoking send...");
			APIParser.parseSendResponeCode(response, "hello", "http://www.goodsnips.com");
			//creatingNewExceptions_BestPractices.send(0, "hello", "http://www.goodsnips.com");
		} catch (FileNotFoundException e) {
			System.out.println("Share: filenotfoundexception..");
			throw e;
		} catch (IOException e) {
			
			System.out.println("Connecting to a different server");
		} catch (APIFormatChangeException e) {
			//e.printStackTrace();
			
			//Item 63: Include failure-capture information in detail messages 
			/*
			 * This suggests to take as much information as possible from the context in which it has been generated
			 *  E.g We can use all params, any relevant instance variables. This can be done because in Throwable there is
			 *  a constructor that takes String as an input.
			 */
			
			//System.out.println("e.toString msg: " + e.toString()); //prints the first line and not the entire stack trace
			
			//System.out.println("e.getMessage():  " + e.getMessage()); //prints only the additional information
			
			//System.out.println("e.getElementName(): " + e.getElementName()); //Getting an individual param
			
			//e.getCause().printStackTrace(); //Prints only the lower level exception
		
		}

		System.out.println("\nEnd of share....");
	}
}
