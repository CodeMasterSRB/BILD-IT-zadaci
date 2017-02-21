package zadaci_21_02_2017;

import java.util.Scanner;

/*
 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita
 * pakovanja. Želimo napisati program koji uporeðuje cijene ta dva
 * pakovanja. Program pita korisnika da unese težinu i cijenu oba pakovanja
 * te ispisuje koje pakovanje ima bolju cijenu.
 */

public class ComparedPrices {


	private static void compareTwoPrices(double weight1, double price1, double weight2, double price2) throws Exception {
		
		if (weight1 <= 0 || price1 <= 0 || weight2 <=0 || price2 <=0) {
			throw new Exception();
		}

		//calculates and print results
		if ((weight1/price1) < (weight2/price2)) {
			System.out.println("\nPakovanje 2 ima bolju cijenu");
		}else if((weight1/price1) == (weight2/price2)){
			System.out.println("\nPakovanja imaju istu cijenu");
		}else{
			System.out.println("\nPakovanje 1 ima bolju cijenu");
		}
		
	}

	public static void main(String[] args) {
		// test
		
				Scanner input = new Scanner(System.in);
				double weight1,weight2,price1, price2;
				
				try {
					//enter weight for first package
					System.out.print("Unesite tezinu za prvi paket [kg]: ");
					weight1 = input.nextDouble();
					
					//enter price for first package
					System.out.print("Unesite cijenu za prvi paket: ");
					price1 = input.nextDouble();
					
					//enter weight for second package
					System.out.print("\nUnesite tezinu za drugi paket [kg]: ");
					weight2 = input.nextDouble();
					
					//enter price for second package
					System.out.print("Unesite cijenu za drugi paket: ");
					price2 = input.nextDouble();	
					
					//print results
					compareTwoPrices(weight1, price1, weight2, price2);
					
				} catch (Exception e) {
					System.out.println("Pogresan unos!!!");
				}finally{
					input.close();
				}


	}

}
