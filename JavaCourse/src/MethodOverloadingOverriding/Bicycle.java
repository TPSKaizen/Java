package MethodOverloadingOverriding;

public class Bicycle {
	//children can access these
		protected int gear;
		protected int speed;
		
		protected Bicycle(int startSpeed, int startGear) {
			gear = startGear;
			speed = startSpeed;
		}
		
		protected void setGear(int newVal) {
			gear = newVal;
		}
		
		protected void applyBrake(int decrement) {
			speed -= decrement;
		}
		
		protected void speedUp(int increment) {
			speed += increment;
		}
}
