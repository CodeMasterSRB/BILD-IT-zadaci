package zadaci_28_02_2017;

import java.util.Scanner;

/*
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are
 * strictly identical if their corresponding elements are equal. Write a
 * method that returns true if m1 and m2 are strictly identical, using the
 * following header: public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of
 * integers and displays whether the two are strictly identical. Here are
 * the sample runs.
 */

public class StrictlyIdenticalArray {


	// check whether niz1 and niz2 are equals
	public static boolean equals(int[] niz1, int[] niz2) {

		// return false if element are not in the same position or they have
		// different value
		for (int i = 0; i < niz2.length; i++) {

			if (niz1[i] != niz2[i]) {
				return false;
			}

		}

		// niz1 and niz2 are equals
		return true;
	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		;

		while (true) {

			try {

				// input 10 elements for first array
				System.out.println("Unesite 5 elemenata za prvi niz: ");
				for (int i = 0; i < array1.length; i++) {
					array1[i] = input.nextInt();
				}

				// input 10 elements for second array
				System.out.println("Unesite 5 elemenata za drugi niz: ");
				for (int i = 0; i < array2.length; i++) {
					array2[i] = input.nextInt();
				}

				// check their equality
				if (equals(array1, array2)) {
					System.out.println("Nizovi su jednaki");
					break;
				} else {
					System.out.println("Nizovi nisu jednaki");
					break;
				}

			} catch (Exception e) {
				System.out.println("Greska, pokusajte ponovo!!!");
				input.nextLine();
			}

		}

		input.close();

	}

}
