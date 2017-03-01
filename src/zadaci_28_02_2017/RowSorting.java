package zadaci_28_02_2017;

import java.util.Scanner;

/*(Row sorting) Implement the following method to sort the rows in a twodimensional
array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix*/

public class RowSorting {


	public static double[][] sortRows(double[][] m){
		
		//sort array with Comparator interface
		 double t=0;
         for(int x=0;x<m.length;x++)
         {
             for(int y=0;y<m[0].length;y++)
             {
                 for(int i=0;i<m.length;i++)
                 {
                     for(int j=0;j<m[0].length;j++)
                     {
                         if(m[i][j]>m[x][y])
                         {
                             t=m[x][y];//temp
                             m[x][y]=m[i][j];//switch
                             m[i][j]=t;
                         }
                     }
                 }
             }
         }
		
		return m;
	}
	
	//method which print 2D array
	public static void print2Darray(double[][] array){
		
		System.out.println("\nResult: ");
		for (int row = 0; row < array.length; row++) {	//rows
			
			for (int column = 0; column < array[row].length; column++) { //columns
				
				System.out.print(array[row][column] + " ");	//print one element
				
			}
			
			System.out.println();//print new line between elements of different rows
		}
		
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
			
			//print result
			print2Darray(sortRows(a));
			
			
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
			e.printStackTrace();
			input.nextLine();
		}finally{
			input.close();
		}
	}

	
}
