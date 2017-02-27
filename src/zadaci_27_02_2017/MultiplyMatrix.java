package zadaci_27_02_2017;

import java.util.Scanner;

/*
 * (Algebra: multiply two matrices) Write a method to multiply two matrices.
 * The header of the method is: public static double[][]
 * multiplyMatrix(double[][] a, double[][] b) To multiply matrix a by matrix
 * b, the number of columns in a must be the same as the number of rows in
 * b, and the two matrices must have elements of the same or compatible
 * types. Let c be the result of the multiplication. Assume the column size
 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain *
 * bnj. For example, for two 3 * 3 matrices a and b, c is where cij = ai1 *
 * b1j + ai2 * b2j + ai3 * b3j. Write a test program that prompts the user
 * to enter two 3 * 3 matrices and displays their product.
 */


public class MultiplyMatrix {


	// This method multiply two matrix which are passed as arguments
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] sumOfTwoMatrix = new double[3][3];

		for (int i = 0; i < a.length; i++) { // aRow
            for (int j = 0; j < b[i].length; j++) { // bColumn
                for (int k = 0; k < a[i].length; k++) { // aColumn
                    sumOfTwoMatrix[i][j] += a[i][k] * b[k][j];
                }
            }
        }

		return sumOfTwoMatrix;
	}

	private static void printMatrix(double[][] matrix) {
		// print matrix
		System.out.println("\nREZULTAT:");
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {

				System.out.printf("%10.2f ", matrix[row][column]);

			}

			System.out.println();

		}
	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);

		double[][] a = new double[3][3];
		double[][] b = new double[3][3];

		try {

			// input numbers in first matrix
			System.out.println("Unesite brojeve za prvu matricu");
			for (int row = 0; row < a.length; row++) {

				for (int column = 0; column < a[row].length; column++) {
					// add number in specific row and column
					System.out.print("Unesite broj [" + row + "] [" + column + "] :");

					a[row][column] = input.nextDouble();

				}

			}

			// input numbers in first matrix
			System.out.println("\nUnesite brojeve za drugu matricu");
			for (int row = 0; row < b.length; row++) {

				for (int column = 0; column < b[row].length; column++) {
					// add number in specific row and column
					System.out.print("Unesite broj [" + row + "] [" + column + "] :");

					b[row][column] = input.nextDouble();

				}

			}

			// print results
			printMatrix(addMatrix(a, b));

		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		} finally {
			input.close();
		}

	}

}
