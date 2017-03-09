package zadaci_08_03_2017;


import java.util.Random;
/*
 * (Largest rows and columns) Write a program that randomly fills in 0s and
 * 1s into an n-by-n matrix, prints the matrix, and finds the rows and
 * columns with the most 1s. (Hint: Use two ArrayLists to store the row and
 * column indices with the most 1s.) Here is a sample run of the program:
 */

public class LargestRowAndColumn {

	/**
	 * Method which fill up n X n matrix with random 0 and 1
	 * 
	 * @param row
	 * @param column
	 * @return
	 */
	private static int[][] fillMatrix(int row, int column) {

		int[][] matrix = new int[row][column];

		Random random = new Random();

		for (int rowMatrix = 0; rowMatrix < matrix.length; rowMatrix++) {

			for (int columnMatrix = 0; columnMatrix < matrix.length; columnMatrix++) {

				matrix[rowMatrix][columnMatrix] = random.nextInt(2);

			}

		}

		return matrix;

	}

	/**
	 * print n X n matrix
	 * 
	 * @param matrix
	 */
	private static void printMatrix(int[][] matrix) {

		for (int rowMatrix = 0; rowMatrix < matrix.length; rowMatrix++) {

			for (int columnMatrix = 0; columnMatrix < matrix.length; columnMatrix++) {

				System.out.print(matrix[rowMatrix][columnMatrix] + " ");

			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		// Test
		int[][] matrix = fillMatrix(5, 5);

		printMatrix(matrix);
		Largest.printLargestRow(matrix);
		Largest.printLargestColumn(matrix);

	}

}
