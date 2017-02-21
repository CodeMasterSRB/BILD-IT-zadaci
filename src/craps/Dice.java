package craps;

import java.util.Random;

public class Dice {
	
	int[] diceNumber = {1,2,3,4,5,6};
	
	//method which roll two dices
	public int rollDice(){
		Random random = new Random();
	
		//randomly roll two dices
		int roll1 = diceNumber[random.nextInt(6)] ;
		int roll2 = diceNumber[random.nextInt(6)];
		
		//print results from rolled dices
		System.out.println("You rolled " + roll1 + "+" + roll2 + "=" + ((roll1) + (roll2)));
		return roll1 + roll2;
		
	}
	
	//method which check for result
	public int playGame(){
		
		int rolledDices = rollDice();
		
		
		//if sum of two dices is 2,3,12 player lose
		if (rolledDices == 2 || rolledDices == 3 || rolledDices == 12) {
			System.out.println("Craps, You lose!!!");
			return -50;
		
			//if sum is 7 or 11 player win
		}else if(rolledDices == 7 || rolledDices == 11 ){
			System.out.println("Natural, You Win!!!");
			return 50;
			
			//if sum is not 2,3,12,7 and 11 roll dices again
		}else{
			int tempRoll = rolledDices;
			rolledDices = rollDice();
			
			while(true){
				//if check point is equal with newest roll player win
			if (tempRoll == rolledDices) {
				System.out.println("You Win!!!");
				return 50;
				//if newest roll is 7 player lose
			}else if(rolledDices == 7) {
				System.out.println("Dice is " + 7 + " You Lose!!!");
				return -50;
			}
			rolledDices = rollDice();
			}
			
		}
		
		
	}

}
