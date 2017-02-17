package zadaci_16_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde.
 * Metoda treba da koristi sljedeæi header: public static String
 * convertMillis(long millis). Metoda treba da vraæa vrijeme kao string u
 * formatu sati:minute:sekunde. Na primjer convertMillis(100000) treba da
 * vrati 0:1:40.
 */

public class TimeConverter {

	// method which convert milliseconds to seconds:minutes,hours
	private static void printConvertedTime(int millis) throws Exception {

		if (millis < 0) {
			throw new Exception();
		}
		
		int hours =0;
		int minutes =0;
		int seconds = 0;

		for (int i = 0; i < millis; i++) {
			
			if(i % 1000 ==0){
				seconds++;
			}else if (seconds==60) {
				minutes++;
				seconds=0;
			}else if(minutes == 60){
				hours++;
				minutes=0;
			}
			
		}

		// print results
		System.out.println("Rezultat konverzije je:   " + hours + ":" + minutes + ":" + seconds);

	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);
		int millis;

		try {
			System.out.print("Unesite milisekunde: ");
			millis = input.nextInt();// input time for conversion

			// get results
			printConvertedTime(millis);

		} catch (Exception e) {
			System.out.println("Pogresan  unos!!!");
		} finally {
			input.close();
		}

	}

}
