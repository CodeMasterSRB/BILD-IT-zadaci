package kalendar;

import java.util.Scanner;

public class Main {

	// print menu
	private static void menu() {
		
		System.out.println("\n==================================");
		System.out.println("1.Pregled kalendara\n2.Pregled svih podsjetnika\n3.Unos novog podsjetnika\n4.Izlaz");
		System.out.println("==================================\n");


	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		UserCalendar calendar = new UserCalendar();
		Reminders reminders = new Reminders();
		reminders.updateReminders();
		
		
		int choice;
		boolean isExit = false;//validator for menu

		System.out.println("CMaster Kalendar");
		
		while (!isExit) {

			try {
				
				menu();//print menu
				System.out.print("\nUnos: ");
				choice = input.nextInt();//input choice for menu

				switch (choice) {
				case 1:
					System.out.println("\nPregled kalendara");
					
					System.out.print("\nUnesite mjesec: ");
					int month = input.nextInt();
					
					System.out.print("Unesite godinu: ");
					int year = input.nextInt();
					//print results
					calendar.printMonth(year, month);
					break;
				case 2:
					System.out.println("\nPregled svih podsjetnika");
					//print result
					reminders.printAllReminders();
					break;
				case 3:
					System.out.println("\nUnos novog podsjetnika: ");
					
					System.out.print("Unesite dan: ");
					int rDay = input.nextInt();
					
					System.out.print("Unesite mjesec: ");
					int rMonth = input.nextInt();
					
					System.out.print("Unesite godinu: ");
					int rYear = input.nextInt();
					
					System.out.print("Unesite poruku za podsjetnik: ");
					
					input.nextLine();//clear input for next data
					String rMessage = input.nextLine();
					
					//create one reminder and add him to the ArrayList and file
					reminders.createReminder(rDay, rMonth, rYear, rMessage);
					reminders.inputRemindersInList();
					break;
				case 4://choice for exit
					isExit = true;//terminate program
					System.out.println("Bye");
					break;

				default:
					//if user input wrong number 
					System.out.println("Nepostojeca komanda, izaberite opciju 1,2,3 ili 4");
					break;
				}
			} catch (Exception e) {
				//if user input something else than integer
				System.out.println("Nepravilan unos, pokusajte ponovo!!!");
				input.nextLine();//clear input
			}

		}

		input.close();

	}
	
}
