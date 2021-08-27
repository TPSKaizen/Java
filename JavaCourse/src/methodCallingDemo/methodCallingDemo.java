package methodCallingDemo;

public class methodCallingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		changeVal(i);
		//output will be 0 because this is java passes by value
		System.out.println(i);
		
		Student john = new Student("John", 22 , "Barbados");
		changeNameInSameObj(john);
		System.out.println(john.getName());
		
		Student newJohn = changeNameInDiffObj(john, "Brian");
		
		System.out.println(newJohn.getName());
		
	}
	
	private static void changeVal(int i) {
		i+=1;
	}
	
	//to update the result of i we can do this :
	
	/*
	 * 
	 * private static int changeVal(int i) {
		return i+=1;
	}
		then :
		i = changeVal(1);
	 */
	
	//Bad Approach of modifying existing obj
	static void changeNameInSameObj(Student a) {
		a.setName("Bobby");
	}
	//Good approach of modifying existing obj and returning modified obj
	static Student changeNameInDiffObj(Student a, String newName) {
		Student newObj = new Student(newName, a.getAge(), a.getAddress());
		return newObj;
	}

}
