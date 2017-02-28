package connectFour;

import java.util.Arrays;
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

public class ConnectMotor {


	
	private final int w;
	private final int h;

	private final char[][] board;
	public final static char[] twoPlayers = new char[] { 'x', 'O' };
	private final char empty = '-';

	private int lastR = -1;
	private int lastC = -1;

	
	
	public static char[] getTwoplayers() {
		return twoPlayers;
	}

	// set width and height
	public ConnectMotor(int width, int height) {
		this.w = width;
		this.h = height;

		board = new char[height][];

		for (int i = 0; i < height; i++) {
			Arrays.fill(board[i] = new char[width], empty);
		}
	}
	
	//check for winning combinations 
	public boolean winCombination() {
		if (lastC == -1) {
			// no moves have been made!
			return false;
		}

		char badge = board[lastR][lastC];
		String wc = String.format("%c%c%c%c", badge, badge, badge, badge);

		// return result for combinations
		return hLine().contains(wc) || v().contains(wc)
				|| dLine().contains(wc) || bDLine().contains(wc);
	}

	//chosen player put his turn
	public void doYourTurn(char simbol, Scanner input) {
		do {
			// enter in column
			
			
			if (simbol == 'x') {
				System.out.println("Igrac 1 je na potezu!");

			}else{
				System.out.println("Igrac 2 je na potezu!");

			}
			
			int column = input.nextInt();
			
			

			// check
			if (column < 0 || column >= w) {
				System.out.println("Uesite broj izmedju 0 i " + (w - 1));
				continue;
			}

			// place a simbol
			for (int i = h - 1; i >= 0; i--) {
				if (board[i][column] == empty) {
					board[lastR = i][lastC = column] = simbol;
					return;
				}
			}

			// Can't find a spot
			System.out.println("Column " + column + " is full.");

		} while (true);
	}

	

	// method which check for horizontal line
	private String hLine() {
		return new String(board[lastR]);
	}

	// method which check for horizontal line
	private String v() {
		StringBuilder sb = new StringBuilder(h);
		for (int i = 0; i < h; i++) {
			sb.append(board[i][lastC]);
		}

		return sb.toString();
	}

	// method which check for diagonal line
	private String dLine() {
		StringBuilder sb = new StringBuilder(h);
		for (int i = 0; i < h; i++) {
			int j = lastC + lastR - i;
			if (0 <= j && j < w) {
				sb.append(board[i][j]);
			}
		}

		return sb.toString();
	}

	// method which check for back diagonale line
	private String bDLine() {
		StringBuilder sb = new StringBuilder(h);
		for (int i = 0; i < h; i++) {
			int j = lastC - lastR + i;
			if (0 <= j && j < w) {
				sb.append(board[i][j]);
			}
		}

		return sb.toString();
	}

	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		for (int j = 0; j < h; j++) {
			for (int i = 0; i < w; i++) {
				sBuilder.append(board[j][i]);
				sBuilder.append(" ");
			}

			sBuilder.append("\n");
		}

		return sBuilder.toString();
	}

	
}