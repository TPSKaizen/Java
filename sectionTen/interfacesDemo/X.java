package sectionTen.interfacesDemo;

public class X extends AbstractA implements A, B, C {
   public void foo() {
      System.out.println("X: foo");
      System.out.println("VAL: " + B.VAL);
   }

   public void foobar() {
      System.out.println("X: foobar");
   }

   public void potato() {
      System.out.println("Potato");
   }

   // X doesn't have to define bar() because its extending AbstractA which provides
   // a concrete implementation

   // Both A and B have declaration foo() but its implemented in X so there is no
   // issue
}