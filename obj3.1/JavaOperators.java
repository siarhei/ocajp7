public class JavaOperators {

	public static void main(String args[]) {
		Long L1 = Long.valueOf(20);
		System.out.println(L1 == 20L);

		Long L2 = Long.valueOf(1234567890);
		System.out.println(1234567890L == L2);

		System.out.println(5.0 == 5L);	//true
		System.out.println('a' == 'A');	//false
		System.out.println(0x8F == 0b10001111);	//true
	}
}