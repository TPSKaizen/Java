package exceptionHandling;

public class tryCatchDemo {
	/*
	 * Structure: 
	 * 
	 * try { 
	 * 		
	 * } catch (ExceptionType name) {
	 * 		//exception handling logic
	 * 
	 * } catch (ExceptionType name) {
	 * 
	 * 
	 * }
	 * 
	 * If the first catch block matches, the 2nd will not be executed
	 * 
	 * try {
	
		} catch (IndexOutOfBoundsException e) {
		    System.err.println("IndexOutOfBoundsException: " + e.getMessage());
		} catch (IOException e) {
		    System.err.println("Caught IOException: " + e.getMessage());
		}
		
		//Catching More Than One Type of Exception with One Exception Handler
		ONLY IF THE LOGIC OF PROCESSING BOTH IS THE SAME
		
		catch (IOException|SQLException ex) {
		    logger.log(ex);
		    throw ex;
		}
		
		
		Finally block is used for clean up
		
		The following finally block for the writeList method cleans up and then closes the PrintWriter.

			finally {
		    if (out != null) { 
		        System.out.println("Closing PrintWriter");
		        out.close(); 
		    } else { 
		        System.out.println("PrintWriter not open");
		    } 
		    
		    
		    //Another use case is closing a DB connection
}
	 */
}
