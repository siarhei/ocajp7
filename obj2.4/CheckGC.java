import java.util.Date;
import static java.lang.System.out;

public class CheckGC {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		out.println("Total JVM memory: " + rt.totalMemory());
		out.println("Free JVM memory: " + rt.freeMemory());

		//Date d = null;
		for (int i = 0; i < 100000; i++) {
			new Date();
			//d = null;
			rt.gc();
			out.println("After GC free memory: " + rt.freeMemory());
		}

		out.println("After free memory: " + rt.freeMemory());
		//rt.gc();
		System.gc();
		out.println("After GC free memory: " + rt.freeMemory());
	}
}