package zadaci_11_02_2017;

import java.util.Scanner;

/*
 * ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: d1
 * d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao checksum i
 * njega izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom
 * formulom: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 +
 * d8 * 8 + d9 * 9) % 11. Ukoliko je checksum 10, zadnji broj oznaèavamo sa
 * X u skladu sa ISBN-10 konvencijom. Napisati program koji pita korisnika
 * da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj. (Primjer:
 * ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje
 * 0136012671 kao ISBN-10 broj. Ukoliko unesemo 013031997 kao prvih 9
 * brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
 */

public class ISBN {

	//print elements in array in one line
	private static void printArray(int[] array) {

		System.out.print("ISBN: ");
		for (int i = 0; i < array.length; i++) {

			//print in one line without space
			System.out.print(array[i]);

		}

	}

	// method which accept 10 numbers and print ISBN number
	private static void printISBNNumber(int[] numbers) {

		int d10 = 0;//checksum

		for (int i = 0, j = 1; i < numbers.length; i++, j++) {

			d10 += (numbers[i] * j); // add all numbers and multiply

		}

	
		if ((d10 % 11) == 10) {//if checksum is 10
			printArray(numbers); // add X on last place
			System.out.println("X");
		} else {
			printArray(numbers); // print whole number
			System.out.println(d10 % 11);	//add last digit
		}

	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[9];
		
		System.out.println("ISBN\n\nUnesite 9 brojeva\n");
		for (int i = 0; i < 9; i++) {
		
			try{
				System.out.println("Unesite broj"+"[" + (i+1) +"]" + ":");
				numbers[i] = input.nextInt();//input 9 numbers
				
				if (numbers[i] < 0) {
					throw new Exception();
				}
				
			}catch (Exception e) {
				System.out.println("Pogrsan unos, pokusajte ponovo");
				input.nextLine();	//clear input
				i--; //decrement iterator
			}
		}
		
		printISBNNumber(numbers);
		input.close();
	}

}
