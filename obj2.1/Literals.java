class IntLiterals {
	//Decimal
	int pre7 = 1000000;

	//Java7 specific
	int with7 = 1_000_000;
	int r7 = 10_00_0;
	//int r6 = _10; //error: cannot find symbol
	int r5 = 5_0_0__0; //OK

	//Binary
	int b1 = 0b01;
	int b2 = 0B10000000000000000000000000000001;//OK (32 symbols (4x8 bit) after 0B)

	//Octal
	int o1 = 06;
	int o2 = 0777;

	//Hexadecimal
	int h1 = 0x4;
	int h2 = 0X10FF;
	int h3 = 0xDeadCafe;
}

class FloatingPointsLiterals {
	//Double
	double d = 12.34;
	double d2 = 11.8901D;
	double d3 = 11.8901d;
	double d37 = 1_0.18;
	//double d47 = 15._456; //error: illegal underscore

	//Float
	//float f = 11.445; //error: possible loss of precision
	float f1 = 11.876876f;
	float f2 = 11.445F;
	float f3 = (float) 11.445;
}

class CharacterLiterals {
	char a = 'a';
	char letterN = '\u004E'; //N

	//char is 16-bit unsigned integer (0 to 65535)
	char a1 = 0x892;
	char b = 982;

	char c = (char) 70000; //requred casting
	//char c1 = 70000; //error: possible loss of precision

	char d = (char)-79;

	//Quoted literals
	char dq = '\"';
	char nl = '\n';
	char tb = '\t';
}
