package section14_Exceptions;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class tryWithResourcesDemo {
	static String inFileStr = "walden.jpg";
	static String outFileStr = "walden-out.jpg";
		
	public static void fileCopyWithArm() throws IOException {
		System.out.println("\nInside fileCopyWithArm ...");				
		
		try (Test t = new Test(); Test2 t2 = new Test2(); Test3 t3 = new Test3();
				BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\mcconnb1\\eclipse-workspace\\javaCourseUdemy\\src\\section14_Exceptions\\" + "potato"));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\mcconnb1\\eclipse-workspace\\javaCourseUdemy\\src\\section14_Exceptions\\" + outFileStr));
						BufferedInputStream in2 = new BufferedInputStream (new FileInputStream("C:\\Users\\mcconnb1\\eclipse-workspace\\javaCourseUdemy\\src\\section14_Exceptions\\test1.jpg"));	
				BufferedOutputStream out2 = new BufferedOutputStream(new FileOutputStream("C:\\Users\\mcconnb1\\eclipse-workspace\\javaCourseUdemy\\src\\section14_Exceptions\\" + "completedtest1.jpg"))
				) { //If an exception is generated in the CREATING of a resource, the following resources in the try block will not be created.
			
			byte[] byteBuf = new byte[4000];
			int numBytesRead;
			while ((numBytesRead = in.read(byteBuf)) != -1) {
				out.write(byteBuf, 0, numBytesRead);
			}		
				System.out.println("Hello");
			//throw new FileNotFoundException("Important Exception!!");	//the exception thrown here is seen as more significant than the trivial ones thrown when resources are closed
		} 
	}	
	
	public static void main(String[] args) {
		try {
			System.out.println("\nInside main..");
			fileCopyWithArm();
			System.out.println("\nAfter fileCopyWithArm execution");
		} 
			/* This is for logging the supressed exceptions
			Throwable[] throwables = e.getSuppressed();
			System.out.println(throwables[0].getMessage());
			System.out.println(throwables[1].getMessage());
			*/
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("\nAfter try and catch block inside main");
	}
}

//Surppressed exceptions are generated by the close() method.
class Test implements AutoCloseable {
	@Override
	public void close() throws IOException {
		throw new IOException("Trivial Exception");			
	}		
}

class Test2 implements AutoCloseable {
	@Override
	public void close() throws IOException {
		throw new IOException("Trivial Exception 2");			
	}
	
}
	
class Test3 implements AutoCloseable {

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		throw new FileNotFoundException("Trival Exception 3?");
	}
}