package zadaci_20_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja
 * te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
 */

public class MaxAndMinDivider {

	//method which find and print smallest and highest divider for two numbers
	private static void printMinAndMaxDivider(int num1, int num2) throws Exception{
		
		if (num1 <= 0 || num2 <= 0) {
			throw new Exception();
		}

		int maxDivider=-1;


		//find max divider
		for (int i = 1; i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				maxDivider = i;
			}
		}

		//print result
		System.out.println("\nNajmanji zajednicki djelilac za " + num1 +" i " + num2 + " je " + 1);
		System.out.println("Najveci zajednicki djelilac za " + num1 +" i " + num2 + " je " + maxDivider);

	}

	public static void main(String[] args) {
		// test
		
		Scanner input = new Scanner(System.in);
		int num1,num2;
		
		try {
			//enter first number
			System.out.print("Unesite prvi broj: ");
			num1 = input.nextInt();
			
			//enter second number
			System.out.print("Unesite drugi broj: ");
			num2 = input.nextInt();
			
			//print results
			printMinAndMaxDivider(num1, num2);
			
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}finally{
			input.close();
		}

	}

}
