package zadaci_25_02_2017;

import java.util.Scanner;

/*
 * (Pattern recognition: consecutive four equal numbers) Write the following
 * method that tests whether the array has four consecutive numbers with the
 * same value. public static boolean isConsecutiveFour(int[] values) Write a
 * test program that prompts the user to enter a series of integers and
 * displays if the series contains four consecutive numbers with the same
 * value. Your program should first prompt the user to enter the input
 * size—i.e., the number of values in the series.
 */

public class PatternRecognition {

	// method which check whether Array has 4 consecutive numbers
	public static boolean isConsecutiveFour(int[] values) {

		int numberOfConsecutive = 1;

		for (int i = 0; i < values.length - 1; i++) {

			if (values[i] == values[i + 1]) {
				// increment consecutive
				numberOfConsecutive++;
				
				
				if (numberOfConsecutive == 4) {
					//Array has four consecutive numbers
					return true;
				}
				
			} else {
				// reset consecutive
				numberOfConsecutive = 1;
			
			}

		}

		return false;

	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);

		int[] values;
		int valuesLength;

		try {
			// enter length of Array
			System.out.print("Koliko zelite brojeva da unesete: ");
			valuesLength = input.nextInt();
			values = new int[valuesLength];

			// enter numbers
			for (int i = 0; i < values.length; i++) {
				System.out.print("Unesite broj: ");
				values[i] = input.nextInt();
			}

			// print result
			if (isConsecutiveFour(values)) {
				System.out.println("\nNiz sadrzi cetiri ista broja koja se uzastopno ponavljaju");
			} else {
				System.out.println("\nNiz ne sadrzi cetiri ista broja koja se ponavljaju");
			}

		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		} finally {
			input.close();
		}

	}

}
