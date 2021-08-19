package DataTypesAndConversions;

public class ImplicitDataTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		System.out.println("Int representation: " + a);
		
		long b = a;
		System.out.println("Long representation: " + b);

		float c = b;
		System.out.println("Float representation: " + c);

		//smaller range variable can fit into larger range variable
		//larger range value has to lose value to fit into smaller range variable
		
		//smaller into large === implicit data conversion
	}

}
