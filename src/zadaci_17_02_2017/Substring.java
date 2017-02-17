package zadaci_17_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese dva stringa te provjerava i
 * ispisuje da li je drugi string substring prvog stringa. Na primjer,
 * ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string program
 * mu ispisuje da je BC substring ABCD stringa.
 */

public class Substring {

	// method which check if secondString is substring of firstString
	private static boolean isSubtring(String firstString, String secondString) {

		if (firstString.contains(secondString)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// Test

		String firstString, secondString;

		Scanner input = new Scanner(System.in);

		System.out.println("Provjerite da li je drugi uneseni string substring prvog [Case Sensitive]\n");
		try {
			System.out.print("Unesite prvi string: ");
			firstString = input.nextLine();

			System.out.print("Unesite drugi string: ");
			secondString = input.nextLine();

			if (isSubtring(firstString, secondString)) {
				System.out.println("\n" + secondString + " je substring " + firstString);
			} else {
				System.out.println("\n" + secondString + " nije substring " + firstString);
			}

		} catch (Exception e) {
			System.out.println("Greska!!!");
		} finally {
			input.close();
		}

	}

}
