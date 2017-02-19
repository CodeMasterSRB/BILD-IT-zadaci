package zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje
 * koliko je pozitivnih brojeva korisnik unijeo, koliko negativnih te
 * izraèunava ukupnu sumu i prosjek svih unesenih brojeva. (Korisnik prekida
 * unos tako što unese nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0
 * program treba da ispiše da je broj pozitivnih brojeva 3, negativnih
 * brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
 */

public class SumAverge {

	//method which count how menu user inputed positive and negative numbers,
	//their sum, and product  
	private static void calculate(ArrayList<Integer> list) {
		int number = -1, positive = 0, negative = 0;
		double sum = 0;
		

		for (int j = 0; j < list.size(); j++) {
			number = list.get(j);
			sum += number;// add number
			

			if (number > 0) {
				positive++;// increment positive
			} else if (number < 0) {
				negative++;// increment negative
			} else {
				break;
			}

		}

		// print results
		System.out.println("\nRezultat: \nBroj pozitivnih unesenih brojeva je: " + positive);
		System.out.println("Broj unesenniih negativnih brojeva je: " + negative);

		System.out.println("Zbir svih unesenih brojeva je: " + sum);
		System.out.println("Prosjek unijetih brojeva je: " + (sum / list.size()));

	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		int number;
		ArrayList<Integer> list = new ArrayList<>();
		
		try {
			
			while(true){
				//input one number
				System.out.print("Unesite broj[0 za prekid]: ");
				number = input.nextInt();
				
				
				if (number != 0) {
					//if inputed number is not 0 add number to the list
					list.add(number);
				}else{//number is 0 and that is condition for terminating input
					break;
				}
				
			}
			
			//print results
			calculate(list);
			
		} catch (Exception e) {
			System.out.println("Greska!!!");
		}finally{
			input.close();
		}

	}

}
