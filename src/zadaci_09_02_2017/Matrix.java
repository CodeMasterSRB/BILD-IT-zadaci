package zadaci_09_02_2017;

/*Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:

public static void printMatrix(int n)

Svaki element u matrici je ili 0 ili 1, generisan nasumièno. 
Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.*/

public class Matrix {
	
	//metod which print matrix nxn
	public static void printMatrix(int n){
		
		//print matrix in nxn
		for (int row = 0; row < n; row++) {//rows
			
			for (int column = 0; column < n; column++) {//columns
				System.out.print((int)(Math.random()*2) + " ");	//generate numbers in matrix
			}
			System.out.println();	//separate rows and columns
		}
		
	}

	public static void main(String[] args) {
		// Test
		printMatrix(15);
	}

}
