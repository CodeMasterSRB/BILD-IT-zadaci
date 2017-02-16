package zadaci_15_02_2017;

import java.util.Scanner;

public class Password {

	/*
	 * Neke web stranice forsiraju odreðena pravila za passworde. Napisati
	 * metodu koja provjerava da li je unijeti string validan password.
	 * Pravila da bi password bio validan su sljedeæa: 1. Password mora biti
	 * saèinjen od najmanje 8 karaktera. 2. Password smije da se sastoji
	 * samo od slova i brojeva. 3. Password mora sadržati najmanje 2 broja.
	 * Napisati program koji pita korisnika da unese password te mu ispisuje
	 * "password je validan" ukoliko su sva pravila ispoštovana ili
	 * "password nije validan" ukoliko pravila nisu ispoštovana.
	 */
	
	//method which check is password legit
	private static boolean checkPassword(String password) {

		boolean valid = true;
		int numbers = 0;

		if (password.length() < 8) {
			System.out.println("Sifra ne sadrzi dovoljan broj karaktera");
			valid = false;
			
			//check length
		} else if (password.length() >= 8) {
			for (int i = 0; i < password.length(); i++) {

				if (!(Character.isDigit(password.charAt(i)) || Character.isAlphabetic(password.charAt(i)))) {
					System.out.println("Sifra sadrzi karaktere koji nisu ni slovo ni broj");
					valid = false;
					break;
				}

			}

			//check for number of digits
			for (int j = 0; j < password.length(); j++) {
				if ((Character.isDigit(password.charAt(j)))) {
					numbers++;
				}
			}

			//check for letters
			if (numbers < 2) {
				System.out.println("Ne sadrzi dovoljno brojeva");
				valid = false;
			}
		}

		
		if (valid == true) {
			return true;
		}else{
			return false;
		}

	}

	public static void main(String[] args) {
		//test
		Scanner input = new Scanner(System.in);

		String password;
		
		try{
			System.out.println("Unesite sifru [minimum 8 karaktera i 2 broja]: ");
			password = input.nextLine();
			System.out.println();
			
			if (checkPassword(password)) {
				System.out.println("Sifra je VALIDNA");
			}else{
				System.out.println("Sifra nije VALIDNA");
			}
			
		}catch(Exception e){
			System.out.println("Doslo je do greske!!!");
		}finally {
			input.close();
		}
		
		
	}

}
