package zadaci_27_02_2017;

import java.util.Random;

/*
 * (Even number of 1s) Write a program that generates a 6-by-6
 * two-dimensional matrix filled with 0s and 1s, displays the matrix, and
 * checks if every row and every column have an even number of 1s.
 */

public class EvenNumberOf1 {

	// method which randomly fill 4x4 matrix with 1 and 0
	private static int[][] generateMatrix() {

		Random random = new Random();

		int[][] matrix = new int[6][6];

		// fill matrix with 0 and 1
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = random.nextInt(2);
			}

		}

		return matrix;

	}

	// method check is there in matrix row even number of 1
	private static void rowHasEven(int[][] matrix) {

		int[] ones = new int[6];

		// count number of 1's in every row
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == 1) {

					ones[row]++;
				}
			}


		}

		// print result
		System.out.println();
		for (int i = 0; i < ones.length; i++) {
			if (ones[i] % 2 == 0) {
				System.out.println("Red " + i + " ima paran broj 1");
			} else {
				System.out.println("Red " + i + " ima neparan broj 1");

			}
		}

	}
	// method check is there in matrix column even number of 1
	private static void columnHasEven(int[][] matrix) {

		int[] ones = new int[6];

		// count number of 1's in every row
		for (int column = 0; column < matrix.length; column++) {

			for (int row = 0; row < matrix.length; row++) {

				if (matrix[row][column] == 1) {
					ones[column]++;

				}

			}
		}

		// print result
		System.out.println();
		for (int i = 0; i < ones.length; i++) {
			if (ones[i] % 2 == 0) {
				System.out.println("Kolona " + i + " ima paran broj 1");
			} else {
				System.out.println("Kolona " + i + " ima neparan broj 1");

			}
		}

	}

	public static void main(String[] args) {
		// Test

		try {
			// generate one 4X4 matrix
			int[][] matrix = generateMatrix();

			// print matrix
			LargestRowAndColumn.printMatrix(matrix);

			System.out.println("\nRezultat: ");
			
			// print results for rows
			rowHasEven(matrix);

			// print result for columns
			columnHasEven(matrix);

		} catch (Exception e) {
			System.out.println("Greska!!!");
		}

	}

}
