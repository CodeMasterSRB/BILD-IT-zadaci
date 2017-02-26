package zadaci_25_02_2017;

import java.util.Random;

/*
 * (Random number chooser) Write a method that returns a random number
 * between 1 and 54, excluding the numbers passed in the argument. The
 * method header is specified as follows: public static int getRandom(int...
 * numbers)
 */

public class RandomNumberChooser {
	
	//method which return unique random integer between 1 and 54
	public static int getRandom(int...numbers){
		
		Random random = new Random();
		
		int number=-1;
		boolean valid = false;
		
		for (int i = 1; i <= 54; i++) {
			
			//number is unique
			if (valid) {
				return number;
			}
			
			//generate one integer between 1 and 54
			number = random.nextInt((54-1)+1)+1;
			valid = true;
			
			//check for duplicate
			for (int j = 0; j < numbers.length; j++) {	
				if (number == numbers[j]) {
					valid = false;
				}
			}
			
			
			
		}
		
		
		return number=-1;
		
		
		
	}


	public static void main(String[] args) {
		// Test
		int[] numbers = new int[54];
		
		
		for (int i = 1; i <=27; i++) {
			numbers[i-1] =i ;
		}
		
		//unique numbers are from 28 to 54
		int number =getRandom(numbers);
		
		//print results
		try {
			if (number!= -1) {
				System.out.println("Nasumicni broj je: " + number);
			}else{
				System.out.println("Nema unikatnog nasumicnog broja");
			}
		} catch (Exception e) {
			System.out.println("Greska!!!");
		}

	}

}
