package sectionTen.defaultMethodsDemo;

public interface A {
   int VAL = 5;

   void foo();

   void bar();

   default void foo1() {
      System.out.println("Lol hello I'm a bad implementation");
   }
}