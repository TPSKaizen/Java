package Loops;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Do while loops - Runs body atleast once before checking condition
		
		int count = 10;
		
		do {
			System.out.println("Yo");
			count--;
		} while( count != 1);
		
		//While Loop 
		
		int count2 = 10;
		
		while(count2 != 2) {
			
			System.out.println("Brian");
			count2--;
		}
		
		//For Loop
		
		for(int i = 0; i < 10; i++) {
			System.out.println("I like pie");
		}
		
		//Enhanced for loops
		//Used for iterating over a collection or array of items
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for(int item : numbers) {
			System.out.println("Count is: " + item);
		}
	}

}
