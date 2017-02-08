package zadaci_08_02_2017;

public class Divisor {

	// return greatest divisor for two numbers
	public static Integer findMaxDivisor(int number1, int number2) {

		int maxDivisor = 0;

		// Divide all numbers with i and find common divisor
		for (int i = 1; i <= number1 || i <= number2; i++) {

			// find common divisor
			if ((number1 % i == 0) && (number2 % i == 0)) {
				maxDivisor = i; // temp common divisor
			}

		}

		return maxDivisor; // final greatest common divisor

	}

	public static void main(String[] args) {
		// Test

		int number1 = 125;
		int number2 = 2525;

		System.out.println("Common divisor for numbers " + number1 + " and " + number2 + " is "
				+ findMaxDivisor(number1, number2));

	}

}
