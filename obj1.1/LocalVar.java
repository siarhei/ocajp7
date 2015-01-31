public class LocalVar {
	//legal array definitions
	char[] chars2D[];
	byte[][] bytes2D;
	short[] numbers;
	int nums[];

	//illegal
	//long[10] ls;

	public static int main(String ... s) {
		int i; //define local var

		if (s != null) {
			i = 5;
			System.out.println("Local var is" + i);
		}
		return 0;
	}

	class Inner {
		//static void doRec() {} //illegal
		void doRec() {}
	}

	static class Nested {
		static void doRec() {}
	}
}