package zadaci_23_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje
 * dužinu tog stringa kao i prvo slovo stringa.
 */

public class StringLengthAndFirstLetter {
	
	//method which return first letter in string, if string has ni letters
	//return ' '. 
	private static char firstLetter(String string){
		
		for (int i = 0; i < string.length(); i++) {
			
			if (Character.isAlphabetic(string.charAt(i))) {
				return string.charAt(i);
			}
			
		}
		
		return ' ';
		
	}
	
	//method which return string length
	private static int stringLength(String string){
		
		return string.length();
		
	}


	public static void main(String[] args) {
		//Test
		Scanner input = new Scanner(System.in);
		String string;
		char letter;
		int length;
		
		try {
			//input one string
			System.out.print("Unesite jedan string: ");
			string = input.nextLine();
			
			//get length of String
			length = stringLength(string);
			System.out.println("Duzina unesenog stringa iznosi: " + length);
			
			//get String first letter
			letter = firstLetter(string);
			if (letter!=' ') {
				System.out.println("Prvo slovo u stringu je " + letter);
			}else{
				System.out.println("U ovom stringu nema slova.");
			}
			
			
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}finally{
			input.close();
		}

	}

}
