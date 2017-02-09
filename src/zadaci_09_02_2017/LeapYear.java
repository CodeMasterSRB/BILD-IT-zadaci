package zadaci_09_02_2017;

/*Napisati program koji ispisuje sve prestupne godine, 
 * 10 po liniji, od godine 101 do 2100, odvojene jednim spaceom. 
 * Takoðer ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.*/

public class LeapYear {

	// print all leap year from parameter firstYear to parameter last year
	private static void leapYear(int firstYear, int lastYear) {

		int numberOfLeapYears = 0;

		for (int i = firstYear; i <= lastYear; i++) { // iterate from first year
														// to last

			if (java.time.Year.of(i).isLeap()) {
				numberOfLeapYears++; // count number of leap years
				System.out.print(i + " "); // print one leap year

				if (numberOfLeapYears % 10 == 0) { // new line on every 10
													// element
					System.out.println();
				}

			}

		}
		
		//print number of leap years
		System.out.println("\n\nNumber of leap years between " + firstYear + " and " + lastYear + " is " + numberOfLeapYears);

	}

	public static void main(String[] args) {
		// Test

		leapYear(101, 2100);

	}

}
