package StaticKeyword;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a1 = new Student("Brian", 22, "Barbados");
		
		//Call class variables and methods by class name
		System.out.println(a1.toString());
		System.out.println(Student.college);
	}

}
