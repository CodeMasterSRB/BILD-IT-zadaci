package zadaci_25_02_2017;

import java.util.Scanner;

/*
 * (Sum elements column by column) Write a method that returns the sum of
 * all the elements in a specified column in a matrix using the following
 * header:public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each
 * column
 */

public class SumElementsInColumns {

	// Method which count sum of all elements in specific column
	public static double sumColumn(double[][] m, int columnIndex) {

		double columnSum = 0;

		// sum all elements in specific column
		for (int row = 0; row < m.length; row++) {

			// add element in row to sum
			columnSum += m[row][columnIndex];

		}

		return columnSum;

	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		double[][] m = new double[3][4];

		double number;

		// input numbers in matrix
		try {
			System.out.println("Popunite 3x4 matricu\n");

			for (int row = 0; row < m.length; row++) {

				for (int column = 0; column < m[row].length; column++) {

					System.out.print("Unesite broj [" + row + "] [" + column + "] :");
					number = input.nextDouble();
					m[row][column] = number;

				}
				input.nextLine();

			}

			// print results
			System.out.println();
			for (int i = 0; i < 4; i++) {
				System.out.println("Suma svih elemenata u " + i + " koloni je " + sumColumn(m, i));
			}

		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		} finally {
			input.close();
		}

	}

}
