package zadaci_04_03_2017;

import java.math.BigInteger;

/*
 * Find the first ten square numbers that are greater than Long.MAX_VALUE. A
 * square number is a number in the form of n2. For example, 4, 9, and 16
 * are square numbers. Find an efficient approach to run your program fast.
 */

public class SquareNumbers {

	/**
	 * This method find the first ten square numbers that are greater than
	 * Long.MAX_VALUE
	 */
	private static void printSquareNumbers() {

		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		BigInteger finish = number.add(new BigInteger("10"));

		for (number = new BigInteger(Long.MAX_VALUE + ""); number.compareTo(finish) <= 0; number = number
				.add(new BigInteger("1"))) {
			System.out.println(number.multiply(number));
		}

	}

	public static void main(String[] args) {
		// Test
		printSquareNumbers();

	}

}
