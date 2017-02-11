package zadaci_10_02_2017;

import java.util.Scanner;

/*
 * Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi
 * na istim pozicijama jednaki. Napisati metodu koja vraæa true ukoliko su
 * nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi header:
 * public static boolean equals(int[ ] niz1, int[ ] niz2)
 * Napisati testni program koji pita korisnika da unese dva niza cijelih
 * brojeva te provjerava da li su striktno identièni.
 */

public class EqualArrays {

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
		//Test
		
		Scanner input = new Scanner(System.in);
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		;

		while (true) {

			try {
				
				//input 10 elements for first array
				System.out.println("Unesite 5 elemenata za prvi niz: ");
				for (int i = 0; i < array1.length; i++) {
					array1[i] = input.nextInt();
				}
				
				//input 10 elements for second array
				System.out.println("Unesite 5 elemenata za drugi niz: ");
				for (int i = 0; i < array2.length; i++) {
					array2[i] = input.nextInt();
				}
				
				//check their equality
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
