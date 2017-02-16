package zadaci_15_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji ispisuje tri nasumièna cijela broja te pita
 * korisnika da unese njihov zbir. Ukoliko korisnik pogriješi, program
 * ispisuje pitanje ponovo sve sa porukom da pokuša ponovo. Ukoliko korisnik
 * unese taèan odgovor, program mu èestita i završava sa radom.
 */
public class MathQuestion {
	
	//generate random question
	private static int askQuestion(){
		
		int result = 0;
		int number;
		
		System.out.println("Izracunajte: \n");
		for (int i = 0; i < 3; i++) {
			
			//generate one number per iteration
			number = (int)(Math.random()*100)+1;
			result+=number;//add number to result
			System.out.print(number);
			
			if (i< 2) {
				System.out.print(" + ");
			}
			
		}
		
		//return correct answer
		return result;
		
	}
	
	//return true if user input correct answer, for incorrect return false
	private static boolean evaluateQuestion(int correctAnswer, int userAnswer){
		if (correctAnswer == userAnswer) {
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int correctResult;
		int userAnswer;
		
		//print question
		correctResult= askQuestion();
		while(true){
		
			
			try {
				System.out.print("\n\nOdgovor: ");
				userAnswer = input.nextInt();
				
				if (evaluateQuestion(correctResult, userAnswer)) {
					System.out.println("Odgovor je tacan");
					break;//user provide correct answer. Terminate program
				}else{
					System.out.println("\nPogresno!!!\nPokusajte ponovo");
				}
				
			} catch (Exception e) {
				System.out.println("\nPogresno!!!\nPokusajte ponovo");
				input.nextLine();
			}
			
		}
		
		input.close();

	}

}
