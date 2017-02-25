package zadaci_24_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Napisati program koji ucitava 10 brojeva te ispisuje koilko je
 * jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su unijeti,
 * razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje više puta,
 * broj treba ispisati samo jednom.
 */

public class UniqueNumbers {
	
	//method which print numbers from ArrayList
	private static void printArrayList(ArrayList<Integer> list){
		
		System.out.println("\nBrojevi su (bez duplikata): ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}


	public static void main(String[] args){
		//Test
		
		Scanner input = new Scanner(System.in);
		int number;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("UNESITE 10 BROJEVA\n");
		
		try {
			for (int i = 0; i < 10; i++) {
				
				//input number
				System.out.print("Unesite broj: ");
				number = input.nextInt();
				
				//if list does not contain inputed number, add that number to the list
				if (!list.contains(number)) {
					list.add(number);
				}
				
			}
			
			//print result
			printArrayList(list);
			
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}finally{
			input.close();
		}
		
	}

}
