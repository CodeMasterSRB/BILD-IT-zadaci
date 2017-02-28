package connectFour;

import java.util.Scanner;

/*
 * Game: connect four) Connect four is a two-player board game in which the
 * players alternately drop colored disks into a seven-column, six-row
 * vertically suspended grid, as shown below. The objective of the game is
 * to connect four same-colored disks in a row, a column, or a diagonal
 * before your opponent can do likewise. The program prompts two players to
 * drop a red or yellow disk alternately. In the preceding figure, the red
 * disk is shown in a dark color and the yellow in a light color. Whenever a
 * disk is dropped, the program redisplays the board on the console and
 * determines the status of the game (win, draw, or continue). Here is a
 * sample run:
 */

public class Main {
	
	public static void main(String[] args) {

		// Play game
		Scanner input = new Scanner(System.in);
		ConnectMotor gameMotor = new ConnectMotor(7, 6);
		System.out.println("Igra: Connect 4\n\n");
		System.out.println("Unesite broj izmedju 0 i 6: ");
		System.out.println(gameMotor);

		int turns = 6 * 7;
		int player = 0;

		do {
			// 1. get a simbol
			char simbol = ConnectMotor.twoPlayers[player];

			// 2. make a turn for currect player
			gameMotor.doYourTurn(simbol, input);
			System.out.println(gameMotor);

			// 3. check winning combinations
			if (gameMotor.winCombination()) {
				
				if (simbol == 'x') {
					System.out.println("Igrac 1 je pobijedio!");

				}else{
					System.out.println("Igrac 2 je pobijedio!");

				}
				return;
			}

			// 4. change the player
			player = 1 - player;

			// 5. decrease moves
			--turns;

			if (turns == 0) {
				break;
			}
			// 6. repeat
		} while (true);

		System.out.println("Nerijeseno");

	}


}
