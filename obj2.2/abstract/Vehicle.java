public abstract  class Vehicle {
	abstract void goUpHill();
}

abstract class Car extends Vehicle {
	abstract int speed();
	abstract static void doStuff();
}

class Mini extends Car {
	void goUpHill() {}
	int speed() {return 0;}
}