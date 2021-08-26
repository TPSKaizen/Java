package MultipleInheritance;

//you cannot inherit from multiple  classes but you can
//implement multiple inheritance with interfaces
//Can only extend one class
public class MountainBike extends TwoWheeler implements Bicycle, Vehicle {

	private int seatHeight;
	private int gear;
	private int speed;
	
	//no super because interface has nothing to initialize
	public MountainBike(
		int startHeight,
		int gear,
		int speed)
	{
		this.seatHeight = startHeight;
		this.gear = gear;
		this.gear  = speed;
	}
	
	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		this.speed -= decrement;
	}
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		this.speed += increment;
	}
	
	@Override
	public void canDrive() {
		// TODO Auto-generated method stub
		System.out.println("Can be driven");
	}
	
	public void lol() {
		System.out.println("Jeloo");
	}
	
	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MountainBike mb1 = new MountainBike(20,20,1);
		
		mb1.canDrive();
		mb1.canRotateWheels();
	}

	

}
