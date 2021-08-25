package Inheritance;

class MountainBike extends Bicycle{
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
