package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IMismatch {

	public static void main(String[] args) {

		//test
		
		Scanner input = new Scanner(System.in);

		int number1, number2;

		while (true) {
			try {
				System.out.print("Enter number 1: ");
				number1 = input.nextInt();
				
				break;
			} catch (InputMismatchException e) {
				System.out.println("Try again\n");
				input.nextLine();
			}
		}

		while (true) {
			try {
				System.out.print("Enter number 2: ");
				number2 = input.nextInt();
				
				break;
			} catch (InputMismatchException e) {
				System.out.println("Try again");
				input.nextLine();
			}
		}
		
		System.out.println("Sum of " + number1 + " and " + number2 + " is " + (number1 + number2) );
		input.close();
	}

}
