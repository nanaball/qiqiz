package singleton;

public class singletonTest {

	public static void main(String[] args) {
		// Printer printer = new Printer();
		Printer printerA = Printer.getInstance();
		System.out.println(printerA);
		
		Printer printerB = Printer.getInstance();
		System.out.println(printerB);
	}
}
