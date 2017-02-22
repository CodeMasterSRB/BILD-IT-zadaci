package zadaci_22_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju.
 * Koristite sljedeæi header: public static int sumDigits(long n). Na
 * primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234))
 * metoda treba da vrati 9. (2 + 3 + 4 = 9)
 */

public class SumOfAllDigits {


	//method which sum all digits in one positive number
	private static int sumAllDigits(int number) {
		
		//number must be positive
		number = Math.abs(number);
		
		int temp = 0;
		int counter =0;
		int sum =0;

		for (counter = 0; counter <= 2; counter++) {

			temp = number % 10;
			number /= 10;
			sum += temp;

			if (temp == 0) {
				break;
			}

		}

		

		return sum;
	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		int number;
		
		try {
			System.out.print("Unesite jedan pozitivan cijeli broj: ");
			//input your number
			number = input.nextInt();
			
			//play game and print result
			System.out.println("Zbir: " + sumAllDigits(number));
		} catch (Exception e) {
			System.out.println("Greska!!!");
		}finally{
			input.close();
		}

	}

}
