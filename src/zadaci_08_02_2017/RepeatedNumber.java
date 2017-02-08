package zadaci_08_02_2017;

import java.util.Scanner;

public class RepeatedNumber {

	// Count how many greatest number is repeated
	public static void countRepeatedNumber() {

		Scanner input = new Scanner(System.in);

		int number = -1;
		int greatest = 0;
		int repeated = 0;
		int temp = 0;

		do {
			try {
				System.out.print("Enter number [0 for exit]:");
				number = input.nextInt(); // input number

				if (number > temp) { // Check whether number is greater than the
										// previous
					repeated = 1; // reset num of repeated
					greatest = number;
					temp = number; // save currently number
				} else if (number == greatest) {
					repeated++; // increase repeated
				}
			} catch (Exception e) {
				System.out.println("Wrong, try again");
				input.nextLine();
			}

		} while (number != 0); // 0 is for terminating app

		// print results
		System.out.println("\nGreatest number " + greatest + " is repeated " + repeated + " times");

		input.close();
	}

	public static void main(String[] args) {
		// Test

		countRepeatedNumber();
	}

}
