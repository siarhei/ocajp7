class Top {
	public Top(String s) { System.out.print("B"); }
}

public class Bottom2 extends Top {
	public Bottom2(String s) { System.out.print("D"); }
	public static void main(String [] args) {
		new Bottom2("C");
		System.out.println(" ");
	}
}

//error: constructor Top in class Top cannot be applied to given types;
//constructor Top() is required or explicit super("") in Bottom2