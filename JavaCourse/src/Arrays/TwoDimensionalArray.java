package Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//each of the inner curly braces represents a row
		// so we have three rows here
		//Two Dimensional arrays deal with rows and columns
		int[][] arr = { {2,7,9}, {3,6,1}, {7,4,2} };
		
		for(int i = 0; i< 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	
}
