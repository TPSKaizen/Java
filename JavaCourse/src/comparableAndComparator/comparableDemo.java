package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class comparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student john = new Student ("John", 3, 22, "Barbados");
		Student jamie = new Student ("Jamie", 2, 19, "Barbados");
		Student jacklyn = new Student ("Jacklyn", 4, 24, "Barbados");
		Student josh = new Student ("Josh", 1, 18, "Barbados");
		
		list.add(john);
		list.add(jamie);
		list.add(jacklyn);
		list.add(josh);
		
		//sort list with custom logic
		Collections.sort(list);
		
		//forEach from stream API
		list.forEach(student -> System.out.println(student.getName()));
		
		Collections.sort(list, new ageComparator());
		System.out.println("Students after age ascending sorting: ");
		list.forEach(student -> System.out.println(student.getName()));
	}

}
