public interface Bounceable {
	void method1();
	public void method2();
	abstract void method3();
	public abstract void method4();

	/*
	private void method5();
	protected void method6();
	static void method7();
	final void method8();
	strictfp void method9();
	*/

	public static final int A = 0;
	int B = 1;
	//private int C = 2;

}

//interface Child extends Object {}
abstract interface Child extends Bounceable {}
//interface abstract Child extends Bounceable {}