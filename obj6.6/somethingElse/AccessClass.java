package somethingElse;

import certification.*;

class AccessClass extends OtherClass {
	static public void main(String args[]) {
		OtherClass o = new AccessClass();
		o.testIt(); //cannot compile
	}
}