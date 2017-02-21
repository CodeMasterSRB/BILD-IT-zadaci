package craps;

import java.util.Scanner;

public class Main {
	
	//method which print standard menu for application
	private static void printMenu(){
		System.out.println("\n1.Play   2.Take money");
	}

	public static void main(String[] args) {

		System.out.println("Grand Casino");

		Dice dice = new Dice();
		Scanner input = new Scanner(System.in);

		int choice = -1;
		int deposit = 0;
		
		System.out.print("\nInput money [Min 50]: ");
		try{
		deposit = input.nextInt();//input money for balance, minumum is 50
		}catch (Exception e) {
			System.out.println("Wrong input");
		}
		
		if (deposit <50) {
			System.out.println("Wrong input!!!");
			System.exit(0);
		}

		while (true) {
			printMenu();
			try {
				
				if (deposit >= 50) {
				//chose do player want to play another game or he will take his money
				choice = input.nextInt();
				
				if(choice != 1 && choice != 2){
					System.out.println("Wrong choice!!!");
					continue;
				}
				
				if (choice == 2) {
					System.out.println("Bye");
					break;
				}
				//play game and print result
				deposit +=dice.playGame();
				System.out.println("\nDeposit: " + deposit);
				}else{
					System.out.println("You don't have enough money!!!");
					break;
				}
			} catch (Exception e) {
				System.out.println("Wrong input!!!");
				input.nextLine();
			}
		}
		
		input.close();

	}

}
