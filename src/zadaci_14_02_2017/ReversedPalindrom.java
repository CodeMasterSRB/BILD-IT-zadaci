package zadaci_14_02_2017;

import java.util.Scanner;

/*
 * Napisati metode sa sljedeæim headerima: public static int reverse(int
 * number) i public static boolean isPalindrome(int number). Prva metoda
 * prima cijeli broj kao argument i vraæa isti ispisan naopako. (npr.
 * reverse(456) vraæa 654.) Druga metoda vraæa true ukoliko je broj
 * palindrom a false ukoliko nije. Koristite reverse metodu da
 * implementirate isPalindrome metodu. Napišite program koji pita korisnika
 * da unese broj te mu vrati da li je broj palindrome ili ne.
 */

public class ReversedPalindrom {

	// method which reverse number
	public static int reverse(int number) {

		String reversedNumber = "";

		// reverse number one by one decimal place
		while (number != 0) {
			reversedNumber += number % 10;// add last element from number
			number /= 10;

		}

		return Integer.parseInt(reversedNumber);

	}

	// method which determine is number palindrome or not
	public static boolean isPalindrome(int number) {

		// reverse inputed number
		String tempNumber = Integer.toString(reverse(number));
		String inputedNumber = Integer.toString(number);

		
		// determine is number palindrom or not
		if (tempNumber.equals(inputedNumber)) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);
		int number;
		boolean isPalindrome;

		while (true) {
			try {
				System.out.print("Unesite broj: ");
				number = input.nextInt();

				// determine is inputed number palindrome or not
				isPalindrome = isPalindrome(number);

				if (isPalindrome) {
					System.out.println("Uneseni broj je palindrom");
				} else {
					System.out.println("Uneseni broj nije palindrom");
				}

				break;
			}catch(NumberFormatException e){
				System.out.println("Negativni brojevi nisu palindromi");
				break;
			}catch (Exception e) {
				// inputed data is incorrect
				System.out.println("Broj nije pravilno unesen!!!\nPokusajte ponovo\n\n");

				input.nextLine();
			}
		}

		input.close();

	}

}
