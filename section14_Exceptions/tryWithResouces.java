package section14_Exceptions;

import java.io.FileInputStream;

public class tryWithResouces {
		//standard template from before java 7 for reading form a file
	
	/*
	FileInputStream in = null;
	try {
		in = new FileInputStream(filename); // open stream
		//read data
	} catch(FileNotFoundException e) {
		//Recovery code
	} finally {
		try {
			if(in != null) {
				in.close();
			}
		} catch(IOException e) {
			
		}
	}
} */
	
	//After Java 7 : try-with-resources
	
	/*
	
	try(FileInputStream in = new FileInputStream(filename)){ //resources created inside try paranthesis
		//Read data
	} catch(FileNotFoundException e) {
		...
	} catch(IOException e) { //the close() which is implicit can throw an IOException
		...
	} 
	//by this method, the close() is done implicitly and the finally block is written into the byte code
	//the resource created in the try block is implicitly final.
	
	//Example with multiple resources being created
	
	try(FileInputStream in = new FileInputStream(filename);
		FileOutputStream out = new FileOutputStream(filename)){
		//Read data
	} catch(FileNotFoundException e) {
		
	} catch (IOException e) {
		
	} */ //Resouces will be closed in reverse order even if there was a failure in creating one
	
	
	// General Syntax : try(java.lang.AutoCloseable) { ... } 
	//catch or finally not required if the close method implemented doesn't throw an exception.
	// code within the try shouldnt throw an exception
	
	//If we aren't using autoclosable resources, we have to use the old version.
	
	//AutoCloseable Hierarchy (Some subtypes of autoClosable)
	
	// java.net.Socket & java.util.Scanner -> java.io.Closeable -> java.lang.AutoClosable 
	// javax.sql.ResultSet -> java.lang.autoCloseable
	// javax.sound.sampled.Link -> java.lang.autoClosable
}
