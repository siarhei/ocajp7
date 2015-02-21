public class LogicalOperators {
	public static void main(String[] args) {
		int x = 5;

		shortCircuit(x);
		nonShortCircuit(x);
		testXor();
		test();
	}

	static void shortCircuit(int x) {
		if (++x < 5 && ++x < 7) { } 
		System.out.println(x); //6
	}

	static void nonShortCircuit(int x) {
		if (++x < 5 & ++x < 7) { }
		System.out.println(x); //7
	}

	static void testXor() {
		boolean ind = false;
		if (ind ^ !ind) {
			System.out.println("ind ^ !ind");
		}
	}

	static void test() {
		if (Integer.valueOf(9) == Integer.valueOf(9)) {
			System.out.println("Integer.valueOf(9) == Integer.valueOf(9)");
		}

		if (Integer.valueOf(200) == Integer.valueOf(200)) {
			System.out.println("Integer.valueOf(200) == Integer.valueOf(200)");
		} else {
			System.out.println("Integer.valueOf(200) != Integer.valueOf(200)");
		}

		System.out.println((byte) + (char) - (int) + (long) - 1); //1
		System.out.println((byte) - (char) - 1); //1
		System.out.println((byte) + (char) - 1); //-1
	}
}