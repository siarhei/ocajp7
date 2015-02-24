public class Construction {
	int[][] array = new int[3][];
	{
		array[0] = new int[2];
		array[0][0] = 6;
		array[0][1] = 7;

		array[1] = new int[3];
		array[1][0] = 9;
		array[1][1] = 8;
		array[1][2] = 5;

		//array[2] refers to null

		//array[3] = new int[0]; //RTE: java.lang.ArrayIndexOutOfBoundsException: 3
	}

	int scores[][] = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9}};

	public static void main(String[] args) {
		new Construction();
	}
}