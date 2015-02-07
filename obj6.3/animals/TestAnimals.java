package animals;

import horses.Horse;

public class TestAnimals {

	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Horse();

		a.eat();
		b.eat();
		new Horse().eat();
	}
}