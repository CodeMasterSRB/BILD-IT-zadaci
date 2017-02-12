package zadaci_11_02_2017;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem
 * redosljedu: public static void displaySortedNumbers(double num1, double
 * num2, double num3). Napisati program koji pita korisnika da unese tri
 * broja te ispiše ta tri broja u rastuæem redosljedu.
 */

public class SortNumbers {

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double[] array = { num1, num2, num3 }; // add numbers in array

		Arrays.sort(array);// sort numbers

		// print numbers in ascending order

		System.out.println("Result: ");

		for (int i = 0; i < array.length; i++) {
			// print one number per iteration
			System.out.println(array[i]);
		}

	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);
		double num1, num2, num3;

		// input three numbers and print result
		while (true) {
			try {
				System.out.println("Unesite prvi broj: ");
				num1 = input.nextDouble();

				System.out.println("Unesite drugi broj: ");
				num2 = input.nextDouble();

				System.out.println("Unesite treci broj: ");
				num3 = input.nextDouble();

				displaySortedNumbers(num1, num2, num3); // print result
				break;
			} catch (Exception e) {
				//try again
				System.out.println("Greska, pokusajte ponovo");
				input.nextLine();
			} 
			
		}
		
		input.close();
	}

}
