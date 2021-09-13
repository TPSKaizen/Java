package SectionNine.methodOverriding;

public class methodOveridingdemo {
    /*
     * Purpose of overriding: Redefining behaviour of superclass method 1. Adding
     * new behaviour 2. Extending Behaviour 3. Providing better implementation
     */

    // You must fulfill the contract from superclass
    // Method overriding rules

    // 1. Same params + compatible return types
    // a. Return type must be same or subclass type

    // 2. Can't be less accessible
    // b. Access level must be same or friendlier

    // super Keyword
    // Used to access superclass methpod
    // a. Non-overriden ~ direct or super
    // b. Overriden ~ super
    // CANNOT be used in static method
    // can access hidden field

    /*
     * E.g class Staff extends User{ void postAReview(){ super.postAReview();
     * //invokes super class behaviour //behaviour extension code } }
     */

    // Final Methods are NOT overriden
    // e.g final returnType methodName (parms){

    // } cannot be overriden

    // Fields ~ Instance & Static cannot be overriden

    // Static methods and variables cannot be overriden

    // If you have a static method in User and then one in Staff,
    // and Staff extends User and we invoke the static method from Staff,
    // then the one in User will be executed unless we use an explicit cast like
    // this :
    // ((Staff) staff.staticMethod())
}
