package section14_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class creatingNewExceptions_BestPractices {

	
	/*
	 * @param destination
	 * @param data
	 * @param partner
	 * @throws IOException
	 * @throws  IllegalArgumentException generated if destination < 0 || destination > 1
	 */
	
	//if destination is 0 - The data will be returned to a file then a script will push data to partner website
	// if destination is 1 - The send function will programmatically push the data to the partners web service
	public static String send(int destination, String data, String partner) throws IOException { // throws says I MIGHT throw X exception
		// TODO Auto-generated method stub
		
		System.out.println("\nInside of send...");
		String response = "success";
		
		if( destination < 0 || destination > 1 ){
			throw new IllegalArgumentException(); //since it is unchecked, we don't have to specify it in the msg signature. But we can if we want.
		}
		
		
		if(destination == 0) { //we aren't using FileOutputStream here because that class automatically generates an exception. We are generating it personally.
			throw new FileNotFoundException(); 

		} else if(destination == 1) { 
			//throw new IOException();
			response= "<result><code>success</code></result>"; //Assumed returned content - Breaking the contract, a numeric value is to be sent
		}
		
		System.out.println("\nEnd of send...");
		
		return response;
	}
}
//Effective java items :
/*
58. Used checked exceptions for recoverable conditions and runtime exceptions for programming errors 

65. Don't ignore exceptions 

63. Include failure-capture information in detail messages 

61. Throw exceptions appropriate to the abstraction
*/

//We cannot subclass Error or RuntimeException, so we CAN subclass Exception. Not throwable tho.