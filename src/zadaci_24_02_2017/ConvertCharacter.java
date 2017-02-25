package zadaci_24_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji prima karakter te vraca njegov Unicode. Primjer:
 * ukoliko korisnik unese karakter E program mu vraca 69 kao unicode za taj
 * karakter.
 */

public class ConvertCharacter {

	//method which convert character in to his UNICODE number
	private static int convert(char character) {

		//convert and return number
		return (int)(character);
		
	}

	public static void main(String[] args) {
		// Test
		
				Scanner input = new Scanner(System.in);
				char character;
				
				try {
					//input character
					System.out.print("Unesite jedan karakter \n(kod stringa uzima prvi karakter): ");
					character = input.nextLine().charAt(0);
					
					//print results
					System.out.println("Unicode za \""+ character +"\" karakter je: " + convert(character));
					
				} catch (Exception e) {
					System.out.println("Pogresan unos!!!");
				}finally{
					input.close();
				}
				

	}

}
