package section14_Exceptions;

//Exceptions - Best Practices

//An exception is an Object of class.java.lang.Throwable or one of its subclasses

//Effective java items :
/*
58. Used checked exceptions for recoverable conditions and runtime exceptions for programming errors 

65. Don't ignore exceptions 

63. Include failure-capture information in detail messages 

61. Throw exceptions appropriate to the abstraction

57. Use exceptions only for exceptional conditions, don't use for regular control flow

E.g
Example of using exceptions for regular control flow
try{
	while(true)
		Object item = newItem();
} catch( NoSuchElementException e){
	//some complex logic
}

Better way: 

while(hasNexItem()){ //Have a method to determine if there any elements to traverse.
	Object item = nextItem();
}

Item 59: Avoid unnecessary use of checked exceptions

If used carelessly -> Unpleasant API
 
 If one or more of these don't hold, better to use unchecked exceptions
Condition 1: Unpreventable exception condition
Condition 2: Recoverable?

Item 60: Favor use of standard exceptions 
Benefits
1. Easy to understand API
2. API client programs are easy to read


Item 62: Document all exceptions thrown by each method with @throws
For Checked Exceptions : Declare and document each exception precisely
DONT use throws Exception OR throws Throwable

Unchecked Exceptions : Document them too if they aren't declared
Document unchecked exceptions in interface methods

Item 38 : Check parameters for validity
Think about param restrictions when writing new methods or constructors
If there are any restrictions, check them at the beginning of the method
and throw any unchecked exceptions and document them. This is for public methods.

For non-public, use Assertions for parameter checks
*/
