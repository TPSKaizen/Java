package comparableAndComparator;

import java.util.Comparator;

public class ageComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() < o2.getAge()) return -1; //maintains ascending order sorting
		// -1 means the first obj will get prio
		// 1 means the 2nd obj will get prio
			if(o1.getAge() > o2.getAge()) return 1;
			else return 0;
		//if you want descending order flip the signs around
	}
		
}
