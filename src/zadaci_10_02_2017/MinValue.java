package zadaci_10_02_2017;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Napisati metodu koja nalazi najmanji element u nizu decimalnih
 * vrijednosti koristeæi se sljedeæim headerom: public static double
 * min(double[ ] array) Napišite potom test program koji pita korisnika da
 * unese deset brojeva te poziva ovu metodu da vrati najmanji element u
 * nizu.
 */

public class MinValue {

	// return smallest value in array
	public static double min(double[] array) {

		Arrays.sort(array);// sort elements in array in ascending order

		return array[0];// return first element in array

	}

	public static void main(String[] args) {

		//Test
		
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		
		System.out.println("Unesite 10 brojeva: ");
		
		for (int i = 0; i < 10; i++) {
			
			try{
				System.out.print("Unos: ");
				array[i] = input.nextDouble();	//input 10 numbers in array
				
			}catch (Exception e) {
				System.out.println("Pogresan unos, pokusajte ponovo");
				i--;	//decrement attempts
				input.nextLine();//clear input
			}
			
		}
		
		System.out.println(min(array));//print smallest double element
		
		input.close();
	}

}
