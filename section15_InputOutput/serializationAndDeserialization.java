package section15_InputOutput;

import java.io.BufferedInputStream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serializationAndDeserialization {

	/*
	 *  Serialization is the process of turning java
	 *  objects into byte streams and saving them to 
	 *  some destination.
	 *  
	 *  Deserialization is constructing the java object
	 *  back from their byte streams. 
	 */
	
	/*
	 * Serialization process
	 * 
	 * 1. Implement marker java.io.Serializable
	 * 2. ObjectOuputSteam & ObjectInputStream
	 * 	a. Implement ObjectOutput and ObjectInput
	 * 
	 * ObjectOutputStream is for serialization and 
	 * ObjectInputStream is for deserialization
	 */
	
	
	/*
	 * Serialization Example :
	 * 
	 * ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputSteam(new FileOutputStream("object.ser")));
	 * 
	 * BufferedOutputStream is only needed for performance reasons. So ObjectOutputStream can be directly chained to FileOutputStream
	 * 
	 * To Write An Object : 
	 * out.writeObject("The current Date and Time is"); //a String object
	 * out.writeObject(new Date()); //a Date object
	 */
	
	/*
	 * Deserialization Process
	 * 1. Read serialized Object
	 * 2. Find serialized object's class name & load Class Object
	 * 3. Deserialization fails if ,
	 * 	- Class Object cannot be loaded
	 * 	- version mismatch
	 * 
	 * 4. Create new object on heap & restore its state, i.e object's constructor is not run
	 * 	- if there is non-serializable ancestor then 
	 * 	  run ancestor's constructor & any constructors above that (even if they're serializable)
	 * 
	 *  - Instance variables get serialized state
	 *  - Default variables get default values
	 *  
	 */
	
	
	/*
	 *  serialVersionUID
	 *  
	 *  1. Every serializable class has a version ID computed from class structure called : serialVersionUID
	 *     Everytime the class structure changes, the version ID changes.
	 *     
	 *  When an object is seralized, the object is stambed with the version ID of the instance at that time
	 *  
	 *  When an object is deserialized, the version ID of the serialized object will be compared with the version of the class
	 *  
	 *  serializedObj.serialVersionUID = class.serialVersionUID
	 *  
	 *  How can class evolve without hurting deserialization?
	 *  Solution : Make serialVersionUID constant
	 */
	
	/*
	 * Deserialization Example : 
	 * 
	 * ObjectInputStream in = new ObjectInputStream( new BufferedInputStream ( new FileInputStream("object.ser")));
	 * 
	 * Objects need to be deserialized in the order that they were serialized.
	 * 
	 * The method used is readObject() and it returns an Object, so it must be downcasted.
	 * 
	 * String str = (String) in.readObject();
	 * Date date = (Date) in.readObject();
	 *
	 */
	
	/*
	 * Changes that don't affect deserialization: 
	 * 1. add/delete instance variables
	 * 2. making instance variables static
	 * 3. Changing instance variables from transient to non-transient 
	 * 4. changing access levels of variables
	 * 5. add/remove classes to/from inheritance tree.
	 */
	
	/*
	 * Changes that affect deserialization
	 * 1. Changing instance variable's type 
	 * 2. Making serializable class(anywhere in object graph) non-serializable
	 */
	
	/*
	 * Serialization Use-cases
	 * 
	 * 1. Important Webpages with frequent reads. 
	 *  a. Serialize to disk or perform caching (e.g memcached)
	 *  
	 * This is done because DB operations which return information
	 * to the front end are expensive and reduce response times.
	 * 
	 * If the content is not being change frequently, a java object
	 * can be created when the page is accessed for the first time,
	 * and we can serialize the object and every subsequent access to the site
	 * can be built via the serialized object
	 * 
	 * 2. Passing java objects to remote hosts (web services)
	 * 
	 * 3. Post-mortem analysis :
	 * If an object is causing an error, serialize it from the 
	 * catch block and then deserialize it in the debugger
	 */
	
	/* Serialization Facts 
	 * 1. Primitives & Arrays are by default serializable
	 * a. If an object is serialized , any primitives & arrays within it are ALSO serialized
	 * b. They are passable directly to the writeObject function
	 * 
	 * 2. Serialization saves the entire object graph
	 * 	a. If a an object is serialized then any object it references
	 *     or any objects those objects referenced will be serialized
	 *     
	 *  b. If one object in the chain is not serializable, then serialization fails
	 *  c. Objects with multiple references are only saved once
	 *  
	 *  3. Static variables are not serialized
	 *  	a. During deserialization, the static variable
	 *  	   will be assigned the value the class has at that
	 *  	   instance of time.
	 *  
	 *  4. If a superclass is serializable -> Subclass is serializable 
	 *  
	 *  5. If a superclass isn't serializable then its possible for a subclass to be serializable
	 *  
	 *  6. "transient" on an instance variable means it won't be serialized.
	 *     But, during deserialization, the variable gets a default value
	 */
	
	public static class SerializableDemo implements Serializable {
		/**
		 * 
		 */
		//private static final long serialVersionUID = 1L;
		private String name;
		private transient int id = 5;
		public String getName() {return name;}
		public void setName(String name) {this.name = name;}
		
		public int getId() {return id;}
	}
	
	public void doSerialization() {
		// TODO Auto-generated method stub
		
		SerializableDemo sDemo = new SerializableDemo();
		
		sDemo.setName("Brian");
		
		System.out.println("name before serialization : " + sDemo.getName());
		System.out.println("id before serialization : "  + sDemo.getId());
		
		
		try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("serial.ser")))){
			out.writeObject(sDemo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doDeserialization() {
		// TODO Auto-generated method stub
		
		
		try(ObjectInputStream in = new ObjectInputStream( new BufferedInputStream( new FileInputStream("serial.ser")))){
			SerializableDemo sObject = (SerializableDemo) in.readObject();

			System.out.println("name after serialization : " + sObject.getName());
			System.out.println("id after serialization : "  + sObject.getId());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
		public static void main(String[] args) {
		
		new serializationAndDeserialization().doSerialization();
		
		new serializationAndDeserialization().doDeserialization();
	}

}
