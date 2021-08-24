package StacksAndQueues;

import java.util.PriorityQueue;
import java.util.Queue;

public class queueImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Fifo arrangement
		 */
		
		//if you provide a custom class you have to specify the sorting method
		Queue<String> myQueue = new PriorityQueue<String>();

		myQueue.add("Cartiga");
		myQueue.add("Barbados");
		myQueue.add("Antigua");
		myQueue.add("Jamaica");
		
		for(String i : myQueue) {
			System.out.println(i);
		}
		
		//Will not print in order because .toString is being called which calls
		//the abstract class' toString method which DOESNT understand sorting
		System.out.println("Original Queue: " + myQueue);
		
		//when we add, remove or indentify an item, java will honour the order
		
		System.out.println(" at head : " + myQueue.peek());
		System.out.println("Removed item : " + myQueue.remove());
		System.out.println(" at head: " + myQueue.peek());
		System.out.println("Removed item : " + myQueue.remove());
		System.out.println(" at head : " + myQueue.peek());
		
		//poll will return the head value AND remove it
		System.out.println("Removed item : " + myQueue.poll());
		
		
	}

}
