package zadaci_09_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko nasumiènih,
 *  jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“.
 *  Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše korisniku.*/

public class Question {
	
	//method which generate simple math questions and ask for answer
	private static void generateQuestion(int numberOfQuestions){
		
		Scanner input = new Scanner(System.in);
		
		int number1,number2;
		int correctAnswer=0, incorrectAnswer=0;
		
		//ask and answer 
		for (int i = 0; i < numberOfQuestions; i++) {
			
			try{
			
			number1 = (int)(Math.random() * 10);	//generate first random number
			number2 = (int)(Math.random() * 10);	//generate second random number
			
			System.out.println("Koliko je " + number1 +" - " + number2 + "?");	//print question
			
			
			if (input.nextInt() == (number1 - number2)) {//answer
				correctAnswer++;	//increment correct
				System.out.println("Tacno\n");
			}else{
				incorrectAnswer++;	//increment incorrect
				System.out.println("Netacno\n");
			}
			}catch(InputMismatchException e ){
				System.out.println("Netacno\n");
				incorrectAnswer++;
				input.nextLine();
			}
		}
		
		System.out.println("\nTacnih: " + correctAnswer);//print number of correct answers
		System.out.println("Netacnih: " + incorrectAnswer);//print number of incorrect answers
		
		input.close();
	}

	public static void main(String[] args) {
		// Test
		generateQuestion(5);
	}

}
