package zadaci_03_03_2017;

import java.util.Scanner;


public class TestStackOfIntegers {

	// print smallest factors in number
	private static void printFactors(int number) {
	    StackOfIntegers stack = new StackOfIntegers();

		
		System.out.print("Najmanji faktori broja " + number + " su: ");
		// iterate while number is less or equal to 1
		for (int i = 2;; i++) {

			if(number  == 1){
				System.out.println(1);
				break;
				}
			
			if ((number % i) == 0) {// check if number is divisible

				number /= i; // divide number with i
				stack.push(i);
				i = 1;// reset divisor

				
			}

			// if number is smaller or equal than 1, then we can't divide it
			// more
			if (number <= 1) {
				break;
			}

		}
		
		 while (!stack.empty())
		      System.out.print(stack.pop() + " ");  

	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		int number;
		
		
		System.out.println("Unesite broj: ");
		while (true) {
			try {
				
				number = input.nextInt();//input one integer

				if (number > 0) {
					//print results
					printFactors(number);
					break;
				} else {
					//try again
					System.out.println("Unesite broj veci od 0: ");
				}
			} catch (Exception e) {
				//try again
				System.out.println("Greska, pokusajte ponovo!!!");
				System.out.println("Unos: ");
				input.nextLine();
			}
		}
		input.close();
	}

}
