package zadaci_08_02_2017;

public class RandomNumbers {

	// generate random numbers between 0 and 9 with Math.random() method
	public static int generateRandomNumbers() {

		return (int) (Math.random() * 10);

	}

	// count how many numbers are repeated and print them
	public static void countNumbers() {

		int[] numbers = new int[10];

		// generate numbers 100 times
		for (int i = 0; i < 100; i++) {
			int number = generateRandomNumbers();

			// increase repeated number
			numbers[number]++;

		}

		// print numbers count
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Number " + i + " is repeted " + numbers[i] + " times");
		}

	}

	public static void main(String[] args) {
		// Test
		countNumbers();

	}

}
