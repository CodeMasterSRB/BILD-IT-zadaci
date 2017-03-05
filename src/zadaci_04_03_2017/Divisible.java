package zadaci_04_03_2017;

import java.math.BigInteger;

/*
 * (Divisible by 5 or 6) Find the first ten numbers greater than
 * Long.MAX_VALUE that are divisible by 5 or 6.
 */

public class Divisible {
	

	private static void printNumbers() {

		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		BigInteger i = new BigInteger("0");

		for (int j = 0; j < 10;) {

			if (i.compareTo(number.remainder(new BigInteger("5"))) == 0
					|| i.compareTo(number.remainder(new BigInteger("6"))) == 0) {
				System.out.println(number);
				j++;
			}
			number = number.add(new BigInteger("1"));

		}

	}

	public static void main(String[] args) {
		// test
		printNumbers();
	}

}
