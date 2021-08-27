package Recursion;

public class recursionImplementation {
	//Recursion is when a method calls itself
	
	int calculateFactorial(int n) {
		if (n == 1) //base or exit condition
			return 1;
		else 
			return (n * calculateFactorial(n-1));
	 		
	}
}

 	 