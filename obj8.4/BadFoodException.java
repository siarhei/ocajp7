import static java.lang.System.out;

public class BadFoodException extends Exception {
	public static void main(String[] args) {
		try {
			checkFood(args);
		} catch (BadFoodException e) {
			out.println("Exception occured");
			e.printStackTrace();

			out.println("rethrowing");
			throw new RuntimeException(e);
		} finally {
			out.println("finally");
		}
	}

	static String checkFood(String[] food) throws BadFoodException {
		if (food == null || food.length == 0) {
			throw new BadFoodException();
		}
		return "ok";
	}
}

class IfStatement {
	void go() {
		final int a;
		if (rand() >= 5) {
			a = 5;
		} else {
			a = 0;
		}
		switch (a) {
			case 0:
			default:
		}
	}

	int rand() {
		return 5;
	}

/*
	void unflow(boolean flag) {
	    final int k;
	    if (flag) {
	        k = 3;
	        System.out.println(k);
	    }
	    if (!flag) {
	        k = 4;
	        System.out.println(k);  // k is not "definitely unassigned" before this statement
	    }
	}*/
}

class CC {
	void doStuff() throws Exception {}
}

class CC5 extends CC {
	void doStuff() {}
}