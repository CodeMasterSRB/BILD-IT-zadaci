package quiz;

import java.util.Scanner;

public class Main {
	
	//print options menu for start screen
	private static void printMenu(){
		
		System.out.println("---------------------------------");
		System.out.println("1--->User\n2--->Admin\n3--->Exit");
		System.out.println("---------------------------------");

		
	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		int choice;
		
		boolean isAppOn = true;
		
		Admin admin = new Admin();
		
		while(isAppOn){
			
			try {
				printMenu();
				System.out.print("Enter: ");
				choice = input.nextInt();
				
				switch (choice) {
				case 1:
					
					break;

				case 2:
					admin.adminMotor();
					break;
					
				case 3:
					System.out.println("Bye");
					isAppOn =false;
				break;
					
				default:
					System.out.println("Wrong choice!!!\nTry again\n\n");
					break;
				}
				
				
				
			} catch (Exception e) {
				System.out.println("Wrong choice!!!\nTry again\n\n");
				input.nextLine();

			}
			
			
		}
		input.close();
	}

}
