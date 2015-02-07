
public class Constructors {
	public static void main(String s[]) {

	}
}

class Parent {
	//method
	void Parent() {}

	//constructor
	Parent(String s, int i) {}
	Parent(String s) { this(s, 5); }
}

class Child extends Parent {
	private double v = 5.3;

	static double V = 5.3;

	static float getFloatConst() { return .02f; }

	private double getDoubleVal() { return 5.3d; }

	Child() {
		//super("", 5);
		//super("string");
		//this(.02f, 5.3); //OK
		//this(getFloatConst(), v); //bad
		//this(getFloatConst(), getDoubleVal()); //bad
		this(getFloatConst(), V); //OK
		v = 0.2; //OK
	}

	Child(float f, double d) {
		super("str", (int)(getFloatConst()/d)); //OK
	}
}

//compiler - error: recursive constructor invocation
//OR stackoverflow exception at runtime
class A {
	A() { this("foo"); }
	A(String s) { this(); }
}