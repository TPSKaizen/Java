package section14_Exceptions;

public class checkedAndUncheckedExceptions {
	
	//checked exceptions: (E.g Things aren't under our control, partner service down, db unavaliable)
	
	//Compiler guarantees - 
	
	// 1. Specify you are throwing it via throws clause 
	// 2. Exception handling via try/catch block or relay it via a throw

	
	//Unchecked exceptions: (Due to programming flaws or internal system errors,
	
	// With programming flaws, they are generally called runtime exceptions.
	// If caused by system errors, they are just called errors
	// Errors are almost never caught
	// Runtime exceptions are to be minimized at development time
	// Generally shouldn't be caught, because we want the program to fail if there is a programming flaw and not to continue
	// A good example to catch them would be when parsing a response from a web service 
	
	//EXCEPTION TREE : 
	
	/* 
	Throwable -> Exception, Error(Unchecked) 
	Exception -> IOException(Checked), AWTException(Checked), RuntimeException (Unchecked)
	IOException -> FileNotFoundException, EOFException
	RuntimeException -> NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException, ClassCastException, NumberFormatException 
	
	Error -> VirtualMachineError, LinkageError (Unchecked)
	LinkageError -> NoClassDefFoundError  (Unchecked)
	*/
	
	/*
	Exceptions & Method Overriding
	Here are couple of rules when it comes to exceptions & method overriding.

	Rule 1: If the super class method does not declare an exception, then the overriding method in the subclass cannot declare a checked exception, but can declare an unchecked exception.

	Rule 2: 

	(a) If the super class method declares a checked exception, then the overriding method in the subclass can declare same exception or a subclass exception or no exception at all, but cannot declare parent exception.

	(b) If the super class method declares an unchecked exception, then the overriding method can declare any unchecked exception or no exception at all, but cannot declare a checked exception.
	*/
}
