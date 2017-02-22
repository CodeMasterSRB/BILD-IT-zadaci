package zadaci_22_02_2017;

import java.util.Random;

/*
 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te
 * ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
 */

public class RandomMonths {

	// method which generate random number between 0 and 11
	private static int generateMonth() {

		Random rand = new Random();

		return rand.nextInt(12);

	}

	private static void printMonth() {
		int month = generateMonth();

		String[] arrayMonth = { "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "Septembar",
				"Oktobar", "Novembar", "Decembar" };

		
		//print one random month
		System.out.println(arrayMonth[month]);
	}

	public static void main(String[] args) {
		//test
		
		try {
			System.out.println("Nasumicni mjesec: ");

			// print results
			printMonth();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
