import java.io.*;

public class ReadData {
	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("myfile.txt", "r");
			byte b[] = new byte[1000];
			raf.readFully(b, 0, 1000);
		} catch (IOException e) {

		} catch (FileNotFoundException e) { //error: exception FileNotFoundException has already been caught

		}
	}
}