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
	 *  
	 *  Hashcode is a memory bucket where the object is stored.
	 *  It's essentially a memory location
	 *  
	 *  with HashSet and HashMap, we have to override both methods 
	 *  
	 *  with a hashSet or hashMap, when an item is fetched or a similar methed
	 *  is used like contains, the hashCode of the obj is calculated to determine 
	 *  what is returned.
	 *  
	 *  IT IS POSSIBLE TO HAVE MULTIPLE OBJ in ONE MEMORY LOCATION
	 *  
	 *  So if there are multiple objects, then java runs the equals method
	 *  to find the exact matching object
	 *   
	 *   E.g
	 *   
	 *   Memory locations: 1 2 3 4 5
	 *   
	 *   hashCode comes up to : memory location 2 
	 *   
	 *   Then at location 2 we have : 
	 *   2 - Obj1, Obj2, Obj3 
	 *   
	 *   If this is the case, java will use the equals method
	 *   to compare the john object with objects in memory location
	 *   to search for a match.
	 *   
	 *   Both of these should be overriden for a hashSet/hashMap collection
	 *   because we dont know when and where the classes will be stored in hashSet/hashMap
	 *   
	 *   The thumb rule for overriding hash code is to use the same parameters used
	 *   in the equals contract in the hashCode contract
	 */
}
