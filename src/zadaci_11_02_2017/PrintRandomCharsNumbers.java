package zadaci_11_02_2017;

import java.util.concurrent.ThreadLocalRandom;

/*
 * Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100
 * nasumiènih brojeva, 10 po liniji.
 */

public class PrintRandomCharsNumbers {

	// print 100 random char and 100 random number
	private static void printRandomCharAndNumber() {

		for (int i = 1; i <= 100; i++) {

			// print one number in one iteration
			System.out.print(ThreadLocalRandom.current().nextInt(1, 100 + 1) + " ");

			// print one char in one iteration
			System.out.print((char) (ThreadLocalRandom.current().nextInt(65, 90 + 1)) + " ");

			if (i % 5 == 0) {
				System.out.println();
			}

		}

	}

	public static void main(String[] args) {

		// Test
		printRandomCharAndNumber();

	}

}
