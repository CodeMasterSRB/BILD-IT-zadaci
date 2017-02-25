package zadaci_24_02_2017;

import java.util.Scanner;

/*
 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji
 * pita korisnika da unese short broj te mu ispiše svih 16 bita za dati
 * cijeli broj. Na primjer, ukoliko korisnik unese broj 5 - program mu
 * ispisuje 0000000000000101
 */

public class Byte {


	// method which convert short number to binary number
	private static String convertShortToBinary(short number) {

		// convert and return
		return Integer.toBinaryString(number);

	}
	
	//translate binary number to all 16 bits
	private static void printBinaryNumber(short number){
		
		String zero = "";
		String bytes = convertShortToBinary(number);
		
		
		//add necessary zeroes
		for (int i = bytes.length(); i < 16; i++) {
			
			zero+= "0";
			
		}
		
		//print results
		System.out.println("Binarna reprezentacija broja " + number +" je:\n" + zero +  bytes);

		
	}

	public static void main(String[] args) {
		// Test
		
				Scanner input = new Scanner(System.in);
				short number;
				
				try {
					//input ASCII number
					System.out.print("Unesite broj: ");
					number = input.nextShort();
					
					//print results
					printBinaryNumber(number);
				} catch (Exception e) {
					System.out.println("Pogresan unos!!!");
				}finally{
					input.close();
				}
				

	}

}
