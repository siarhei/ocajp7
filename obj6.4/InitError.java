public class InitError {
	static int[] a = new int[4];
	static {
		//java.lang.ExceptionInInitializerError
		//Caused by: java.lang.ArrayIndexOutOfBoundsException: 4
        //at InitError.<clinit>(InitError.java:4)
		int x = a[4];
	}

	public static void main(String[] args) {}
}