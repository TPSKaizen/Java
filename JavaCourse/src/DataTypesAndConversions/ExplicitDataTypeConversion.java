package DataTypesAndConversions;

public class ExplicitDataTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 50.50;
		System.out.println("Double representation " + a);
		
		//Below is type casting.
		//Explicitly cast the variable on the right into the type of the variable on the left
		//This has to be done when starting a larger type variable into a smaller
		float f = (float)a;
		System.out.println("Float representation " + f);
		
		long b = (long)a;
		System.out.println("Long representation " + b);
		
		int c = (int)b;
		System.out.println("Int representation " + c);
	}

}
