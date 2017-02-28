package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Person {

	private static ArrayList<Question> list = new ArrayList<>();
	private Scanner input = new Scanner(System.in);

	public Admin() {
		super("Sale", "sale");
		// TODO Auto-generated constructor stub
	}

	public void adminMotor() {

		boolean isAdminOn = true;
		int choice;

		while (isAdminOn) {
			menu();
			System.out.print("Enter: ");
			choice = input.nextInt();

			switch (choice) {
			case 1:

				break;

			case 2:

				break;
				
			case 3:

				break;

			case 4:
				isAdminOn = false;
				System.out.println();
				break;

			default:
				System.out.println("Wrong choice!!!\nTry again\n\n");
				break;
			}

		}

	}

	@Override
	public void menu() {
		System.out.println("\n---------------------------------");
		System.out.println("1--->Add question\n2--->Edit question\n3--->Delete user\n4--->Back");
		System.out.println("---------------------------------");

	}

	public static ArrayList<Question> getList() {
		return list;
	}

	public static void setList(ArrayList<Question> list) {
		Admin.list = list;
	}

}
