public class ExecClass3 {
	public static void main(String ... args) {
		System.out.println("main(String ... args)");
		main(1, 2, 3);
	}

	public static void main(int... args) {
		System.out.println("called 'main(int... args)'");
	}
}