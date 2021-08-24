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
		
		//Filtering logic
		
		List<String> langs = new ArrayList<>();
		
		langs.add("java");
		langs.add("python");
		langs.add("scala");
		
		//filtering to only contain strings that start with p
		List<String> filteredList = langs.stream().filter(x ->x.startsWith("p")).collect(Collectors.toList());
		
		System.out.println(filteredList);
	}

}
