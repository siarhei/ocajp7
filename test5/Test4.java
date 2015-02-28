class Dims {
	public static void main(String[] s) {
		int[][] a = {{1, 2}, {3, 4}};
		int[] b = (int[]) a[1];
		Object o1 = a;
		int[][] a2 = (int[][]) o1;
		int[] b2 = (int[]) o1;   //RTE: java.lang.ClassCastException: [[I cannot be cast to [I
		System.out.println(b[1]);
	}
}