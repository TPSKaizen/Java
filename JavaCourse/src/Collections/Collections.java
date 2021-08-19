package Collections;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Interface, Abstract Class , Class
		
		//Interface
		/*
		 A declaration that tells me what kind of classes
		 will be under the interface.
		 
		  E.g If i had to store all the cars, bikes, trucks
		  from around the world, I create an interface 
		  called Vehicles and have all the individual classes.
		  
		  Its a generic blue print of specific class implementation
		 
		 //Set
		  * Will never contain any duplicates
		  
		 //List
		  * It can store anything, it is indexed based Collection
		  * Used for accessing things in a predefined sequence and one by one
		  * Order is fixed, holds duplicates
		 
		 //Queue
		  * First-In, First Out
		  * 
		 //SortedSet 
		  * Same as normal set but sorted in some way
		  
		 //Deque
		  * Double ended queue. Insertion and Deletion from the front and back
		 */
		
		//Abstract Classes
		/*
		 * Similar to interfaces as they provide a generalization
		 * but they also provide a way to write complete implementation
		 * There would be some sort of common logic between all the classes
		 * E.g Having an account class then having different versions of the accounts
		 * class like savings, checkings , child etc
		 * 
	
		 */
		
		//Class
		//A concrete blueprint which hold logic and data together
		
		//ArrayList - Index based, Ordered, can have duplicates
		// ArrayLists are dynamic and not static, so they can grow and shrink without errors
		
		//LinkedList - Accessing elements based on the previous and next element
		// Items can only be accessed in a sequence starting from Head to the Tail
		// Uses pointers to access next item
		
		//Hash set - Doesn't honour the order elements are inserted in.
		//Everytime u access the elements, the order will be different
		
		//Tree set	- You can have order with accessing elements
		
		//PriorityQueue - FIFO, allows for overriding fifo with priority
		
		//Stack - LIFO
		
		//Vector - Similar to lists, thread-safe (Where 2 threads cant modify the same element at the same time)
	}

}
