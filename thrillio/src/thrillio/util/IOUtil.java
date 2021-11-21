package thrillio.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class IOUtil {
	public static void main(String[] args) {
		
	}
	
	public static void read(String[] data, String filename) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))){
				String line;
				int count = 0;
				while((line = br.readLine()) != null) {
					data[count] = line; //Read data into a provided String array
					count++;
				}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String read(InputStream in) {
		// TODO Auto-generated method stub
		StringBuilder text = new StringBuilder();
		
		try(BufferedReader bfR = new BufferedReader(new InputStreamReader(in, "UTF-8"))){ //tryWithResources & Decorator Pattern
			String line = "";
			while((line = bfR.readLine()) != null) {
				text.append(line).append("\n");
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return text.toString();
	}

	public static void write(String webpage, long id) {
		// TODO Auto-generated method stub
		
		try(BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/mcconnb1/eclipse-workspace/thrillio/pages/" + String.valueOf(id) + ".html")))){
				wr.write(webpage);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
