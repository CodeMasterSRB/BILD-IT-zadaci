package zadaci_08_03_2017;

import java.util.ArrayList;

public class Largest {
	
	public static void printLargestColumn(int[][] matrix) {
		
		ArrayList<Integer> columns = new ArrayList<>();

		
		int columnIndex = -1;
		int columnMax = 1;
		int maxOnes = 0;


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
				maxOnes = ones;


			}
			ones = 0;
		}
		
		int newCountOnes = 0;

		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix.length; column++) {
				if (columnIndex == row) {
					break;
				}

				if (matrix[column][row] == 1) {
					newCountOnes++;
				}
			}
			if (newCountOnes == maxOnes) {
				columns.add(row);
			}

			newCountOnes = 0;
		}

		columns.add(columnIndex);
		System.out.println("The largest column" + columns);
	}

	/**
	 * print largest column
	 * @param matrix
	 */
	public static void printLargestRow(int[][] matrix) {

		ArrayList<Integer> rows = new ArrayList<>();
		int rowIndex = -1;
		int rowMax = 1;
		int maxOnes = 0;
		int ones = 0;

		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {

				if (matrix[row][column] == 1) {
					ones++;
				}
			}

			// sort
			if (ones > rowMax) {
				rowMax = ones;
				maxOnes = ones;
				rowIndex = row;

			}
			ones = 0;
		}
		int newCountOnes = 0;

		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix.length; column++) {
				if (rowIndex == row) {
					break;
				}

				if (matrix[row][column] == 1) {
					newCountOnes++;
				}
			}
			if (newCountOnes == maxOnes) {
				rows.add(row);
			}

			newCountOnes = 0;
		}

		rows.add(rowIndex);
		System.out.println("The largest row" + rows);

	}


}
