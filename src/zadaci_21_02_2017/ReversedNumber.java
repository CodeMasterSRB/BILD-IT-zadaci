package zadaci_21_02_2017;

import java.util.Scanner;

/*
 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj
 * koji joj je proslijeðen kao argument: public static void reverse(int
 * number). Na primjer, reverse(3456) treba da vrati 6543. Napisati program
 * koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan
 * naopako
 */


public class ReversedNumber {
	
	//method which reverse one number
	public static void reverse(int number){
		
		String reversed ="";
	
		
		while(number != 0){
			
			reversed += number % 10;//add last digit on first place
			number /= 10;
			number = Math.abs(number);
			
		}
		
		System.out.println("Broj ispisan naopako je " + reversed );
		
	}

	public static void main(String[] args) {
		// test
		Scanner input = new Scanner(System.in);
		int number;
		
		try {
			System.out.println("Unesite jedan broj: ");
			number = input.nextInt();
			
			//print result
			reverse(number);
			
		} catch (Exception e) {
			System.out.println("Greska!!!");
		}finally{
			input.close();
		}

	}

}
