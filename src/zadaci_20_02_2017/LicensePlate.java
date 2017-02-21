package zadaci_20_02_2017;

import java.util.Random;

/*
 * Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase
 * karaktera i 4 broja u sljedeæem formatu AAA-1234. Napisati program koji
 * nasumièno generiše tablicu.
 */

public class LicensePlate {

	// method which randomly generate license plate
	private static String randomlyGenerateLicensePlate() {

		Random rand = new Random();
		String plate = "";

		for (int i = 0; i < 8; i++) {

			if (i < 3) {
				// generate letters
				plate += (char) (rand.nextInt(90 - 65) + 65);
				
			} else if (i == 3) {
				// generate - between numbers and letters
				plate += '-';
			} else {
				// generate numbers
				plate += (char) (rand.nextInt(57 - 48) + 48);
			}

		}
		
		return plate;

	}

	public static void main(String[] args) {
		
		try {
			//print randomly generate plate
			System.out.println("Nasumicno generisana tablica za auto: " + randomlyGenerateLicensePlate());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
