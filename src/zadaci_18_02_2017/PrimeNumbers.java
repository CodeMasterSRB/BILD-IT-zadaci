package zadaci_18_02_2017;

/*
 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000,
 * ukljuæujuæi i 2 i 1000. Program treba da ispiše 8 brojeva po liniji te
 * razmak izmeðu brojeva treba da bude jedan space.
 */

public class PrimeNumbers {

	// is prime or not
	private static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}

		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) {
				return false; // number is not prime
			}
		}
		return true; // number is prime
	}

	// print prime numbers between start and end, third parameter is for number
	// elements per line
	private static void printPrimeNumbers() {

		int start = 2;
		System.out.println("Prime numbers from 2 to 1000 are: \n");

		for (int iterate = 0; start <= 1000; start++) { // iterate numbers
														// between
														// start and end

			if (isPrime(start)) {// check if number is prime
				System.out.print(start + " "); // print prime number
				iterate++;// increment elements per line

				if (iterate % 8 == 0 && iterate != 0) {// print new
														// line
					System.out.println();

				}
			}

		}

	}

	public static void main(String[] args) {
		// Test
		printPrimeNumbers();

	}

}
