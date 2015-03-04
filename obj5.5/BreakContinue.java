public class BreakContinue {
	public static void main(String[] args) {
		$break();
		//_continue1(); //infinite loop
		_continue2();
	}

	static void $break() {
		System.out.println("before loops");

		for (int i = 0; i < 2; i++) {
			System.out.println("i-loop: " + i);
			http://example.com
			for (int j = 20; j > 10; --j) {
				System.out.println("j-loop: " + j);
				for (short k = 5; k < j; k += 1) {
					System.out.println("k-loop: " + k);
					if (k == 7) {
						break http;
					}
					System.out.println("end k-loop: " + k);
				}
				System.out.println("end j-loop: " + j);
			}
			System.out.println("end i-loop: " + i);
		}

		System.out.println("after all loops");
		System.out.println("---------------");
	}

	static void _continue1() {
		for (int i = 0; i < 17; ++i) {
			//if (i % 8 == 1) continue label2; //error: undefined label: label2
		}

		label2:
		while (true) {
			System.out.println("infinite");
		}
	}

	static void _continue2() {
		int i = 0;

		cnt:
		do {
			System.out.println("start do: " + i);			
			while (true) {
				System.out.println("start inf while");
				for (int m = 5; m > 0; m--) {
					System.out.println("start for: " + m);
					if (m % 3 == 1) continue cnt;
					System.out.println("end for: " + m);
				}
				System.out.println("end inf while");
			}
			//System.out.println("end do: " + i); //error: unreachable statement
		} while (++i < 2);

		System.out.println("---------------");
	}
}