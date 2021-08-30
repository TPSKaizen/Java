package EqualsAndHashcode;

public class explanation {
	
	/*
	 * Class Object
	 * 
	 * Every class has Object as a superclass.
	 * All objects, including arrays, implement methods
	 * from this class
	 * 
	 * Some methods from Object class include : 
	 * 
	 * 1. equals(Object obj)
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * 2. hashCode()
	 * Returns a hash code value for the object
	 * 
	 * 	Remember hashSet and how it maintains uniqueness automatically
	 *  It is because of the equals method implementation.
	 *  Uniqueness can be maintained automatically because
	 *  java knows how to to manage built in data types like String Integer, double Etc
	 *  
	 *  However, if you use a custom object like this :
	 *  
	 *  Set<Student> obj1 = new HashSet<Student>();
	 *  
	 *  ^^ Java doesn't know how to sort this, 
	 *  SO, we MUST override the equals method or else
	 *  the objects will be compared based on the reference
	 *  and not based on the actual obj values.
	 *  
	 *  Also, when you override equals, you must override
	 *  hashCode
	 */
}
