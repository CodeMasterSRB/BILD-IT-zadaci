package zadaci_24_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji prima ASCII kod (cijeli broj izmedju 0 i 127) te
 * ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao
 * ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.
 */

public class ConvertASCII {
	
	//method which convert ASCII code in to his character
	private static char convert(int asciiNumber) throws Exception{
		
		if (asciiNumber < 0 || asciiNumber > 127) {
			throw new Exception();
		}
		
		//convert and return
		return (char)(asciiNumber);
		
	}

	public static void main(String[] args) {
		// Test
		
		Scanner input = new Scanner(System.in);
		int asciiNumber;
		
		try {
			//input ASCII number
			System.out.print("Unesite ASCII kod (0-127): ");
			asciiNumber = input.nextInt();
			
			//print results
			System.out.println("Karakter je: " + convert(asciiNumber));
			
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}finally{
			input.close();
		}
		

	}

}
