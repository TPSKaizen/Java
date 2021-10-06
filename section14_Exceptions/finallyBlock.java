package section14_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class finallyBlock {
	
	static void send(String filename) throws IOException {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(filename); //FileOutputStream uses OS resources to connect to the destination file. 
												  // These system resources, when done, have to be closed properly to avoid leaks via close()  
		}catch(FileNotFoundException e){
			
		}catch (IOException e) {
			
		} finally { //executes whether or not an exception is generated
			out.close(); 
		}
	}
}

//Control Flow: 
// If no exception is generated : try -> finally -> code after finally
// If exception is generated : skip rest of try -> is there an exception handler? :
// yes -> catch, finally, code after finally.
// no -> finally, but not code after finally -> pop method -> repeat in invoking method