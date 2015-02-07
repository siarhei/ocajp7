public class RefClass {
	void doAction() {
		Parent p = new Parent();
		Child c = (Child) p; //compiled OK
		String str = (String) c; //FAILED: inconvertible types
	}

	void doCreate() {
		Parent p = new Child();
		//p.create(); //FAILED: cannot find symbol
		((Child)p).create();
	}
}

class Parent {

}

class Child extends Parent {
	void create() {}
}