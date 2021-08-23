package Map;

import java.io.*;
import java.util.Map.Entry;
import java.util.TreeMap;

public class treeMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*
		 * Will naturally be sorted/order
		 */
		
		/* If you have a custom key, you have to provide a custom
		 * implementation for sorting
		 */
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		
		//Inserting
		tMap.put(3, "A");
		tMap.put(4, "A");
		tMap.put(2, "B");
		tMap.put(1, "C");
		
		//Deleting via key
		tMap.remove(2);
		
		//Traversing
		//This will print according to key incremental order
		for(Entry<Integer, String> entry : tMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
		}
		
		//replacing
		tMap.replace(1, "knull");
		
	
		//Identifying
		Boolean found = tMap.containsKey(2);
		System.out.println(found);
		
		System.out.println(tMap);
		
	}

}
