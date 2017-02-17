package zadaci_16_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Napišite program koji uèitava neodreðen broj cijelih brojeva (unos
 * prekida nula), pronalazi najveæi od unijetih brojeva te ispisuje koliko
 * se najveæi broj puta ponovio. Na primjer, ukoliko unesemo 3 5 2 5 5 5 0
 * program ispisuje da je najveæi broj 5 te ispisuje da se isti ponavlja 4
 * puta.
 */
public class MaxValue {

	private static ArrayList<Integer> list = new ArrayList<>();

	// method which sort number
	private static ArrayList<Integer> sortListOfIntegers() {

		//if list is empty terminate program
		if (list.isEmpty()) {
			System.out.println("Niste unijeli nijedan broj");
			System.exit(0);
		}
		
		// sort in ascending order
		Collections.sort(list);

		// return max value
		return list;

	}

	private static void printMaxIntegerRepetitions() {

		sortListOfIntegers();
		int maxInteger = 0;// variable for counting max integer

		for (int i = 0; i < list.size(); i++) {
			// if max integer have equal
			if (list.get(list.size() - 1) == list.get(i)) {
				maxInteger++;// increment repetition of max integer
			}
		}

		System.out.println("\nNajveci broj u listi je " + list.get(list.size() - 1) + " i ponavlja se " + maxInteger +" puta");

	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);
		int number;

		try {
			System.out.println("Unesite brojeve[0 prekida unos]\n ");

			while (true) {
				System.out.print("Unos: ");
				number = input.nextInt();// input one number per iteration

				//Condition for terminating program
				if (number==0) {
					break;
				}
				
				list.add(number);// add number in list
			}

			// print results
			printMaxIntegerRepetitions();
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		} finally {
			input.close();
		}

	}

}
