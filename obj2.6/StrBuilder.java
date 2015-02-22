import static java.lang.System.out;

public class StrBuilder {
	public static void main(String[] args) {
		append();
		delete();
		insert();
		reverse();
	}

	static void append() {
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
		sb.append(.1_1F);
		out.println("sb = " + sb); //abcdef0.11
	}

	//signature [start, end)
	static void delete() {
		StringBuilder sb = new StringBuilder("first_second_third");
		//need to delete "_second"
		sb.delete(5, 12);
		out.println("sb = " + sb); //first_third
		out.println(sb.delete(5, 6)); //firstthird
	}

	//insert(int offset, String s)
	static void insert() {
		StringBuilder sb = new StringBuilder("firstthird");
		out.println(sb.insert(5, "_second_")); //first_second_third
		out.println(new StringBuilder("ac").insert(1, 'b'));//abc
	}

	static void reverse() {
		StringBuilder sb = new StringBuilder("0123456789");
		out.println(sb.reverse()); //9876543210
	}
}