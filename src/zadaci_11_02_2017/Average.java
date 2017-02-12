package zadaci_11_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula
 * prekida unos) te ispisuje koliko je brojeva bilo iznad ili jednako
 * prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod prosjeka.
 * Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti
 * 100. Modify message
 */

public class Average {

	// method for input numbers
	private static ArrayList<Integer> inputNumbers() {

		Scanner input = new Scanner(System.in);

		// ArrayList for all inputed numbers
		ArrayList<Integer> listOfNumbers = new ArrayList<>();
		int number;

		for (int i = 0; i < 100; i++) {// max 100 numbers

			try {

				System.out.print("Unesite cijeli broj [0 za prekid unosa]: ");
				number = input.nextInt();// input numbers

				if (number == 0) {// 0 for terminate
					break;
				}

				listOfNumbers.add(number); // add new number in list

			} catch (InputMismatchException e) {
				System.out.println("Greska, pokusajte ponovo!!!");
				input.nextLine();
			}

		}

		input.close();
		return listOfNumbers;

	}

	// print average
	private static void printAvergeNumbers(ArrayList<Integer> listOfNumbers) {

		int under = 0;
		int equal = 0;
		int over = 0;

		double average = 0;

		// iterate through list
		for (int i = 0; i < listOfNumbers.size(); i++) {

			average += listOfNumbers.get(i); // add each element of list

		}

		// formula for count average
		average = (double) (average / listOfNumbers.size());

		for (int i = 0; i < listOfNumbers.size(); i++) {

			if (listOfNumbers.get(i) > average) {
				over++; // increment number is bigger than average
			} else if (listOfNumbers.get(i) == average) {
				equal++; // increment if number is equal as average
			} else {
				under++; // increment if number is smaller than average
			}

		}
		// print results
		System.out.println("\n\nProsjek brojeva je " + average);
		System.out.println("\nBrojeva iznad prosjeka " + over + "\nBrojeva jednakih prosjeku: " + equal
				+ "\nBrojeva ispod prosjeka: " + under);

	}

	public static void main(String[] args) {
		// Test

		printAvergeNumbers(inputNumbers());

	}

}
