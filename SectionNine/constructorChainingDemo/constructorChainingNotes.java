package SectionNine.constructorChainingDemo;

public class constructorChainingNotes {
    // 1. Inherited methods might depend on superclass
    // 2. Super classes must be initialized first
    // 3. Constructors initialize object state.

    // Constructor chaining works with the superclass constructor
    // first so that there are no issues within the subclass object

    // E.g
    // 1. new Staff invokes its own constructor
    // 2. Staff's constructor then invokes its superclass constructor which is
    // User's constructor
    // 3. Then users constructor would invoke Object's class constructor
    // 4. Object constructor completes and execution goes back down to User

    // Super keyword
    // 1. Invoking super class constructor ~ super()
    // 2. must be first statement unless this() is used
    // 3. this() or super(), but never both
    // 4. With overloaded constructors, last invoked constructor will call super

    // if not provided, compiler inserts super()

    // class User {
    // int id;

    // User(int id) {
    // super();
    // this.id = id;
    // }
    // }

    // if we didn't provide a constructor, then the compiler will add
    // one in that looks like this:
    // User(){
    // super();
    // }

    // If the superclass constructor cannot be invoked then a compiler error will
    // occur

    // E.g

    // class User{
    // User(int id){

    // }
    // }

    // class Staff extends User{
    // Staff(int id){

    // }
    // }

    // The above code will throw an error because Staff will NOT
    // be able to implement a super no args constructor since
    // there is no default constructor in the user class.

    // Two solutions are :
    // 1. implement super(id) in the Staff claStaff
    // 2. Include no args constructor in User class
}
