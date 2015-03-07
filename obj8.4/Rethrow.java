import java.io.*;

public class Rethrow {
	public void doStuff() {
		try {
			//
			throw new IOException("");
		} catch (IOException e) {
			//throw e; //error: unreported exception IOException; must be caught or declared to be thrown
			throw new RuntimeException(e); //OK
		} finally {
			System.out.println("finally");
		}
	}
}