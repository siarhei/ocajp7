class Base implements A {
	public void delete(int i) {}
}

interface A {
	void delete(int i);
}

class Child extends Base implements A {
	public void delete(String s) {} //overloaded
	public int delete(long s) { return 0; } //overloaded
	public void delete(int i) throws RuntimeException {} //overridden
}