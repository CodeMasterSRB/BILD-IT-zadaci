package zadaci_21_02_2017;

import zadaci_14_02_2017.ReversedPalindrom;
import zadaci_20_02_2017.Prime;

public class PalindromePrime {

	/*
	 * Palindrome prime je prosti broj koji je takoðer i palindrom. Na primjer,
	 * 131 je palindrome prime, kao i brojevi 313 i 757. Napisati program koji
	 * ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji.
	 */

	public static void main(String[] args){
		
		try{
		for (int i = 0 , j=0; j != 100; i++) {
		
		if (Prime.isPrime(i) && ReversedPalindrom.isPalindrome(i)) {
			System.out.print(i + " ");
			j++;
			
			if (j % 10 ==0 && j != 0) {
				System.out.println();
			}
		}
		
		}
		}catch (Exception e) {
			System.out.println("Greska!!!");
		}
	}
}
