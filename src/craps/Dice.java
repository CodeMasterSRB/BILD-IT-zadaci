package craps;

import java.util.Random;

public class Dice {
	
	int[] diceNumber = {1,2,3,4,5,6};
	
	public int rollDice(){
		Random random = new Random();
	
		
		int roll1 = diceNumber[random.nextInt(6)] ;
		int roll2 = diceNumber[random.nextInt(6)];
		
		System.out.println("You rolled " + roll1 + "+" + roll2 + "=" + ((roll1) + (roll2)));
		return roll1 + roll2;
		
	}
	
	public int playGame(){
		
		int rolledDices = rollDice();
		
		
		if (rolledDices == 2 || rolledDices == 3 || rolledDices == 12) {
			System.out.println("Craps, You lose!!!");
			return -50;
		}else if(rolledDices == 7 || rolledDices == 11 ){
			System.out.println("Natural, You Win!!!");
			return 50;
		}else{
			int tempRoll = rolledDices;
			rolledDices = rollDice();
			
			while(true){
			if (tempRoll == rolledDices) {
				System.out.println("You Win!!!");
				return 50;
				
			}else if(rolledDices == 7) {
				System.out.println("Dice is " + 7 + " You Lose!!!");
				return -50;
			}
			rolledDices = rollDice();
			}
			
		}
		
		
	}

}
