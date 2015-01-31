package pkgb;

import pkga.*;

public class Child extends Parent {
	void doAction() {
		int b = 2 + var;
	}
}

class Sibling {
	void create() {
		Child c = new Child();
		//illegal access
		//int b = c.var + 5;
	}
}

class Child2 extends Child {
	void remove() {
		int t = 10 + var;
	}
}