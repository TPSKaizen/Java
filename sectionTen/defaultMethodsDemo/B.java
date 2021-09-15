package sectionTen.defaultMethodsDemo;

public interface B {
   int VAL = TestClient.getVal();

   void foo();

   default void go() {
      System.out.println("C: go");
   }
   // ^ If B implements this default method, we will have the diamond problem in X
   // since X implements BOTH B and C which have implementations of the method go()
   // The solution is to override this method in X, but it cannot have the default
   // keyword
}