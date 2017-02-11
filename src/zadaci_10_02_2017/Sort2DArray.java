package zadaci_10_02_2017;

import java.util.Scanner;

/*
 * Implementirati sljedeæu metodu da sortira redove u 2D nizu.
 * public static double[ ][ ] sortRows(double[ ][ ] array)
 * Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da
 * pita korisnika koliku matricu želi unijeti) te mu ispisuje na konzoli
 * matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.
 */

public class Sort2DArray {
	
	public static double[][] sortRows(double[][] array){
		
		//sort array with Comparator interface
		 double t=0;
         for(int x=0;x<array.length;x++)
         {
             for(int y=0;y<array[0].length;y++)
             {
                 for(int i=0;i<array.length;i++)
                 {
                     for(int j=0;j<array[0].length;j++)
                     {
                         if(array[i][j]>array[x][y])
                         {
                             t=array[x][y];//temp
                             array[x][y]=array[i][j];//switch
                             array[i][j]=t;
                         }
                     }
                 }
             }
         }
		
		return array;
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
