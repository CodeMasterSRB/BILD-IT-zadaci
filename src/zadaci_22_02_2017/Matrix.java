package zadaci_22_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim
 * headerom: public static void printMatrix(int n). Svaki element u matrici
 * je ili 0 ili 1, nasumièno generisana. Napisati test program koji pita
 * korisnika da unese broj n te mu ispiše n x n matricu u konzoli.
 */

public class Matrix {

	// metod which print matrix nxn
	public static void printMatrix(int n)throws ArithmeticException {
		
		if (n <= 0) {
			throw new ArithmeticException();
		}

		// print matrix in nxn
		for (int row = 0; row < n; row++) {// rows

			for (int column = 0; column < n; column++) {// columns
				System.out.print((int) (Math.random() * 2) + " "); // generate
																	// numbers
																	// in matrix
			}
			System.out.println(); // separate rows and columns
		}

	}

	public static void main(String[] args) {
		// Test
		
		Scanner input = new Scanner(System.in);
		int n;
		
		try{
			System.out.print("Unesite broj n za matricu: ");
			n = input.nextInt();
			
		//print result
		printMatrix(n);
		}catch(ArithmeticException e){
			System.out.println("n ne moze biti negativan broj!!!");
		}catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}finally{
			input.close();
		}
	}

}
