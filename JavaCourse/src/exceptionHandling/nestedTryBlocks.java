package exceptionHandling;

public class nestedTryBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				try {
					int arr[] = {1,2,3,4};
					
					System.out.println(arr[10]); 
				} catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBoundsException in block 3");
					throw e; // throws to block 2
				}
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBounds Exception in block 2");
				throw e; //throws to block 1
			}
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBounds Exception in block 1");
	
		}
		catch (Exception e5) {
			System.out.println("General exception");
		} // showing that you can write a catch block without a try block
		// but clearly, it doesn't make sense lol
	}

}
