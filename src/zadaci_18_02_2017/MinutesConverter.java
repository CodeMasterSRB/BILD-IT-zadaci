package zadaci_18_02_2017;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * Napisati program koji pita korisnika da unese broj minuta (npr. 1
 * milijardu) te ispiše korisniku koliko je to u godinama i danima. Zbog
 * jednostavnosti, pretpostavimo da godina ima 365 dana.
 */

public class MinutesConverter {

	// method which convert minutes to days and years
	private static void convertAndPrint(long min) throws Exception {
		
		//validation
		if (min < 0) {
			throw new Exception();
		}

		// convert minutes to days and years
		long days = TimeUnit.MINUTES.toDays(min);
		long years = days / 365;
		days = days % 365;

		// print results
		System.out.println("\nRezultat: " +years + " godina/e i " + days + " dana");

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long minutes;
		
		
		try {
			
			System.out.println("Konvertor: Minute -> godine:dane\n");
			
			System.out.print("Unesite broj minute koje zelite konvertovati: ");
			minutes = input.nextLong();//input minutes for conversion
			
			//print results
			convertAndPrint(minutes);
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		} finally {
			input.close();
		}

	}

}
