package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PerfectSquare {

	/**
	 * found all factors in parameter n
	 * @param m
	 * @return
	 */
	private static ArrayList<Integer> foundFactors(int m) {
		ArrayList<Integer> factors = new ArrayList<>();

		// iterate while number is less or equal to 1
		for (int i = 2;; i++) {

			if ((m % i) == 0) {// check if number is divisible

				m /= i; // divide number with i
				factors.add(i); // print divisor in one line
				i = 1;// reset divisor

			}

			// if number is smaller or equal than 1, then we can't divide it
			// more
			if (m <= 1) {
				break;
			}

		}
		return factors;
	}
	
	/**
	 * method which return product of all odd factors
	 * @param oddNumbers
	 * @return
	 */
	private static int calculateSmallestNumber(Set<Integer> oddNumbers){
		
		int product=1;
		
		for (Integer number : oddNumbers) {
			product*=number;
			
		}
		
		return product;
		
	}

	/**
	 * Method which found all odds factors in number
	 * @param m
	 * @return
	 * @throws Exception
	 */
	private static Set<Integer> getOddNumbers(int m) throws Exception {
		
		if (m < 0) {
			throw new Exception();
		}
		
		ArrayList<Integer> factors = foundFactors(m);

		Set<Integer> oddNumbers = new HashSet<>();

		int perfectScuare = 0;
		int times = 0;

		for (int i = 0; i < factors.size(); i++) {

			perfectScuare = factors.get(i);

			for (int j = 0; j < factors.size(); j++) {

				if (perfectScuare == factors.get(j)) {
					times++;
				}

			}

			if (times % 2 != 0) {
				oddNumbers.add(perfectScuare);
			}

			times = 0;
		}

		return oddNumbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int m,n;
		
		try {
			
			System.out.print("Enter integer m: ");
			
			m = input.nextInt();
			n = calculateSmallestNumber(getOddNumbers(m));
			
			System.out.println("The smallest number n for m * n to be"
					+ " a perfect square is: \n" + n);
			
			System.out.println("m * n is " + (m*n));
			
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}
		
		input.close();
	}

}
