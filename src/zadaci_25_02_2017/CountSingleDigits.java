package zadaci_25_02_2017;

import java.util.Random;

/*
 * (Count single digits) Write a program that generates 100 random integers
 * between 0 and 9 and displays the count for each number. (Hint: Use an
 * array of ten integers, say counts, to store the counts for the number of
 * 0s, 1s, . . . , 9s.)
 */

public class CountSingleDigits {
	
	//method which generate 100 integers in range of 0 to 100
	private static int[] generate100Integers(){
		
		int[] numbers = new int[100];
		
		Random random = new Random();
		
		//generate 100 random numbers
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(10);
		}
		
		return numbers;
		
	}
	
	private static void printNumberRepetition(){
		
		int[] numbers = generate100Integers();
		
		int[] repetitions = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			//increment repeated numbers 
			repetitions[numbers[i]]++;
			
		}
		
		//print 
		for (int i = 0; i < repetitions.length; i++) {
			System.out.println("Broj " + i + " se ponavlja " + repetitions[i] + " puta" );
		}
		
	}

	public static void main(String[] args) {
		//test
		
		try {
			//print results
			printNumberRepetition();
		} catch (Exception e) {
			System.out.println("Greska!!!");
		}
		
	}

}
