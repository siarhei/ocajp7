import static java.lang.System.out;

public class TestAnimals {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Horse();

		a.eat();
		b.eat();
	}
}

class Animal {
	protected void eat() {
		out.println("Generic Animal Eating");
	}
}

class Horse extends Animal {
	protected void eat() {
		out.println("Horse Eating");
	}
}