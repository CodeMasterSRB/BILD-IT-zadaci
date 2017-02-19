package zadaci_18_02_2017;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese imena tri grada te ih
 * ispiše u abecednom redu. Na primjer, ukoliko korisnik unese Chicago, Los
 * Angeles i Atlanta kao gradove, program vraæa Atlanta, Chicago, Los
 * Angeles.
 */

public class SortCities {

	// method which sort and print cities
	private static void printSortedCities(String[] cities) {

		
		// sort cities in alphabetic order
		Arrays.sort(cities);

		System.out.println("\nSortirani gradovi: ");
		for (int i = 0; i < cities.length; i++) {
			
			cities[i] = cities[i].substring(0, 1).toUpperCase() + cities[i].substring(1);
			System.out.print(cities[i] + ", ");
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] cities = new String[3];
		

		try {

			System.out.println("Unesite tri grada\n");
			for (int i = 0; i < cities.length; i++) {
				boolean legit = false;
				// input one city
				System.out.print("Unos: ");
				cities[i] = input.nextLine().toLowerCase();

				for (int j = 0; j < cities[i].length(); j++) {
					// City need to have at least one letter
					if (Character.isAlphabetic(cities[i].charAt(j))) {
						legit = true;
					}
				}
				
				if (!legit) {
					System.out.println("Ime grada mora da sadrzi najmanje jedno slovo");
					break;
				}
				
			}

			
				// print results if name of cities is legal
				printSortedCities(cities);
			
		} catch (Exception e) {
			System.out.println("Greska!!!");
		} finally {
			input.close();
		}

	}

}
