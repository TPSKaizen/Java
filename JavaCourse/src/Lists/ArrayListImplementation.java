package Lists;

import java.util.List;
import java.util.ArrayList;

public class ArrayListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Array based implementation of a list
		 * Indexed based implementation
		 * Accepts duplicates
		 * Not threadsafe
		 */
		
		//It is a good practice to declare with type of interface
		// then define concrete implementation on the right side
		List<Integer> arrayList= new ArrayList<Integer>(5);
		
		for (int i = 1; i <=5; i++) {
			arrayList.add(i);
		}
		
		//Printing elements
		System.out.println(arrayList);
		
		//Remove element at index 3
		arrayList.remove(3);
		
		//Displaying after deletion
		System.out.println(arrayList);
		
		//Printing elements one by one
		// .get literally gets the element at the specified index
		/*for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}*/
		
		for (int item : arrayList) {
			System.out.print(item + " ");
		}
	}

}
