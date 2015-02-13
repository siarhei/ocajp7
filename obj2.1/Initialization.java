import static java.lang.System.out;

class TestLocal {
	public static void main(String [] args) {
		int x;
		if (args != null) {
			x = 7;
		}
		//out.println(x); //error: variable x might not have been initialized
	}
}

class TestLocal2 {
	public static void main(String [] args) {
		int x;
		if (true) {
			x = 7;
		}
		out.println(x); //OK
	}
}