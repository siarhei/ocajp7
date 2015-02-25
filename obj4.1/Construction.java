public class Construction {
	int[] scores = new int[5];
	byte[] bytes = {0, 1, 2};
	Thread threads[] = new Thread[3];

	//int[] cars = new int[]; //error: array dimension missing

	//int[] x = new int[-1]; //RTE java.lang.NegativeArraySizeException

	public static void main(String[] args) {
		new Construction();
		takeAnArray(new int[2]);
		takeAnArray(new int[]{0, -5, 0});
		//takeAnArray(new int[2]{0, 1}); //compile error
	}

	static void anonymousArray() {
		int [] scores;
		scores = new int[] {1, 2, 0};
	}

	static void takeAnArray(int[] array) {

	}

	static void assignment() {
		int[] x = new int[5];
		x[0] = 'a';
		x[1] = (byte) 22;
		x[2] = (short) 44;
		x[3] = (int) 1.5F;
		x[4] = (int) 55L;

		int[] splats;
		int[] dats = new int[4];
		char[] letters = new char[] {'a', 'b'};
		splats = dats;
		//splats = letters; //error: incompatible types

		Car[] cars;
		Honda[] hondas = new Honda[5];
		cars = hondas;
		Beer[] beers = {new Beer(), new Beer()};
		cars = beers; //error: incompatible types
	}
}

class Car {}
class Honda extends Car {}
class Beer {}