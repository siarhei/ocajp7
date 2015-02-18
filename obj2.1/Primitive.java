class PrimitiveAssignment {
	byte a = 3;
	byte b = 5;
	//byte c = a + b; //error: possible loss of precision
	byte c = (byte)(a + b);

	//ok for instance var-s
	int i, j, k=i+5;
	void doCall() {
		//int i, j, k=i+5; //error: variable i might not have been initialized
	}
}

class PrimitiveCasting {
	int a = 100;
	long b = a; //implicit

	float a1 = 10.001F;
	int b1 = (int) a1; //explicit
	//int x = 10.49; //error: possible loss of precision {double to int}

	double d = 10L; //OK

	long ln = 56L;
	byte bt = (byte) ln;

	long l2 = 130; //implicit {int to long}
	byte b2 = (byte) l2; //-126

	float f = 234.56F;
	short s = (short)f;

	//float f2 = 32.3; //error: possible loss of precision {double to float}
	float f3 = (float)32.3;

	//byte b3 = 128; //127 is max positive
	byte b4 = 127;
	byte b5 = (byte) 128;
	/*
		128 - 10000000
		inverse - 01111111
		result is -(inverse + 1) => -10000000 => -128 => b5 == -128
	*/

	byte b6 = 10;
	{ b6 += 25; } //no casting is required!!!!!!!!
	//BUT
	byte b7 = 5;
	//{ b7 = b7 + 9; } //error: possible loss of precision

	char c1 = 60;
	//char c2 = -60; //error: possible loss of precision
	char c3 = 0b01101111;
	char c4 = (char) 131.42;
	char c5 = 0xAB;
	char c6 = 07612;

	{
		long s = 51;
		long s1 = (int) 45 + 1051;
		float f1 = 0.51F + 0.39F;
	}
}