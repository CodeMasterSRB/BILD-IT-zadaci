package zadaci_14_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji uèitava iznos investicije, godišnju interesnu stopu
 * i broj godina te vraæa buduæu vrijednost investicije koristeæi se
 * sljedeæom formulom: buducaVrijednostInvesticije = iznosInvesticije * (1 +
 * mjesecnaInteresnaStopa)^brojGodina*12. Na primjer, ukoliko uneste kao
 * iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 kao broj
 * godina program vam vraæa 1032.98 kao buducu vrijednost investicije.
 */

public class Investment {

	// method which calculate annual interest rate
	private static double countInvestment(double valueOfInvestment, double monthAnnualInterest, int years)
			throws Exception {

		if (valueOfInvestment <= 0 || monthAnnualInterest < 0 || years <= 0) {

			throw new Exception();

		}

		monthAnnualInterest /= 12;

		// calculate investment
		return valueOfInvestment * Math.pow((1 + monthAnnualInterest / 100), (years * 12));

	}

	public static void main(String[] args) {
		// test

		Scanner input = new Scanner(System.in);
		double valueOfInvestment;
		double monthAnnualInterest;
		int years;

		while (true) {
			try {
				System.out.println("Racunanje investicije: \n");
				
				System.out.print("Unesite iznos investicije: ");
				valueOfInvestment = input.nextDouble();

				System.out.print("Unesite godisnju kamatnu stopu: ");
				monthAnnualInterest = input.nextDouble();

				System.out.print("Unesite broj godina: ");
				years = input.nextInt();

				System.out.println("Rezultat: " + countInvestment(valueOfInvestment, monthAnnualInterest, years));
				break;// all inputs are correct and result are printed.
						// Terminate program
			} catch (Exception e) {
				// inputed data is incorrect
				System.out.println("Pogresan unos, pokusajte ponovo!!!\n\n");
				input.nextLine();
			}
		}
		
		input.close();
	}

}
