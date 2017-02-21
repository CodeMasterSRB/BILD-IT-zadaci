package zadaci_21_02_2017;

/*
 * Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti
 * broj i kada ispišemo naopako. Na primjer, broj 17 i broj 71 su prosti
 * brojevi tako da su brojevi i 17 i 71 emirp brojevi. Napisati program koji
 * ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji.
 */

public class EmirpNumbers {

	//check is number prime
	public static boolean isPrime(int n) {

		int sqrt = (int) Math.sqrt(n) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (n % i == 0 || n == 0 || n == 1) {
				return false;
			}
		}
		return true;

	}

	//check is number palindrome
	public static boolean isPalindrome(int number) {

		String myString = Integer.toString(number);
		boolean myBollean = true;

		for (int i = 0, j = myString.length() - 1; i < myString.length(); i++, j--) {

			if (myString.charAt(i) != myString.charAt(j)) {
				myBollean = false;
			}

		}
		return myBollean;
	}

	//reverse that number
	public static int reverse(int number) {

		String myString = Integer.toString(number);
		String newString = "";

		for (int i = myString.length() - 1; i >= 0; i--) {

			newString += myString.charAt(i);
		}

		return Integer.parseInt(newString);
	}

	
	public static void main(String[] args) {

		int count = 0, i = 10;

		//print 100 emirp numbers
		while (count != 100) {

			if (isPrime(reverse(i)) && isPrime(i) && !isPalindrome(i)) {
				System.out.print(i + " ");
				count++;

				//print new line for each 10 element
				if (count % 10 == 0 && count != 1) {
					System.out.println();
				}

			}

			i++;
		}

	}

}
