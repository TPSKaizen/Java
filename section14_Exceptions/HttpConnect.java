package section14_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HttpConnect {

	
	/*
	 * @param destination
	 * @param data
	 * @param partner
	 * @throws IOException
	 * @throws  IllegalArgumentException generated if destination < 0 || destination > 1
	 */
	
	public static void send(int destination, String data, String partner) throws IOException { // throws says I MIGHT throw X exception
		// TODO Auto-generated method stub
		//if destination is 0 - The data will be returned to a file then a script will push data to partner website
		// if destination is 1 - The send function will programmatically push the data to the partners web service
		
		System.out.println("\nInside of send...");
		
		//pre-conditions are restrictions on arguments to be passed. This is done by param validation
		if( destination < 0 || destination > 1 ){
			throw new IllegalArgumentException(); //since it is unchecked, we don't have to specify it in the msg signature. But we can if we want.
		}
		
		
		if(destination == 0) { //we aren't using FileOutputStream here because that class automatically generates an exception. We are generating it personally.
			
			//We are assuming that the file is missing while writing. This would qualify as an 'exceptional' situation.
			// Exceptions should only be generated in 'exceptional' situations. Keyword to use: throw
			throw new FileNotFoundException(); //throws is added in the signature because the invoking code that uses send needs to know that this exception can be thrown.
		  // When the exception is thrown, it checks if there is any error handling code inside the function that threw it, 
		  // if not, it delegates to the method invoking it(share)
		  // and this method gets popped off the stack

		} else if(destination == 1) { //if the partners server is down, an I/O exception will be thrown
			throw new IOException();
		}
		
		System.out.println("\nEnd of send...");
	}

}

//Exceptions can be referenced polymorphically. FileNotFoundException is a subclass of IOException,
//So in the message signature, we can just say IOException