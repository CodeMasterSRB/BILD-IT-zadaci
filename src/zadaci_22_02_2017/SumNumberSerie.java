package zadaci_22_02_2017;

/*
 * Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11
 * + 11/13 ..... + 95/97 + 97/99
 */

public class SumNumberSerie {


	private static void sumSerieOfNumbers() {
		
		double sum = 0;
		
		//sum numbers from 1/3 to 97/99
		for (double i = 1, j = 3; j <= 99; i+=2, j+=2) {
			sum += (i / j);
		}
		
		System.out.println("Sum: " + sum);

	}

	public static void main(String[] args) {
		//test
		try {
			
			//print results
			sumSerieOfNumbers();
		} catch (Exception e) {
			System.out.println("Greska!!!");
		}
		
	}

}
