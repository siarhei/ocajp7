import java.util.List;
import java.util.ArrayList;
import static java.lang.System.out;

public class TestArrayList {
	public static void main(String[] args) {
		add();
		add2();
		clear();
		contains();
		get();
		indexOf();
		remove();
		remove2();
		size();
	}

	static void add() {
		List<String> list = new ArrayList<String>();
		prln("add method: ");
		
		list.add("one");
		plist(list); //one

		list.add("two");
		list.add("three");
		plist(list); //one, two, three
	}

	static void add2() {
		List<String> list = new ArrayList<String>();
		prln("add2 method: ");
		
		list.add("one");
		list.add("two");
		plist(list); //one, two

		list.add(1, "three");
		plist(list); // one, three, two
	}

	static void clear() {
		List<String> list = new ArrayList<String>();
		prln("clear method: ");
		list.add("one");
		list.add("two");
		plist(list); //one, two

		list.clear();
		plist(list); // []
	}

	static void contains() {
		List<String> list = new ArrayList<String>();
		prln("contains method: ");
		list.add("one");
		list.add("two");
		plist(list); //one, two

		prln("list.contains(\"one\") = " + list.contains("one")); //true
		prln("list.contains(\"One\") = " + list.contains("One")); //false
	}

	static void get() {
		List<String> list = new ArrayList<String>();
		prln("get method: ");
		list.add("one");
		list.add("two");
		plist(list); //one, two

		prln("list.get(1) = " + list.get(1)); //two
	}

	static void indexOf() {
		List<String> list = new ArrayList<String>();
		prln("indexOf method: ");
		list.add("one");
		list.add("two");
		plist(list); //one, two

		prln("list.indexOf(\"one\") = " + list.indexOf("one")); //0
		prln("list.indexOf(\"three\") = " + list.indexOf("three")); //-1
	}

	static void remove() {
		List<String> list = new ArrayList<String>();
		prln("remove method (by index): ");
		list.add("one");
		list.add("two");
		plist(list); //one, two

		list.remove(0);
		plist(list); //two
	}

	static void remove2() {
		List<String> list = new ArrayList<String>();
		prln("remove method (by object): ");
		list.add("one");
		list.add("two");
		plist(list); //one, two

		list.remove("two");
		plist(list); //one

		list.remove("third");
		plist(list); //one
	}

	static void size() {
		List<String> list = new ArrayList<String>();
		prln("remove method (by object): ");
		list.add("one");
		list.add("two");
		plist(list); //one, two

		prln("list.size() = " + list.size()); //2
	}

	static void prln(String s) {
		out.println(s);
	}

	static void plist(List list) {
		prln("list = " + list);
	}
}