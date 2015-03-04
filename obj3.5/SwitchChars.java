import static java.lang.System.out;

public class SwitchChars {
	public static void main(String[] args) {
		switchChar();
		switchChar2();
		switchDefaultAtTop();
		switchDefaultAtTop2();
		switchDefaultAtMid();
		switchDefaultAtMid2();
		switchDefaultAtMid3();
		switchDefaultAtMid4();
	}

	static void switchChar() {
		out.println("switchChar");

		final char a;
		a = 'o';

		switch (a) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': out.println("vovel letter"); break;
			default : out.println("unknown letter");
		}
	}

	static void switchChar2() {
		out.println("switchChar2");

		final char a = 'e';

		//e i o
		switch (a) {
			case 'a': out.print(" a ");
			case 'e': out.print(" e ");
			case 'i': out.print(" i ");
			case 'o': out.print(" o "); break;
			case 'u': out.print(" u ");
			default : out.println("unknown letter");
		}
	}

	static void switchDefaultAtTop() {
		out.println("\nswitchDefaultAtTop");

		final char a = 'm';

		//?  a  e  i  o  u
		switch (a) {
			default : out.print(" ? ");
			case 'a': out.print(" a ");
			case 'e': out.print(" e ");
			case 'i': out.print(" i ");
			case 'o': out.print(" o ");
			case 'u': out.print(" u ");			
		}	
	}

	static void switchDefaultAtTop2() {
		out.println("\nswitchDefaultAtTop2");

		final char a = 'm';

		//?  a  e
		switch (a) {
			default : out.print(" ? ");
			case 'a': out.print(" a ");
			case 'e': out.print(" e "); break;
			case 'i': out.print(" i ");
			case 'o': out.print(" o ");
			case 'u': out.print(" u ");			
		}	
	}

	static void switchDefaultAtMid() {
		out.println("\nswitchDefaultAtMid");

		final char a = 'm';

		//? i o u
		switch (a) {			
			case 'a': out.print(" a ");
			case 'e': out.print(" e ");
			default : out.print(" ? ");
			case 'i': out.print(" i ");
			case 'o': out.print(" o ");
			case 'u': out.print(" u ");			
		}	
	}

	static void switchDefaultAtMid2() {
		out.println("\nswitchDefaultAtMid2");

		final char a = 'e';

		//e ? i o u
		switch (a) {			
			case 'a': out.print(" a ");
			case 'e': out.print(" e ");
			default : out.print(" ? ");
			case 'i': out.print(" i ");
			case 'o': out.print(" o ");
			case 'u': out.print(" u ");			
		}	
	}

	static void switchDefaultAtMid3() {
		out.println("\nswitchDefaultAtMid3");

		final char a = 'e';

		//e ?
		switch (a) {			
			case 'a': out.print(" a ");
			case 'e': out.print(" e ");
			default : out.print(" ? "); break;
			case 'i': out.print(" i ");
			case 'o': out.print(" o ");
			case 'u': out.print(" u ");			
		}	
	}

	static void switchDefaultAtMid4() {
		out.println("\nswitchDefaultAtMid4");

		final char a = '4';

		//?
		switch (a) {			
			case 'a': out.print(" a ");
			case 'e': out.print(" e ");
			default : out.print(" ? "); break;
			case 'i': out.print(" i ");
			case 'o': out.print(" o ");
			case 'u': out.print(" u ");			
		}	
	}
}