import static java.lang.System.out;

public class Propagate {
	public static void main(String[] args) {
		try {
			out.println(reverse("abc"));
			out.println(reverse(""));
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			out.println("Finally");
		}
		//cba
		//Finally
		//exception stacktrace
	}

	static String reverse(String s) throws Exception {
		if (s ==  null || s.length() == 0) {
			throw new Exception("undefined argument");
		}
		return new StringBuilder(s).reverse().toString();
	}
}