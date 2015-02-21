import static java.lang.System.out;

public class StringMethods {
	public static void main(String[] args) {
		testEquality();
		charAt();
		concat();
		equalsIgnoreCase();
		length();
		replace();
		substring();
	}

	static void testEquality() {
		String s1 = "abc";
		out.println(s1 == "abc"); //true
		out.println(new String(s1) == "abc"); //false
	}

	static void charAt() {
		String x = "airplane";
		out.println(x.charAt(0)); //a
		//out.println(x.charAt(8)); //RE: java.lang.StringIndexOutOfBoundsException: String index out of range: 8
	}

	static void concat() {
		String x = " cab";
		out.println("taxi".concat(x)); //taxi cab
	}

	static void equalsIgnoreCase() {
		String x = "taxi";
		out.println(x.equalsIgnoreCase("TaXi")); // true
	}

	static void length() {
		String s = "";
		String x = "taxi";
		out.println(s.length() + " " + x.length()); //0 4
	}

	static void replace() {
		String x = "azazaz";
		out.println(x.replace('z', 'h')); //ahahah
	}

	//[begin, end)
	static void substring() {
		String x = "first";
		out.println(x.substring(3)); //st

		out.println("first second_third".substring(6, 12)); //second

		out.println("abc".substring(3)); // empty
		//out.println("abc".substring(4)); //RE: java.lang.StringIndexOutOfBoundsException: String index out of range: -1
	}
}