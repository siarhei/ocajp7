public class DoWhileLoop {
	public static void main(String[] args) {
		loop1();
		loop2();
	}

	static void loop1() {
		do {
			System.out.println("inside loop");
		} while(false);

		System.out.println("-----------");
	}

	static void loop2() {
		byte x = 0;
		byte y = 15;
		byte iter = 0;

		do {
			int z = 5;
			System.out.println("inside loop: " + ++iter + " z:" + z++);

		} while (++x < --y);

		System.out.println("-----------");
	}
}