package zadaci_25_02_2017;

import java.util.Scanner;

/*
 * (Algebra: add two matrices) Write a method to add two matrices. The
 * header of the method is as follows: public static double[][]
 * addMatrix(double[][] a, double[][] b) Programming Exercises 307 In order
 * to be added, the two matrices must have the same dimensions and the same
 * or compatible types of elements. Let c be the resulting matrix. Each
 * element cij is aij + bij.Write a test program that prompts the user to
 * enter two 3 * 3 matrices and displays their sum. Here is a sample run:
 */

public class SumTwoMatrix {

	// This method sum two matrix which are passed as arguments
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] sumOfTwoMatrix = new double[3][3];

		for (int row = 0; row < sumOfTwoMatrix.length; row++) {

			for (int column = 0; column < sumOfTwoMatrix[row].length; column++) {
				// add number in specific row and column
				sumOfTwoMatrix[row][column] = a[row][column] + b[row][column];

			}

		}

		return sumOfTwoMatrix;
	}
	
	private static void printMatrix(double[][] matrix){
		//print matrix
		System.out.println("\nREZULTAT:");
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {
				
				System.out.printf("%10.2f ",matrix[row][column] );

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

			//input numbers in first matrix
			System.out.println("Unesite brojeve za prvu matricu");
			for (int row = 0; row < a.length; row++) {

				for (int column = 0; column < a[row].length; column++) {
					// add number in specific row and column
					System.out.print("Unesite broj [" + row + "] [" + column + "] :");

					a[row][column] = input.nextDouble();

				}

			}
			
			//input numbers in first matrix
			System.out.println("\nUnesite brojeve za drugu matricu");
			for (int row = 0; row < b.length; row++) {

				for (int column = 0; column < b[row].length; column++) {
					// add number in specific row and column
					System.out.print("Unesite broj [" + row + "] [" + column + "] :");

					b[row][column] = input.nextDouble();

				}

			}
			
			//print results
			printMatrix(addMatrix(a, b));

		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		} finally {
			input.close();
		}

	}

}
