package Map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class hashMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Key = String, Value = Integer
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		
		//Inserting
		hMap.put("a", 10);
		hMap.put("b", 20);
		hMap.put("c", 30);
		
		// Removing the existing key mapping
		Integer returned_value = (Integer)hMap.remove("b");
		
		 // Verifying the returned value
	    System.out.println("Returned value is: "+ returned_value);
		
		System.out.println("Size of map is: - " + hMap.size());
		System.out.println(hMap);
		
		//checking if Key exists
		if(hMap.containsKey("a")) {
			Integer a = hMap.get("a"); //returns value that 'a' is pointing to
			System.out.println("Value for key" + " \"a\" is : - " + a);
		}
		
		//iterating over all keys via keySet
		for(String key : hMap.keySet()) {
			//for every key in hMap keySet print the key and the value the key is pointing to
			System.out.println("key: " + key + ", value: " + hMap.get(key)); 
		}
		
		//if we know both the key and value and we just want to iterate over every entry
		for(Entry<String, Integer> entry : hMap.entrySet()) {
			System.out.println("key " + entry.getKey() + ", value: " + entry.getValue());
		}
		
		
	}

}
