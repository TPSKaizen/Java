package StaticKeyword;

public class OuterClass {
	
	static int outerStaticMember = 10;
	
	int instanceMember = 20;
	
	private static int outerPrivateMember = 30;
	
	static class StaticNestedClass {
		void display() {
			System.out.println("Static member of outer class: " + outerStaticMember);
			
			System.out.println("Private static member of outer class = " + outerPrivateMember);
			
			//static block cannot access instance member because its not static
			//System.out.println("non static member of outer class = " + instanceMember);
		}
		
		
	}
	
	class nonStaticInnerClass{
		public void display() {
			System.out.println("Hello world! Im not static!");
			System.out.println("Static member of outer class: " + outerStaticMember);
			System.out.println("Private static member of outer class = " + outerPrivateMember);
		}
	}
	
	void outerClassMethod() {
		System.out.println("In the outer class method");
		
		class MethodLocalClass{
			void localInnerMethod() {
				System.out.println("in the method local class: Method");
			}
		}
		MethodLocalClass mlc = new MethodLocalClass();
		mlc.localInnerMethod();
	}
}
