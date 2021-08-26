package Abstraction;

public class abstractionImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Used to hide something or some detail of an object
		 *  from the outside world.
		 *  
		 *  E.g Driving a car and accelerate , you press the pedal,
		 *  but there are many different components that work when u push the pedal
		 *  
		 *  To the user, we show the ability to push the pedal
		 *  but we don't show all the intricacies
		 *  
		 *   Abstract Classes cannot be instantiated, but they can be subclassed
		 *   So we cannot call its constructor, but we can extend it and make a child class
		 *   
		 *   Abstract methods can only be declared but not implemented
		 *   We cant say what the method actually does.
		 *   
		 *   The child classes will provide the implementation of the declared
		 *   methods. The child class has to implement ALL methods in the abstract class
		
		 *   If you DO use a constructor in the abstract class, it will be called
		 *   when you instantiate a child class which inherits from the abstract class
		 */
		//Abstract class then concrete class
		GraphicObject circle = new Circle();
		GraphicObject rectangle = new Rectangle();
		
		circle.draw();
		rectangle.draw();
		circle.resize();
		rectangle.resize();
	}

}
 