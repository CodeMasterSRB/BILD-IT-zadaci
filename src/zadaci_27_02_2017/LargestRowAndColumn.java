package zadaci_27_02_2017;

import java.util.Random;

/*
 * Write a program that randomly fills in 0s and 1s into a 4-by-4 matrix,
 * prints the matrix, and finds the first row and column with the most 1s.
 */

public class LargestRowAndColumn {

	// method which randomly fill 4x4 matrix with 1 and 0
	public static int[][] generateMatrix() {

		Random random = new Random();

		int[][] matrix = new int[4][4];

		// fill matrix with 0 and 1
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = random.nextInt(2);
			}

		}

		return matrix;

	}

	// method which find row with most 1
	private static void findMaxRow(int[][] matrix) {

		int rowIndex = -1;
		int rowMax = 1;

		int ones = 0;

		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {

				if (matrix[row][column] == 1) {
					ones++;
				}

			}

			//sort
			if (ones > rowMax) {
				rowMax = ones;
				rowIndex = row;

			}
			ones = 0;
		}

		System.out.println("\nPrvi red sa najvise 1 je: " + rowIndex);

	}

	// method which find column with most 1
	private static void findMaxColumn(int[][] matrix) {

		int columnIndex = -1;
		int columnMax = 1;

		int ones = 0;

		for (int column = 0; column < matrix.length; column++) {

			for (int row = 0; row < matrix.length; row++) {

				if (matrix[row][column] == 1) {
					ones++;
					
				}

			}
			//sort
			if (ones > columnMax) {
				columnMax = ones;
				columnIndex = column;

			}
			ones = 0;
		}

		System.out.println("\nPrva kolona sa najvise 1 je: " + columnIndex);

	}

	public static void printMatrix(int[][] matrix) {
		// print matrix
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {

				System.out.print(matrix[row][column] + " ");

			}

			System.out.println();

		}

	}

	public static void main(String[] args) {
		// TEST

		try {
			int[][] matrix = generateMatrix();

			// print 4X4 matrix
			printMatrix(matrix);

			// find row in matrix with most ones(1)
			findMaxRow(matrix);

			// find column in matrix with most ones(1)
			findMaxColumn(matrix);
			
		} catch (Exception e) {
			System.out.println("Greska!!!");
			e.printStackTrace(System.out);
		}
	}

}
