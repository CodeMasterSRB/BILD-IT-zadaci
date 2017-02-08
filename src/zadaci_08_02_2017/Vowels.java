package zadaci_08_02_2017;

import java.util.Scanner;

public class Vowels {

	// return number of vowels (A,E,I,O,U) in String
	public static int numOfVowelsInString(String string) {

		int numOfVowels = 0;

		// convert all letters from string to lower case
		string = string.toLowerCase();

		//
		for (int i = 0; i < string.length(); i++) {

			// Pass through the list and check for vowels
			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
					|| string.charAt(i) == 'u') {
				numOfVowels++;	//increase number of vowels

			}

		}

		return numOfVowels;
	}

	public static void main(String[] args) {
		// Testing

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your string");
		System.out.println("Number of vowels in this sentence is " + numOfVowelsInString(input.nextLine()));

		input.close();

	}

}
