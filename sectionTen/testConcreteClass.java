package sectionTen;

public class testConcreteClass extends AbstractSubclass {

    @Override
    void test3() {
        // TODO Auto-generated method stub
        System.out.println("Overriden test 3 in testConcrete");
    }

    @Override
    void test2() {
        // TODO Auto-generated method stub
        System.out.println("Overriden test 2 in testConcrete");
    }

    public static void main(String[] args) {
        testConcreteClass t1 = new testConcreteClass();
        t1.test1();
    }
}
