
public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reuses the same object
		String str = "test";
		System.out.println("This sting value is : " + str);
		
		//This creates a new string when its called
		String str1 = new String("test");
		System.out.println("This string value is: " + str1);
		
		//Array declaration 
		int arr[]; // or int[] arr;
		arr = new int[2]; //allocation memory for holding two items
		arr[0] = 0;
		arr[1] = 1;
		
		//Prints memory location
		System.out.println(arr);
		//Prints value in array at index 0
		System.out.println(arr[0]);
	}		

}
