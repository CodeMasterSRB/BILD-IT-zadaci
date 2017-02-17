package zadaci_16_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese cijeli broj za današnji dan
 * u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon
 * današnjeg dana te mu ispiše koji je to dan u buduænosti. (Primjer: ako
 * korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti program mu
 * ispisuje da je danas utorak a dan u buduænosti je petak.)
 */

public class FutureDayInWeek {

	// method which print future day in week based on input day
	private static void printDayInWeek(int today, int futureDay) throws Exception {

		if (today < 0 || futureDay < 0) {
			throw new Exception();
		}else if(futureDay == 0){
			System.out.println("\nMorate unijeti bar jedan dan u buducnosti");
			System.exit(0);
		}

		String[] allDays = { "ponedeljak", "utorak", "srijeda", "cetvrtak", "petak", "subota", "nedelja" };
		int tempToday = today;
		int j = today;

		// find future day
		for (int i = 0; i < futureDay; i++, j++) {

			// if future day is 6 reset days
			if (j % 7 == 0) {
				j = 0;
			}

		}
		
		//reset week
		if (j==7) {
			j=0;
		}
		
		// print results
		System.out.println("\n\nDanas je " + allDays[tempToday] + " a dan u buducnosti je " + allDays[j]);

	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);
		int today;
		int futureDay;

		try {
			System.out
					.print("Unesite cijeli broj za danasnji dan\n[0-pon, 1-uto, 2-sri, 3-cet, 4-pet, 5-sub, 6-ned]: ");
			today = input.nextInt();

			System.out.print("\nUnesite broj dana nakon danasnjeg dana: ");
			futureDay = input.nextInt();

			// print results
			printDayInWeek(today, futureDay);
		} catch (Exception e) {
			System.out.println("Pogresan unos podataka!!!");
			
		} finally {
			input.close();
		}

	}

}
