package section14_Exceptions;

public class assertionsExplained {
	/*
	 * 
	 *  Software Reliability : Robustness + Correctness 
	 *  1. Robustness -> Softwares ability to withstand errors in exception situations and thus continue to execute (Exception handling)
	 *  2. Correctness -> Deals with the software working correctly (Assertions)
	 * 
	 *  Assertions are either right or wrong(booeal) 
	 *  
	 *  Syntax 
	 *  assert boolean-expression: will return true or false. 
	 *  assert ref != null;
	 *  assert index > 0; 
	 *  
	 *   If false is returned, AssertionError is thrown and the program is terminated
	 *   
	 *   assert boolean-expression : message 
	 *   assert index > 0 : "index is negative", if this evaluates to false, then AssertionError will take the message as a param
	 *   
	 *   Benefits : 
	 *   1. Effective in decting bugs during development 
	 *   		assertions -> obviously true
	 *   2. Serve as documentation, sometimes better than comments
	 *   		comments can get out-of-date
	 *   		assertions -> active comments
	 *   
	 *   Public Methods ~ Exceptions (Assertions are disabled by default, Assertions throw universal AssertionError) 
	 *   
	 *   
	 *   Non-public methods ~ Assertions
	 *   
	 *   Enabling & Disabling Assertions (ea = enable, da = disable)
	 *   1. Disabled by default 
	 *   2. -ea (or -enableassertions) 
	 *   3. -ea & -da at class and package levels 
	 *   	a. java -ea: com.semanticsquare.Hello MyClass //enabled at a class level, only for class Hello and disabled for all others
	 *   	b. java -ea -da: com.semanticsquare Hello MyClass  //Disabling at a class level. Assertions are enabled due to the ea flag .
	 *   													   //Assertions are enabled for MyClasss any any classes it is accessing except for Hello class
	 *   	c. java -ea -da: com.semanticsquare... MyClass  //Disabling at package level. Assertions are enabled for MyClass and any classe it is accessing, 
	 *   														//Except for those in the package. the "..." suggests package level.
	 * 
	 */
}
