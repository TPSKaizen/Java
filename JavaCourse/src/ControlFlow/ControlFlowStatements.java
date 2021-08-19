package ControlFlow;

public class ControlFlowStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if else
		int testscore = 76;
		char grade;
		
		if(testscore >= 90) {
			grade = 'A';
		} else if (testscore >= 80) {
			grade ='B';
		} else if (testscore >= 70){
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
		
		//Ternary Operator
		
		int a = 1;
		int b = 2;
		int result = a < b ? a : b;
		
		System.out.println(result);
	}

}
