package zadaci_04_03_2017;

import java.math.BigInteger;

/*
 * Write a program that finds five prime numbers larger than Long.MAX_VALUE.
 */

public class LargePrimeNumbers {

	// is prime or not
	public static boolean isPrime(BigInteger n) {
		for (BigInteger d = new BigInteger("2"); d.compareTo(n.divide(new BigInteger("2"))) <= 0; d = d
				.add(new BigInteger("1"))) {
			if (n.remainder(d).compareTo(new BigInteger("0")) == 0) {
				return false;//number is not prime
			}
		}
		return true;
	}

	private static void printPrimeNumbers() {

		BigInteger number = new BigInteger(Long.MAX_VALUE + "");

		for (int i =0; i< 5;) {

			if (isPrime(number)) {
				System.out.println(number);
				i++;
			}
			number= number.add(new BigInteger("1"));
		}

	}

	public static void main(String[] args) {
		// test
		printPrimeNumbers();

	}

}
