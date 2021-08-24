package StacksAndQueues;

import java.util.Stack;

public class stackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Used for maintaining a LIFO representation of objects
		 */
		
		Stack<String> myStack = new Stack<String>();
		
		myStack.push("Barbados");
		myStack.push("Antigua");
		myStack.push("Trinidad");
		
		//will print in the order that it was inserted in
		System.out.println(myStack);
		
		String poppedElem = myStack.pop();
		
		System.out.println("Popped : " + poppedElem + " " + myStack);
		
		//Shows whats at the top of the stack without deleting
		System.out.println(myStack.peek());
	}

}
