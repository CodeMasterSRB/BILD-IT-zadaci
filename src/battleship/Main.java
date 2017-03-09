package battleship;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	private static char[][] fields = new char[6][6];
	private static ArrayList<Ship> positions = new ArrayList<>();

	private static void setBattleShips() {

		Random random = new Random();

		for (int i = 0; i < 2; i++) {
			positions.add(new Ship(random.nextInt(6), random.nextInt(6)));
		}

	}

	private static void fillUpFields() {

		for (int row = 0; row < fields.length; row++) {

			for (int column = 0; column < fields.length; column++) {
				fields[row][column] = '#';
			}

		}

	}

	private static void printBattlefields(int hitRow, int hitColumn) {

		boolean hit = false;

		for (int row = 0; row < fields.length; row++) {

			for (int column = 0; column < fields.length; column++) {

				if (hitRow == row && hitColumn == column) {

					for (int i = 0; i < positions.size(); i++) {

						if (positions.get(i).getRowPosition() == hitRow
								&& positions.get(i).getColumnPosition() == hitColumn) {

							hit = true;
							fields[row][column] = '*';
							positions.remove(i);

						}

					}
					if (!hit) {
						fields[row][column] = '0';
					}

				}
				System.out.print(fields[row][column] + " ");

			}
			System.out.println();

		}

	}

	private static void printBattlefields() {

		for (int row = 0; row < fields.length; row++) {

			for (int column = 0; column < fields.length; column++) {

				System.out.print(fields[row][column] + " ");

			}

			System.out.println();

		}

	}

	public static void main(String[] args) {

		System.out.println("HIT 2 SHIPS FROM 15 ATTEMPTS\n");
		Scanner input = new Scanner(System.in);

		int hitRow, hitColumn, shoots = 1;

		setBattleShips();
		fillUpFields();
		printBattlefields();

		while (true) {

			try {
				if (shoots == 15) {
					System.out.println("PC WIN !!!");

					System.out.println("Ramain ships positions: ");

					for (int i = 0; i < positions.size(); i++) {
						System.out.println("Ship " + (i + 1) + ". " + positions.get(i).getRowPosition() + " : "
								+ positions.get(i).getColumnPosition());
					}

					break;
				} else if (positions.isEmpty()) {
					System.out.println("YOU WIN !!!");
					break;
				}
				System.out.println("\nTrys " + shoots + " - 15");

				System.out.print("\nAiming\nEnter row: ");
				hitRow = input.nextInt();

				System.out.print("Enter column: ");
				hitColumn = input.nextInt();

				printBattlefields(hitRow, hitColumn);
				shoots++;

			} catch (Exception e) {
				System.out.println("Pogresan unos!!!");
				input.nextLine();
			}

		}

		input.close();

	}

}
