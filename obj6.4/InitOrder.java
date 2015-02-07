import static java.lang.System.out;

public class InitOrder {
	public static void main(String s[]) {
		new One();
		new One("");
	}
}

class One {
	{
		out.println("1st instance init");
	}
	One() {
		out.println("constructor w/o args");
	}
	static {
		out.println("1st static init");
	}
	One(String arg) {
		out.println("constructor with args");
	}
	{
		out.println("2nd instance init");
	}
	static {
		out.println("2nd static init");
	}
}

/*
1st static init
2nd static init
1st instance init
2nd instance init
constructor w/o args
1st instance init
2nd instance init
constructor with args
*/