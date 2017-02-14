package zadaci_14_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje
 * sve karaktere koji se nalaze na neparnim pozicijama. Na primjer, ako
 * korisnik unese string Beijing Chicago, program vraæa BiigCiao.
 */

public class OddPosition {

	// method which return all chars on odd positions
	private static String findOddChars(String string) {
		String oddPositions = "";
		
		
		for (int i = 1; i <= string.length(); i++) {

			if (i % 2 != 0) {
				// add odd char
				oddPositions += string.charAt(i-1);
			}

		}

		return oddPositions;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string;
		while (true) {
			try {
				System.out.print("Unesite jedan string: ");
				string = input.nextLine();

				// print result
				System.out.println(findOddChars(string));
				break;
			} catch (Exception e) {
				//input is incorrect
				System.out.println("\nPogresan unos!!!\nPokusajte ponovo\n");
				input.nextLine();
			}

		}
		input.close();
	}

}
