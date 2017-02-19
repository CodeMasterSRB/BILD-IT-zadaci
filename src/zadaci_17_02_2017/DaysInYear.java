package zadaci_17_02_2017;

import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi
 * header: public static int numberOfDayInAYear(int year). Napisati program
 * koji pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje
 * broj dana za svaku godinu u rasponu.
 */

public class DaysInYear {

	//method which return number of days in selected year
	
	private static int numberOfDayInAYear(int year) throws Exception{
		
		if (year <= 0) {
			throw new Exception();
		}
		
		//if is leap year return 366
		if (new GregorianCalendar().isLeapYear(year)) {
			return 366;
		} else {
			return 365;
		}
		
	}
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int year;
		
		System.out.println("Koliko godina ima dana\n\n");
		try {
			System.out.print("Unesite godinu:");
			year = input.nextInt();
			
			//print result
			System.out.println("\n" +year + "-ta godina ima " + numberOfDayInAYear(year) + " dana");
		} catch (Exception e) {
			System.out.println("Niste dobro unijeli godinu!!!");
		}finally {
			input.close();
		}
		
	}

}
