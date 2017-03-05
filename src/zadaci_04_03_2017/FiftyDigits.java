package zadaci_04_03_2017;

import java.math.BigInteger;

/*
 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits
 * that are divisible by 2 or 3.
 */

public class FiftyDigits {


	/**
	 * Method which Find the first ten numbers with 50 decimal digits that are
	 * divisible by 2 or 3
	 */
	private static void printNumbers() {

		BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000");
		BigInteger i = new BigInteger("0");

		
		for (int j =0; j < 10;) {
			
			if (i.compareTo(number.remainder(new BigInteger("2"))) == 0 || 
					i.compareTo(number.remainder(new BigInteger("3"))) == 0) {
					System.out.println(number);
					j++;
				}
				number = number.add(new BigInteger("1"));
			
		}

	}

	public static void main(String[] args) {
		//test
		printNumbers();
	}

}
