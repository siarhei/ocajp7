package other;

import certification.Parent;

class Child extends Parent {

	private void printX() {
		System.out.println(x);

		/*
		Parent p = new Parent();
		System.out.println(p.x);
		*/
	}

	public static void main(String[] v) {
		new Child().printX();
	}
}

class Neighbour {
	void method() {
		Child c = new Child();
		System.out.println(c.x);
	}
}