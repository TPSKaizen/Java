package comparableAndComparator;

public class explanation {
	
	/*
	 * The need for comparable comes from sorting collections
	 * 
	 * Java normally sorts via natural sorting order via Collection.sort();
	 *  This holds true for built in datatypes but not for custom
	 *  
	 *  E.g a List of type Student.
	 *  
	 *  We need to implement our own sorting code for that.
	 *  
	 *  Comparable is for a NATURAL sorting order
	 *  
	 *  Comparable is an interface 
	 *  
	 *  public interface Comparable<T> {
	 *  	public int compareTo(T o);
	 *  		//T = foreign obj
	 *  		// o = current obj
	 *  }
	 *  
	 * @Override // This is your personal implementation of sorting the objs
		public int compareTo(Student student) {
		
		return this.rollNumber - student.rollNumber;
		//if the returned number is positive, then "this" will take priority
		//if it returned a negative number, then the foreign obj will take priority
		//if it returns 0, then both have the same priority
	}
	
	 *  Comparator is used for custom sorting
	 *  
	 *  public interface Comparator<T> {
	 *  	int compare(T o1, T o2)
	 *  }
	 *  
	 *  E.g If we have an application where we have a student objects and then
	 *  we have different consumer applications :
	 *  1. Payroll
	 *  2. Attendance
	 *  3. Examination
	 *  4. Extra Curricular
	 *  
	 *  Then each want to sort the objs based on different sorting
	 *  
	 *  This is where comparator comes into view and allows us to 
	 *  define custom sorting logic MULTIPLE times
	 *  
	 *  We have to overide compare for comparator.
	 *  Comparable uses compareTo
	 *  
	 *  @Override
		public int compare(Student o1, Student o2) {
		
		if(o1.getAge() < o2.getAge()) return -1; //maintains ascending order sorting
		// -1 means the first obj will get prio
		// 1 means the 2nd obj will get prio
			if(o1.getAge() > o2.getAge()) return 1;
			else return 0;
		//if you want descending order flip the signs around
	}
	 *  If we don't specify the comparator, java will look to the
	 *  comparable implementation in the student class
	 *  
	 *  We can have as many comparators as we want
	 */
}
