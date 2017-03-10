package zadaci_09_03_2017;

import java.util.Random;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// TEST
		
		Scanner input = new Scanner(System.in);
		int[] randomNumbers = new int[100];
		int userIndex;
		
		Random rand = new Random();
		
		try{
		for (int i = 0; i < randomNumbers.length; i++) {
			
			randomNumbers[i] = rand.nextInt(101);
			
		}
		
		System.out.print("Enter index of number: ");
		userIndex = input.nextInt();
		
		System.out.println("Number is " + randomNumbers[userIndex]);
		
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
		
		input.close();

	}

}
