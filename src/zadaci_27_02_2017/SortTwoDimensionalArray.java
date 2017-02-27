package zadaci_27_02_2017;

import java.util.Random;

/*
 * (Sort two-dimensional array) Write a method to sort a two-dimensional
 * array using the following header: public static void sort(int m[][]) The
 * method performs a primary sort on rows and a secondary sort on columns.
 * For example, the following array {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4,
 * 1}} will be sorted to {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 */

public class SortTwoDimensionalArray {
	
	//generate one 5x5 array filled up with numbers from 0 to 9
	public static int[][] generateArray(){
		
		int[][]matrix = new int[5][5];
		Random random = new Random();
		
		
		for (int row = 0; row < matrix.length; row++) {
			
			for (int column = 0; column < matrix[row].length; column++) {
				
				matrix[row][column] = random.nextInt(10);
				
			}
			
		}
		return matrix;
	}


	//method which sort 2D array
	public static int[][] sortRows(int[][] array) {

		
		int t = 0;
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[0].length; y++) {
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[0].length; j++) {
						if (array[i][j] > array[x][y]) {
							t = array[x][y];// temp
							array[x][y] = array[i][j];// switch
							array[i][j] = t;
						}
					}
				}
			}
		}

		return array;
	}

	// method which print 2D array
	public static void print2Darray(int[][] array) {

		
		for (int row = 0; row < array.length; row++) { // rows

			for (int column = 0; column < array[row].length; column++) { // columns

				System.out.print(array[row][column] + " "); // print one element

			}

			System.out.println();// print new line between elements of different
									// rows
		}

	}

	public static void main(String[] args) {

		try{
		int[][] matrix = generateArray();
		
		//print array
		System.out.println("Nasumicno generisani niz: ");
		print2Darray(matrix);
		
		//sort array
		matrix = sortRows(matrix);
		
		//print sorted array
		System.out.println("\nSortirani niz: ");
		print2Darray(matrix);
		
		}catch (Exception e) {
			System.out.println("Greska!!!");
		}
	}

}
