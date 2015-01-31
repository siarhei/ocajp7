public enum CoffeSize {
	BIG(8),
	HUGE(10),
	OVERHELMING(16) {
		//constant specific class body
		public String getLidCode() {
			return "B";
		}
	};

	CoffeSize(int size) { this.size = size; }

	private final int size;

	public String getLidCode() {
		return "A";
	}
}

enum Sex {
	MALE, FEMALE
}

enum Sex2 {
	MALE, FEMALE;
}

class Class1 {
	Sex s;

	public void print() {
		System.out.println(s.MALE.ordinal() + s.FEMALE.ordinal() + Sex2.MALE.ordinal() + Sex.FEMALE.ordinal());
	}
}