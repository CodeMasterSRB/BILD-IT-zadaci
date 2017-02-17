package zadaci_16_02_2017;

/*
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po
 * liniji, koji su djeljivi i sa 5 i sa 6. Razmak izmeðu brojeva treba biti
 * taèno jedan space.
 */

public class Divisibility {


	// method which print all numbers which can divide by 5 and 6
	private static void printNumbers() {

		System.out.println("Brojevi izmedju 100 i 1000 koji su djeljivi sa 5 i 6 su: \n");
		for (int i = 100, j = 0; i <=1000; i++) {

			//print number if can be divided by 5 and 6
			if ((i % 5 == 0) && (i % 6 == 0)) {
				System.out.print(i + " ");
				j++;
				
				//print new line for every new line
				if (j % 10 == 0 && j!=0) {
					System.out.println();
				}
				
			}
			
			
		}

	}

	public static void main(String[] args) {
		//test
		
		try {
			//print results
			printNumbers();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
