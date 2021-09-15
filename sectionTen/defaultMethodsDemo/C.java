package sectionTen.defaultMethodsDemo;

/**
 * @author ABC Inc.
 */
public interface C extends A {
   void foobar();

   default void go() {
      // You cannot have super.go()
      // You CAN have A.super.go();
      System.out.println("C: go");
   } // this gives us binary compatibility, meaning that X doens't have to recompile
     // their code for this to work for the testClient
     // However, if they DO compile their code, it will still work and this is called
     // Source Compatibility

   void foo1(); // this is making a method in A abstract because we think the implementation in
                // A is bad. Thus forcing the subclass of C to implement it
}