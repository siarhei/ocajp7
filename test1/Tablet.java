//Test10

interface Gadget {
	//implicit public abstract
	void doStuff();
}

abstract class Electronic {
	void getPower() { System.out.println("plug in "); }
}

public class Tablet extends Electronic implements Gadget {
	//attempting to assign weaker access privileges; was public
	void doStuff() { System.out.println("show book "); }

	static public void main(String args[]) {
		new Tablet().getPower();
		new Tablet().doStuff();
	}
}