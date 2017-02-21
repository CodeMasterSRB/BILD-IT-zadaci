package zadaci_20_02_2017;

/*
 * Napisati metodu sa sljedeæim headerom: public static int isPrime(int n)
 * koja provjerava da li je broj prost/prime. Napsati test program koji
 * poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 */

public class Prime {

	// is prime or not
	public static boolean isPrime(int number) {

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

	public static void main(String[] args) {
		
		//check for prime numbers in range of 0 to 100 000
		try {
			for (int i = 1, j = 0; i <= 100000; i++) {
				
				//if is prime print number
				if (isPrime(i)) {
					System.out.print(i + " ");
					j++;
					if (j % 10 == 0 && j != 0) {
						System.out.println();
					}
				}
			}
			
		} catch (Exception e) {
			System.out.println("Greska!!!");
		}

	}

}
