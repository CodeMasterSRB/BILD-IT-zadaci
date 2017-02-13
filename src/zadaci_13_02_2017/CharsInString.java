package zadaci_13_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti
 * sljedeæi header: public static int countLetters(String s). Napisati
 * program koji pita korisnika da unese neki string te mu vrati koliko taj
 * string ima slova.
 */

public class CharsInString {
	
	//method which count letters in string
	public static int countLetters(String s){
	
		int numOfChars = 0;//set number of chars on 0
		
		for (int i = 0; i < s.length(); i++) {
			
			//increment number of chars if char is Alphabetic
			if (Character.isAlphabetic(s.charAt(i))) {
				numOfChars++;//increment number of chars
			}
			
		}
		
		return numOfChars;
			
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String s;
		
		try {
			System.out.print("Unesite jedan string: ");
			s = input.nextLine();//input one string
			
			//print results
			System.out.println("Broj slova u ovom stringu je "+countLetters(s));
			
		} catch (Exception e) {
			System.out.println("Pogresan unos");
		}
		
		input.close();
	}

}
