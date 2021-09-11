package SectionFive;

public class AccessLevelsDemo {
    /*
     * Accessibility for class members
     * 
     * Inside class only ~ private - private int id = 4;
     * 
     * Inside package only ~ no access modifier specified - int id = 4;
     * 
     * Inside package only + any subclass ~ protected - protected int id = 4;
     * 
     * Inside & outside package
     * 
     * An object of class X can access private members of another object of the same
     * class x
     * 
     * E.g Student s1 = new Student(); Student s2 = new Student(); Course c1 = new
     * Course();
     * 
     * s1 can access s2's private members But c1 cannot access s1 or s2's private
     * members. This applies to both methods and primitives.
     */
}
