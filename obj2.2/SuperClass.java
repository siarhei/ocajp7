public class SuperClass {
	final void doAction() {

	}
}

class Child extends SuperClass {
	void doAction2() {
		int i = 0;
	}

	void doSmth(final int param) {
		param = 5;
	}
}