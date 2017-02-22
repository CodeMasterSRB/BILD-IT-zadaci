package zadaci_22_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji igra sa protivnikom rock-paper-scissors.
 * (papir-bunar-makaze ili tako nekako po naški) Program nasumièno generiše
 * brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita
 * korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik
 * pobijedio, da li je raèunar pobijedio ili je bilo neriješeno.
 */

public class Game {

	// method which generate move
	private static void playGame(int playerMove) throws Exception {

		if (playerMove != 0 && playerMove != 1 && playerMove != 2) {
			throw new Exception();
		}

		// generate pc move
		int pc = (int) (Math.random() * 3);
		boolean victory = true;

		// print results

		if (playerMove == 0 && pc == 1) {
			victory = true;
			if (victory == true) {
				System.out.println("WIN");

			}
		} else if (playerMove == 2 && pc == 0) {
			victory = true;
			if (victory == true) {
				System.out.println("WIN");

			}
		} else if (playerMove == 1 && pc == 2) {
			victory = true;
			if (victory == true) {
				System.out.println("WIN");

			}
		} else if (playerMove == pc) {
			System.out.println("Draw");

		} else {
			System.out.println("LOSE");

		}

	}

	public static void main(String[] args) {
		// test

		System.out.println("Unesite:   0(Makaze), 1(Papir), 2(bunar) ");
		int playerMove;
		Scanner input = new Scanner(System.in);

		try {

			// input player move
			playerMove = input.nextInt();

			// print results
			playGame(playerMove);
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}

		input.close();

	}

}
