package zadaci_13_02_2017;

import java.util.Scanner;

/*
 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima
 * godišnju interesnu stopu od 5%. Mjeseèna interesna stopa je stoga 0.05 /
 * 12 = 0.00417. Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 +
 * 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na raèunu postaje
 * (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon treæeg mjeseca,
 * vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i
 * tako dalje. Napisati program koji pita korisnika da unese mjeseèni iznos
 * štednje te broj mjeseci nakon kojeg bi želio znati stanje raèuna.
 */

public class Accaount {

	// method which calculate interest rate based on months
	private static void calculateInterestRate(double uplata, double mjeseci) throws Exception {

		if (uplata <= 0 || mjeseci <= 0) {
			throw new Exception();
		}

		int counter = 0;
		double temp = 0;
		double temp1 = 0;

		// calculate interest rate for each month
		while (counter != mjeseci) {
			temp = (uplata + temp1) * (1 + 0.00417);
			temp1 = temp;
			System.out.println(temp1);

			counter++;
		}
	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		double uplata;
		double mjeseci;

		try {

			// input amount of money
			System.out.println("Unesite iznos koji uplacujete:");
			uplata = input.nextDouble();

			// input number of months
			System.out.println("Unesite broj mjeseci: ");
			mjeseci = input.nextDouble();

			// print results
			calculateInterestRate(uplata, mjeseci);

		} catch (Exception e) {
			System.out.println("Greska!!!");

		} finally {
			input.close();
			input.close();
		}

	}

}
