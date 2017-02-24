package zadaci_23_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje
 * piramidu svih brojeva do tog broja. (Na primjer, ukoliko korisnik unese 7
 * vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3
 * 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
 */

public class Pyramid {
	
	//method which print pyramid
	private static void printPiramide(int levels) throws Exception{
		
		
		//level can not be 0 or bigger than 250(System probems).
		if (levels > 250 || levels <=0) {
			throw new Exception();
		}
		
		//generate pyramid
		int row = levels;
		int num = 1;
		while (num <= row) {
			
			for (int i = row - num; i > 0; i--)
				System.out.print("  ");
			
			for (int numL = num; numL > 1; numL--)
				System.out.print(numL + " ");
			
			for (int numR = 1; numR <= num; numR++)
				System.out.print(numR + " ");
			
			System.out.println();
			num++;
		}
		
        
	}


	public static void main(String[] args) {
		//Test
		Scanner input = new Scanner(System.in);
		int level;
		
		try {
			System.out.print("Unesite broj levela za piramidu: ");
			//input level of pyramid
			level= input.nextInt();
			
			
			//print pyramide
			printPiramide(level);
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}finally {
			input.close();
		}

	}

}
