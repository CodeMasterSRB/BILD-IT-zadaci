package zadaci_13_02_2017;

import java.util.Scanner;

/*Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. */

public class ReverseNumbers {

	private static int[] reverseInputedNumbers(int[] array) {

		int[] newArray = new int[10];

		// reverse numbers in array
		for (int i = 0, j = 9; i < array.length; i++, j--) {
			newArray[i] = array[j];
		}

		return newArray;
	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);
		int[] array = new int[10];

		System.out.print("Unesite 10 cijelih brojeva\n\n");
		while (true) {
			try {

				// input 10 integers in array
				for (int i = 0; i < 10; i++) {
					System.out.println("Unos" + "[" + (i + 1) + "]" + ":");
					array[i] = input.nextInt();// input one integer per
												// iteration
				}

				// printing results
				System.out.println("Brojevi u obrnutom redosledu: ");
				for (int i = 0; i < array.length; i++) {
					//reverse inputed numbers
					System.out.println(reverseInputedNumbers(array)[i]);
				}
				break;// terminate program

			} catch (Exception e) {
				//back to first input
				System.out.println("Pogresan unos, pokusajte ponovo!!!");
				input.nextLine();// clear input
			}
		}
		input.close();

	}

}
