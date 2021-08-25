package Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class StreamsMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = new ArrayList<>();
		
		numList.add(10);
		numList.add(20);
		numList.add(30);
		numList.add(40);
		
		for(int i : numList) {
			System.out.println(i);
		}
		
		//If we needed to calculate the square of each
		//of the elements in list and create a new list.
		//Without streams we would use the following code:
		
		/*List<Integer> squareList = new ArrayList<>();
		for(int i : numList) {
			squareList.add(i*i);
		}*/
		
		//new way with streams
		List<Integer> squareList = numList.stream().map(x -> x*x).collect(Collectors.toList());
		//numList.stream() turns it into a stream, meaning sent 1 by 1
		//.map() changes the representation of the elements one by one
		//.collect() turns the stream back into a specified collection
		
		//Turning a list into a set
		
		Set<Integer> squareSet = numList.stream().map(x -> x*x).collect(Collectors.toSet());
		
		System.out.println(squareSet);
		
		//Filtering/ conditional logic
		
		List<String> langs = new ArrayList<>();
		
		langs.add("ziara");
		langs.add("java");
		langs.add("python");
		langs.add("scala");
		langs.add("Anthon");
		
		//filtering to only contain strings that start with p
		List<String> filteredList = langs.stream().filter(x ->x.startsWith("p")).collect(Collectors.toList());
		
		System.out.println(filteredList);
		
		//Stream API for sorting and iterating
		
		//E.g Natural sorting order
		
		List<String> sortedList = langs.stream().sorted().collect(Collectors.toList());
		
	
		
		//Iterating over collection with enhanced for loop
		for(String i : sortedList)
			System.out.println(i);
		
		//Iterating over collection with streams
		langs.stream().forEach(i -> System.out.println("Element is : " + i));
		
		//Iterating over collection with streams and applying multiple lines of logic
		langs.stream().forEach(i -> {
			i+= " is a language";
			System.out.println("Element is : " + i);
		});
	}

}
