package ClassObjectMembers;

class Student {
    static int studentCount;

    int id;
    String name;
    String gender;
    int age;
    long phone;
    double gpa;
    char degree;

    boolean international;
    double tuitionFees = 12000.0;
    double internationalFees = 5000.0;

    Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree) {
        // this is an invocation statement, it doesnt take types.
        // it must be the FIRST statement, only ONE in a constructor, cannot contain
        // instance variables
        this(newId, newName, newGender, newAge, newPhone, newGpa, newDegree, false);
    }

    Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree,
            boolean isInternational) {
        this.id = newId;
        this.name = newName;
        this.gender = newGender;
        this.age = newAge;
        this.phone = newPhone;
        this.gpa = newGpa;
        this.degree = newDegree;
        this.international = isInternational;

        studentCount = studentCount + 1;
        int nextId = id + 1;

        if (international) {
            tuitionFees = tuitionFees + internationalFees;
            // return;
        }

        System.out.println("\nid: " + id);
        System.out.println("nextId: " + nextId);
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("age: " + age);
        System.out.println("phone: " + phone);
        System.out.println("gpa: " + gpa);
        System.out.println("degree: " + degree);
        System.out.println("tuitionFees: " + tuitionFees);
        System.out.println("studentCount: " + studentCount);
    }

    Student() {
    }

    boolean updateProfile(String name) {
        this.name = name;
        return true;

    }

    static void swap(Student[] students, int pos1, int pos2) {
        Student temp = students[pos1];
        students[pos1] = students[pos2];
        students[pos2] = temp;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1000, "John", "male", 18, 223_456_7890L, 3.8, 'B');

        Student student2 = new Student(1001, "Raj", "male", 21, 223_456_9999L, 3.4, 'M', false);

        Student student3 = new Student(1002, "Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);

        Student[] stuArr = { student1, student2, student3 };

        for (Student i : stuArr)
            System.out.println(i.name);

        swap(stuArr, 1, 2);

        System.out.println(" \n");

        for (Student i : stuArr)
            System.out.println(i.name);
    }
}
