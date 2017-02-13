package zadaci_10_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te
 * printa sve proste brojeve u zadanom rangu. BONUS: metoda može primati i
 * treæi argument, broj brojeva za isprintati po liniji.
 */

public class PrimeNumber {

	// is prime or not
	private static boolean isPrime(int number) {
		
		if(number <= 1 ){
			return false;
		}
		
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) {
				return false; // number is not prime
			}
		}
		return true; // number is prime
	}

	// print prime numbers between start and end, third parameter is for number
	// elements per line
	private static void printPrimeNumbers(int start, int end, int elementsPerRow) {

		System.out.println("\nPrime numbers are: ");

		for (int iterate = 0; start < end; start++) { // iterate numbers between
														// start and end

			if (isPrime(start)) {// check if number is prime
				System.out.print(start + " "); // print prime number
				iterate++;// increment elements per line

				if (iterate % elementsPerRow == 0 && iterate != 0) {// print new
																	// line
					System.out.println();

				}
			}

		}

	}

	public static void main(String[] args) {
		// Test
		int startValue;
		int endValue;
		int elemenstPerRow;

		Scanner input = new Scanner(System.in);

		while (true) {

			try {

				System.out.print("Unesite pocetni broj: ");
				startValue = input.nextInt();// input start

				System.out.print("Unesite krajnji broj: ");
				endValue = input.nextInt();// input end

				System.out.print("Unesite broj elemenata po liniji: ");
				elemenstPerRow = input.nextInt();

				if (startValue >= 0 && endValue > startValue && elemenstPerRow > 0) {
					printPrimeNumbers(startValue, endValue, elemenstPerRow);
					break;
				} else {
					System.out.println("Pogresan unos, pokusajte ponovo\n");
				}

			} catch (Exception e) {
				System.out.println("Greska!!!");
				input.nextLine();
			}

		}
		input.close();
	}

}
