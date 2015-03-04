public class ForLoop {
	public static void main(String[] args) {
		loop1();
		loop2();
		loop3();
		loop4();
		loop5();
	}

	static void loop1() {
		//it prints 5 times
		for (char a = 0;;System.out.println("inside loop: " + (byte)a)) {			
			if (++a > 5) break;
		}
		end();
	}

	static void end() {
		System.out.println("--------------");
	}

	static void loop2() {
		//it prints 6 times
		for (char a = 0;;) {			
			System.out.println("inside loop: " + (short)a);
			if (++a > 5) break;
		}
		end();
	}

	static void loop3() {
		int x = 0;
		//for (int x = 5; x > 0; x--) { //error: variable x is already defined in method loop3()
		for (x = 5; x > 0; x--) {
			System.out.println("inside loop: " + x);
		}
		end();
	}

	static void loop4() {
		for (int x = 5, y = 0; x > y; x--, ++y) {
			System.out.println("inside loop: " + x + y);
		}
		end();
	}

	static void loop5() {
		int[] chars = new int['Z'-'A' + 1];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = 'A' + i;			
		}
		for (int ch : chars) {
			System.out.println("code: " + ch + "; char: " + (char)ch);
		}
		end();
	}
}