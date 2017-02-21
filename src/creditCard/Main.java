package creditCard;

import java.util.Scanner;

public class Main {
	
	//method which print standard menu for application
	private static void printMenu(){
		System.out.println("1.Check card\t2.Exit");
	}

	public static void main(String[] args) {
		// Test
		CreditCard card = new CreditCard();
		Scanner input= new Scanner(System.in);
		long cardNumber;
		int choice;
		
		
		while(true){
		
		try {
			printMenu();
			System.out.print("Enter: ");
			//chose between checking card and exiting from application
			choice = input.nextInt();
			
			if (choice == 1) {
				//check is card valid or invalid
				System.out.print("\nEnter card number: ");
				cardNumber = input.nextLong();
				card.setCardNumber(cardNumber);
				
				if (card.isLegit()) {
					System.out.println(cardNumber + " is valid\n");
				}else{
					System.out.println(cardNumber + " is invalid\n");
				}
				
			}else if(choice == 2){
				//terminate application
				System.out.println("Bye");
				break;
			}else{
				System.out.println("Wrong input!!!\n");
			}
			
		} catch (Exception e) {
			System.out.println("Wrong input!!!\n");
			e.printStackTrace(System.out);
			input.nextLine();
		}
	}

		input.close();
	}

}
