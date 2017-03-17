package zadaci_10_03_2017;

/*
 * Write a program that causes the JVM to throw an OutOfMemoryError and
 * catches and handles this error.
 */

public class OutOfMemoryEror {

	static final int SIZE = 2 * 1024 * 1024000;

	public static void main(String[] a) {
		try {
			int[] i = new int[SIZE];
			System.out.println(i);
		} catch (OutOfMemoryError e) {
			System.out.println("Eror");
		}
	}

}
