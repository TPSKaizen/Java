package Interfaces;

public class MountainBike implements Bicycle{

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
		
		MountainBike mb1 = new MountainBike(20,10,1);
		
		System.out.println(mb1.getSpeed());
		mb1.speedUp(20);
		System.out.println(mb1.getSpeed());
		mb1.applyBrake(11);
		System.out.println(mb1.getSpeed());
	}
	

}
