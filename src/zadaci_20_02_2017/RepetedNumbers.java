package zadaci_20_02_2017;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te
 * broji i ispisuje koliko je koji broj puta unijet. Pretpostavimo da nula
 * prekida unos brojeva. Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58
 * 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom,
 * broj 6 2 puta, broj 23 jednom, itd.
 */

public class RepetedNumbers {

	// method which check how many numbers are repeated
	private static void countRepeatedNumber(ArrayList<Integer> list) {

		int number;
		int repeated = 1;
		

		ArrayList<Integer> repeatedList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {

			number = list.get(i);
			repeated = 0;

			// check how menu times number is repeated
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == number) {

					repeated++;// number is repeated

				}

			}

			//print results
			if (!repeatedList.contains(number)) {
				System.out.println("\nBroj " + number + " se ponavlja " + repeated + " puta");
				repeatedList.add(number);
			}

		}

	}

	public static void main(String[] args) {
		// test
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int number;

		try {

			while (true) {
				// input number
				System.out.print("Unesite broj[0 za prekid]: ");
				number = input.nextInt();

				// terminate program if inputed number is 0
				if (number == 0) {
					break;
				}
				// add number to the list
				list.add(number);

			}

			// print result
			countRepeatedNumber(list);

		} catch (Exception e) {
			System.out.println("Greska!!!");
		}finally {
			input.close();
		}

	}

}
