package zadaci_11_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese neki cijeli broj te
 * ispisuje njegove najmanje faktore u rastuæem redosljedu. Na primjer,
 * ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2 * 2
 * * 2 * 3 * 5 = 120)
 */

public class NumberFactors {

	// print smallest factors in number
	private static void printFactors(int number) {
		
		
		System.out.print("Najmanji faktori broja " + number + " su: ");
		// iterate while number is less or equal to 1
		for (int i = 2;; i++) {

			if(number  == 1){
				System.out.println(1);
				break;
				}
			
			if ((number % i) == 0) {// check if number is divisible

				number /= i; // divide number with i
				System.out.print(i); // print divisor in one line
				i = 1;// reset divisor

				// do not print last comma
				if (!(number <= 1)) {
					System.out.print(",");
				}

			}

			// if number is smaller or equal than 1, then we can't divide it
			// more
			if (number <= 1) {
				break;
			}

		}

	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.println("Unesite broj: ");
		while (true) {
			try {
				
				number = input.nextInt();//input one integer

				if (number > 0) {
					//print results
					printFactors(number);
					break;
				} else {
					//try again
					System.out.println("Unesite broj veci od 0: ");
				}
			} catch (Exception e) {
				//try again
				System.out.println("Greska, pokusajte ponovo!!!");
				System.out.println("Unos: ");
				input.nextLine();
			}
		}
		input.close();
	}

}
