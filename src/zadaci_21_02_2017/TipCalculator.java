package zadaci_21_02_2017;

import java.util.Scanner;

/*
 * (Izraèunavanje napojnice) Napisati program koji uèitava ukupan iznos
 * raèuna koji treba uplatiti kao i procenat tog raèuna kojeg želimo platiti
 * kao napojnicu te izraèunava ukupan raèun i napojnicu. Na primjer, ukoliko
 * korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu program
 * treba da ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5.
 */

public class TipCalculator {

	// method which calculate tip percentage from bill
	private static void calculateTipPercent(double bill, double tip) throws Exception {
		
		if (bill <= 0 || tip < 0) {
			throw new Exception();
		}

		// calculate tip
		System.out.println("Iznos napojnice je:  " + (bill * tip / 100));

		// calculate full bill
		System.out.println("Ukupan iznos racuna je: " + (bill + (bill * tip / 100)));

	}

	public static void main(String[] args) {
		// test
		Scanner input = new Scanner(System.in);
		double bill, tip;

		try {
			System.out.println("Unesite vrijednost vaseg racuna: ");
			bill = input.nextDouble();

			System.out.println("Unesite napojnicu u procentima: ");
			tip = input.nextDouble();
			
			//print results
			calculateTipPercent(bill, tip);

		} catch (Exception e) {
			System.out.println("Greska!!!");
		} finally {
			input.close();
		}

	}

}
