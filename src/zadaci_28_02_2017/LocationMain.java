package zadaci_28_02_2017;

import java.util.Scanner;

/*
 * (The Location class) Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. The class contains
 * public data fields row, column, and maxValue that store the maximal value
 * and its indices in a two-dimensional array with row and column as int
 * types and maxValue as a double type. Write the following method that
 * returns the location of the largest element in a two-dimensional array:
 * public static Location locateLargest(double[][] a)
 */

public class LocationMain {

	// method which find max value in 2D array and his row and column
	public static Location locateLargest(double[][] a) {

		Location location = new Location();
		double max = a[0][0];

		location.setColumn(0);
		location.setRow(0);
		location.setMaxValue(max);

		for (int row = 0; row < a.length; row++) {

			for (int column = 0; column < a[row].length; column++) {

				if (max < a[row][column]) {

					max = a[row][column];
					location.setColumn(column);
					location.setRow(row);
					location.setMaxValue(max);

				}

			}

		}
		return location;

	}

	// mathod which print 2D array
	private static void print2DArray(double[][] a) {

		for (int row = 0; row < a.length; row++) {

			for (int column = 0; column < a[row].length; column++) {

				System.out.print(a[row][column] + " ");

			}

			System.out.println();

		}
		System.out.println();

	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		double number;
		int row, columns;

		Location location;

		try {
			System.out.print("Unesite broj redova: ");
			row = input.nextInt();
			System.out.print("Unesite broj kolona: ");
			columns = input.nextInt();

			double[][] array = new double[row][columns];

			System.out.println();
			for (int i = 0; i < array.length; i++) {

				for (int j = 0; j < array[i].length; j++) {
					System.out.print("Unesite broj: ");
					number = input.nextDouble();

					array[i][j] = number;
				}

			}

			System.out.println("\nIzgled 2D niza: ");
			print2DArray(array);

			location = locateLargest(array);

			System.out.println("\nNajveca vrijednost je: " + location.getMaxValue() + " (" + location.getRow() + " , "
					+ location.getColumn() + ")");

		} catch (Exception e) {
			System.out.println("Pogresan unos");

		} finally {
			input.close();
		}

	}

}
