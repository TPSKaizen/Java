package Sets;

import java.util.TreeSet;

public class TreeSetImplementation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * When we have to maintain the natural order of
		 * the elements automatically, we use treeSet
		 * Cannot have duplicates, not synchronized, not thread-safe
		 */
		
		TreeSet<String> tSet = new TreeSet<String>();
		//String here tells Java how to sort the tree set
		/* However, if you use a custom class, you have to tell java
		 * how to sort the elements
		 * It has similar methods to hashset
		 */

		
		tSet.add("B");
		tSet.add("A");
		tSet.add("C");
		tSet.add("C");
		
		System.out.println(tSet);
		// Will print A B C, the natural order is preserved
		

	}

}
