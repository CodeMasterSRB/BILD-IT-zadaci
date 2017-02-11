package zadaci_10_02_2017;

import java.util.Scanner;

/* Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu.
 *  Metoda treba da koristi sljedeæi header:public static int[ ] locateLargest(double[ ][ ] a)
 *  Napisati test program koji pita korisnika da unese 2D niz 
 *  te mu ispisuje lokaciju najveæeg elementa u nizu.*/

public class ArrayLocationOnMaxValue {

	//find location of largest element in 2D array
	public static int[] locateLargest(double[][] a) {

		int[] largest = new int[2];
		double maxValue = 0;
		
		//iterate through 2D array
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					largest[0] = i;// row of largest element
					largest[1] = j;// column of largest element
				}

		return largest;
	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		int numberOfRows;
		int numberOfColumns;
		

		try {
			System.out.print("Unesite broj redova: ");
			numberOfRows = input.nextInt();//input number of rows in 2D array
			
			System.out.print("Unesite broj kolona: ");
			numberOfColumns = input.nextInt();//input number of columns in 2D array
			
			
			double[][] a = new double[numberOfRows][numberOfColumns];
			
			
			System.out.println();
			for (int row = 0; row < a.length; row++) {	//rows
				
				for (int column = 0; column < a[row].length; column++) { //columns
					
					System.out.print("Unesite broj: ");
					a[row][column] = input.nextDouble();	//input numbers in 2D array
					
				}
			}
			
			int[] largest =  locateLargest(a);//calculate
			
			//print result
			System.out.print("\n\nLokacija najveceg elementa je: " + largest[0] + " " + largest[1]);
			
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
			input.nextLine();
		}finally{
			input.close();
		}
		
	}

}
