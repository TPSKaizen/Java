package sectionTen;

abstract class AbstractSubclass extends AbstractSuperclass {

	@Override
	void test1() {
		System.out.println("test1 : in abstractSubClass");
	} // overriden from superClass, test2 still has to be overriden

	abstract void test3(); // must be implemented in a subclass
}
