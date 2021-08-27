package ExceptionsInJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class checkedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("C:\\test\\a.text");
		BufferedReader fileInput = new BufferedReader(file);
		
		//Print first 3 lines of file
		for(int i = 0 ; i < 3; i++) {
			System.out.println(fileInput.readLine());
			
			fileInput.close();
		}
	}

}
