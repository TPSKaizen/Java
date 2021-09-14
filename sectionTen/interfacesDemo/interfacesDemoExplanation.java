package sectionTen.interfacesDemo;

public class interfacesDemoExplanation {
    /*
     * Supertype defines contract
     * 
     * class --> public/protected methods abstract class -->
     * public/protected(abstract) ^^ Both of these have state
     * 
     * interface --> mostly only public abstract methods Since java 8, you MAY see
     * concrete methods as well
     * 
     * Interfaces have no state, meaning that they don't have instance variables and
     * they are non-instanstiable
     */

    /* DEFINING AN INTERFACE */
    /*
     * public interface InterfaceName{ .. }
     */
    // Interfaces are implicitly abstract
    // Usually have public access modifer or default
    // Can include static, constant variables (static final)
    // Cannot have instance variables
    // Can include abstract methods
    // Can include default and static methods (Concrete methods)
    // Can include nested types (Nested classes/interfaces)
    // Variables are public, static and final by default
    // All members are public by default
    // Members cannot be private or protected

    /*
     * If the access level of an interface is default then the public access
     * behaviour of members is overriden and they are not visible outside the
     * package
     */

    // All members of an interface are implicitly public

    /*
     * public interface Sharable{ String getItemData(); }
     */

    // Implementing interface
    /*
     * public class Book extends Bookmark implements Shareable{ public String
     * getItemData{ ..} }
     * 
     * public class WebLink extends Bookmark implements Shareable{ public String
     * getItemData(){ .. } }
     */

    // Implementing multiple interfaces
    // Can take any number of interfaces
    /*
     * public class Book extends Bookmark implements Shareable, Comparable{ public
     * String getItemData() { .. } public int compareTo(Object 0)
     */

    // Extending interfaces (using extends keyword)

    /*
     * public interface List extends Collection{ .. }
     */

    // Classes can only IMPLEMENT interfaces but not extend them
    // Interfaces can extend other interfaces(one or more than 1)

    // Abstract subclasses can implement interfaces, which would be implemented by
    // the subclass of the abstract subclass

    // If two interfaces declare a method foo() and a subclass X implements both
    // then we DONT run into the diamond problem because the diamond problem
    // is based on inheriting multiple method definitions.
    // Here, it is identical method declarations
    // Hence, the subclass is forced to provide the implementation

    // If interface A has an abstract method foo() and concrete class B
    // has an implementation of foo() and concrete class X extends B
    // and implements A, then X doens't have to provide a definition of foo()
    // UNLESS he wants to override it from B

    // If two interfaces, A & B have declared variable int VAL = 5 and a
    // subclass X implements both then if a function in class X, foo(),
    // tries to access VAL then a compiler erorr will throw.
    // In that case you have to specify the interface that it came from.
    // Incorrect way : int i = VAL;
    // Correct way : int i = B.VAL
}
