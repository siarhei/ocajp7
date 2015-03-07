public class MethodSignature {
	void doAction() throws Exception {}
}

class MethodSignatureExt extends MethodSignature {
	void doAction() throws MyException, RuntimeException {} //OK to declare more specific exception
}

class MethodSignatureExt2 extends MethodSignatureExt {
	void doAction() throws MyException2, Error {} //OK to declare more specific exception
}

class MyException extends Exception {}
class MyException2 extends MyException {}


/*
	INTERFACE 
*/

interface Iface {
	int calculate(int x) throws MyException;
}

class Impl implements Iface {
	public int calculate(int x) throws MyException2 {
		return 0;
	}
}