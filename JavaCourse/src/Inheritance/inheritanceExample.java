package Inheritance;

public class inheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * You can have a base account class but then
		 * have different types of accounts like savings, checkings
		 * but they would all have some common behaviour and individually
		 * might have individual behaviour
		 */ 
		
		//we are able to access parent and child elements and methods
		MountainBike bike1 = new MountainBike(20,10,1);
		
		System.out.println("Gear is: " + bike1.gear);
		System.out.println("Seat height is: " + bike1.seatHeight);
		System.out.println("Bike speed is: " + bike1.speed);
		
		bike1.applyBrake(1);
		
		System.out.println("Bike speed is: " + bike1.speed);
		
	}

}
