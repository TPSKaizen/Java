package Lists;

import java.util.List;
import java.util.LinkedList;

public class LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("B");
		//Add C at the end
		list.addLast("C");
		//Add D at the beginning
		list.addFirst("D");
		//insert E at index 2
		list.add(2, "E");
		
		//remove the first instance of element with value B
		list.remove("B");
		
		//remove element at index 3
		list.remove(3);
		
		list.removeFirst();
		
		list.removeLast();
		
		System.out.println(list);
	}

}
