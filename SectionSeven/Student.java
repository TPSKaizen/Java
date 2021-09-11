package SectionSeven;

public class Student {
    // variable declarations
    private static int studentCount;

    private static int idInitializer = 1000;
    private final int id;
    private String name;
    private String gender = "male";

    public String getName() {
        return name;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    // Constructors
    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender.toLowerCase();

        id = ++idInitializer; // every ID will be unique
        studentCount++;
        System.out.println("ID of " + name + " is " + id);
    }

    // method definitions
    public boolean updateProfile(String name) {
        this.name = name;
        return true;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Brian", "Male");
        Student s2 = new Student("Bob", "female");

    }
}

// Final instance variable
// Must be initialized in :
// 1. Declaration
// 2. Constructor
// 3. Instance initializer
// Final variables dont get default values

// Constant variables
// Constraints : keyword final, primitive or String, Initialized in declaration
// statement, with compile time constant expression
// Constant variables are compile-time constants
// public static final double PI = 3.14159265368979323846
// 1. Compiler optimization
// int x = Math.PI => int x = 3.14159265368979323846
// stored in .class file

/*
 * E.g final int x = 23; final String x = "Hello"; final int x = 23 + 5; final
 * String x = "hello" + "world"; final int z = 5; final int x = 23 + z // z is
 * hard wired
 * 
 * Invalid example: int z = 5; final int x = 23 + z //here z inst hard wired :
 * final int x = getVal(); //Because getVal will be invoked at run time
 * 
 * // Invalid because initializtion is being done public class Test{ final int
 * x; public Test(){ x = 23; } }
 * 
 * // Fails because static initializer block will only be run at runtime public
 * class Test{ static final int x; static { x = 23; } }
 */
