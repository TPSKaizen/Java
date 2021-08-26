package MethodOverloadingOverriding;

public class MountainBike extends Bicycle {
	
protected int seatHeight;
	
	protected MountainBike(int startHeight,
			int startSpeed,
			int startGear) {
		//use super as the first keyword
		super(startSpeed, startGear);
		this.seatHeight = startHeight;
	}
	
	protected void setHeight(int newVal) {
		this.seatHeight = newVal;
	}
	

	protected void setGear(int newVal) {
		gear = newVal + 10;
	}
	
	protected void applyBrake(int decrement) {
		speed = speed - decrement - 10;
	}
	
	protected void speedUp(int increment) {
		speed = speed + increment + 15;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MountainBike mb1 = new MountainBike(20,30,0);
		
		System.out.println(mb1.speed);
		mb1.speedUp(5);
		mb1.applyBrake(2);
		System.out.println(mb1.speed);
	}

}
