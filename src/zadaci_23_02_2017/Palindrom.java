package zadaci_23_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese cijeli trocifreni broj
 * te provjerava da li je unijeti broj palindrom. Broj je palindrom
 * ukoliko se cita isto i sa lijeva na desno i sa desna na lijevo npr.
 * 121, 131, itd.
 */

public class Palindrom {

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
	public static boolean isPalindrome(int number) throws Exception {

		// reverse inputed number
		String tempNumber = Integer.toString(reverse(number));
		String inputedNumber = Integer.toString(number);
		
		if (inputedNumber.length()!=3) {
			throw new Exception();
		}

		// determine is number palindrom or not
		if (tempNumber.equals(inputedNumber)) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		//test
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		try {
			System.out.print("Unesite jedan cijeli trocifren broj: ");
			number = input.nextInt();
			
			//print result
			if (isPalindrome(number)) {
				System.out.println("Broj je palindrom");
			}else{
				System.out.println("Broj nije palindrom");
			}
			
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}finally{
			input.close();
		}

	}

}
