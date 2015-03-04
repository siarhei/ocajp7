public class Switch {
	void compileTimeConstant() {
		final int a = 1;
		final int b;
		b = 2;
		int x = 0;
		switch (x) {
			case a: //ok
			//case b: //error: constant expression required
		}
	}

	void switchLong() {
		//long x = 0;
		byte x = 0;
		switch (x) { //error: possible loss of precision
			//required: int
  			//found:    long
			case 0:
		}
	}

	void switchLongCast() {
		long x = 0;
		switch ((int) x) {
			case 0: //OK
		}
	}

	void switchFloat() {
		//float f = .01F;
		short f = 0;
		switch (f) { //error: possible loss of precision
			//required: int
  			//found:    float

			//case 0.1: //error: possible loss of precision
			//required: short
  			//found:    double
		}
	}

	void switchExp() {
		String s = "abc";
		switch(s.length()) {
			case 1: System.out.println("length is 1");
				break;
			case 2: System.out.println("length is 2");
				break;
			default : System.out.println("Unknown length");
		}
	}

	void switchLossPrecision() {
		byte b = 2;
		switch (b) {
			case 23:
			//case 128: //error: possible loss of precision
			//required: byte
  			//found:    int
  			case (byte)128: //OK
		}
	}

	void switchDuplicateCase() {
		int temp = 90;
		switch (temp) {
			case 80: System.out.println("80");
			//case 80: System.out.println("80"); //error: duplicate case label
			case 90: System.out.println("90");
			default: System.out.println("default");
		}
	}

	void illegalSwitch() {
		int x = 0;

		switch(x) {
			case 0 { //error: : expected
				int y = 7;
			}
		}

		switch (x) {
			0: {} //error: case, default, or '}' expected
			1: {}
		}
	}
}