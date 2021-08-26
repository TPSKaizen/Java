package StaticKeyword;

public class staticNestedClassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accessing a static nested class
		
		//For static nested class
		OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
		
		nestedObj.display();
		
		OuterClass.nonStaticInnerClass inner = new OuterClass().new nonStaticInnerClass();
		
		inner.display();
		
		OuterClass outerClass = new OuterClass();
		
		outerClass.outerClassMethod();
	}

}
