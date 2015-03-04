public class WhileLoop {
	public static void main(String[] args) {
		loop1();
		loop2();
	}

	static void loop1() {
		//final boolean b; //error: variable b might be assigned in loop
		boolean b;
		short i = 0;
		while(b = true) {
			System.out.println("inside while loop");
			if (++i % 7 == 0) {
				break;
			}
		}

		System.out.println("-----");
	}

	static void loop2() {
		int i = 0;
		while (i < 5) {
			//int i = 0; //error: variable i is already defined in method loop2()
			System.out.println("inside while loop");
			i++;
		}

		if (true) {
			//int i = 0; //error: variable i is already defined in method loop2()
		}

		System.out.println("-----");
	}
}