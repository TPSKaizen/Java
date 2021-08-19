package ControlFlow;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 6;
		
		String monthString;
		
		switch(month) {
		case 1: 
			monthString = "January";
			break;
			
		case 2: 
			monthString = "February";
			break;
			
		case 3: 
			monthString = "March";
			break;
			
		case 4: 
			monthString = "April";
			break;
			
		case 5: 
			monthString = "May";
			break;
			
		case 6: 
			monthString = "June";
			break;
			
		default:
			monthString = "Invalid Month";
			break;
		}
			System.out.println(monthString);
	}

}
