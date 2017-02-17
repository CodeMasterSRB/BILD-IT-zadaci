package zadaci_17_02_2017;

import java.util.ArrayList;
/*
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na
 * primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer
 * twin primes. Napisati program koji ispisuje sve twin prime brojeve manje
 * od 10000, 10 parova po liniji.
 */


public class TwinPrime {

	//method which print twin numbers till 10 000
	private static void printTwinPrimeNumbers() {
		ArrayList<Integer> first = new ArrayList<Integer>();

		// check if number is prime
		for (int j = 2; j < 10000; j++) {

			int i, m = 0, flag = 0;
			int n = j;// it is the number to be checked
			m = n / 2;
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				first.add(j);
			}

		}

		// check for twin prime numbers
		for (int i = 0,j = 0; i < first.size() - 1; i++) {
			if (first.get(i + 1) - first.get(i) == 2) {
				// print twine
				System.out.printf("%-10s ",first.get(i) +"-"+ first.get(i + 1) );
				j++;
				
				if (j % 10 ==0 && j!= 0) {
					System.out.println();//print new line for every 10 element
				}
			}
		}

	}

	public static void main(String[] args) {
		// Test

		// print results
		System.out.println("Twin primes: \n");
		printTwinPrimeNumbers();

	}

}
