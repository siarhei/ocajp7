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