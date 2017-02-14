package zadaci_14_02_2017;

import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * . Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u
 * rasponu godina koje korisnik unese. Program pita korisnika da unese
 * poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
 * Razmak izmeðu godina treba biti jedan space.
 */

public class LeapYear {


	// method which print all leap years in range start-end
	private static void printLeapYear(int start, int end) throws Exception {
		if ((start <= 0 || end <= 0) || (start >= end)) {
			throw new Exception("Niste pravilno unijeli godine\nPokusajte ponovo\n");
		}

		System.out.println("\nAll leap year from " + start + " to " + end + " are: ");
		for (int i = start, j = 0; i <= end; i++) {

			// is leap year
			if (new GregorianCalendar().isLeapYear(i)) {
				j++;
				// print it
				System.out.print(i + " ");

			}

			// print new line for every 10 element in line
			if (j % 10 == 0 && j != 0) {
				System.out.println();
				j = 0;
			}

		}

	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);
		int startYear;
		int endYear;

		while (true) {
			try {
				System.out.print("Unesite pocetnu godinu: ");
				startYear = input.nextInt();// input start year

				System.out.print("Unesite zavrsnu godinu: ");
				endYear = input.nextInt();// input last year

				// count and print results
				printLeapYear(startYear, endYear);

				break;
			} catch (InputMismatchException e) {
				// inputed years are not in correct range
				
				System.out.println("Pogresan unos, pokusajte ponovo!!!\n\n");
				input.nextLine();
			} catch (Exception e) {
				
				// inputed data is incorrect
				System.out.println(e.getMessage());

				input.nextLine();
			}
		}

		input.close();

	}

}
