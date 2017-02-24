package zadaci_23_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese Social Security Number
 * (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da
 * provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije,
 * program pita korisnika da pokuša ponovo. Ukoliko jeste unešen u pravom
 * formatu, program završava sa radom.
 */

public class SocialSecurityNumber {
	
	//method which check is SSN number legal
	private static boolean isLegitSSN(String ssn){
		
		//check for positions of digits 
		for (int i = 0; i <ssn.length(); i++) {
			if (!Character.isDigit(ssn.charAt(i)) && !(ssn.charAt(i) == '-')  ) {
				return false;
				
			}
		}
		
		//check for position of '-'
		if (ssn.charAt(3) != '-' && ssn.charAt(6) != '-' && ssn.length() != 11) {
			System.out.println("false 2");
			return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		String ssn;
		
		while(true){
		try {
			//input ssn number
			System.out.print("Unesite SSN broj: ");
			ssn = input.nextLine();
			
			//print result
			if (isLegitSSN(ssn)) {
				System.out.println("SSN broj je validan.\n");
				break;
			}else{
				System.out.println("Broj nije validan, pokusajte ponovo.\n");
			}
			
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
			input.nextLine();
		}
		}
		
		input.close();

	}

}
