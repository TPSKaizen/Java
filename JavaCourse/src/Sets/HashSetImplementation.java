package Sets;

import java.util.*;

public class HashSetImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Part of the set interface
		 * Keeps elements unique, no duplicates
		 * Hashsets access elements in a random fashion
		 */
		
		Set<String> hSet = new HashSet<String>();
		
		hSet.add("A");
		hSet.add("B");
		hSet.add("C");
		//the second A will not be added because set doesnt
		//tolerate duplicates
		hSet.add("A");
		
		System.out.println(hSet);
		
		//contains returns true or false based on if the element exists
		
		System.out.println("List contains 'A' : " + hSet.contains("A"));
		
		//remove removes an item
		hSet.remove("C");
		System.out.println(hSet);
		
		
		for(String item : hSet) {
			System.out.println(item);
		}
	}

}


