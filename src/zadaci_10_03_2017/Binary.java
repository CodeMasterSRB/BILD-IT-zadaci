package zadaci_10_03_2017;

import java.math.BigInteger;

/*
 * (NumberFormatException) Write the bin2Dec(String binaryString) method to
 * convert a binary string into a decimal number. Implement the bin2Dec
 * method to throw a NumberFormatException if the string is not a binary
 * string.
 */

public class Binary {

	/**
	 * method to convert a binary string into a decimal number.
	 * 
	 * @param binaryString
	 * @return
	 */
	private static double bin2Dec(String binaryString) throws Exception {

		return Double.longBitsToDouble(new BigInteger(binaryString, 2).longValue());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(bin2Dec("1100600110011101010111011000101011011000011111111111111111111110"));
		} catch (NumberFormatException e) {
			System.out.println("Wrong, Number format exception!!!");
		} catch (Exception e) {
			System.out.println("Wrong");
		}

	}

}
