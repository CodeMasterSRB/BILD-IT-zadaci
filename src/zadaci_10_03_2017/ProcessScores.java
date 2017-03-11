package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * (Process scores in a text file) Suppose that a text file contains an
 * unspecified number of scores separated by blanks. Write a program that
 * prompts the user to enter the file, reads the scores from the file, and
 * displays their total and average.
 */

public class ProcessScores {

	/**
	 * Read all scores from text file
	 * 
	 * @param nameOfFile
	 * @return
	 */
	private static String[] readFromFIle(String nameOfFile) {
		Path path = Paths.get(nameOfFile);

		String[] scores = null;

		try (BufferedReader br = Files.newBufferedReader(path)) {

			String scor;

			while ((scor = br.readLine()) != null) {

				scores = scor.split(" ");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		for (int i = 0; i < scores.length; i++) {

			System.out.println(scores[i]);
		}

		return scores;

	}

	/**
	 * Print all scores, their total and average
	 * 
	 * @param scores
	 */
	private static void printTotalAndAverge(String[] scores) {

		double total = 0;

		for (int i = 0; i < scores.length; i++) {
			total += Double.parseDouble(scores[i]);
			System.out.println(scores[i]);
		}

		System.out.println("Total: " + total);
		System.out.println("Averge: " + (total / scores.length));

	}

	public static void main(String[] args) {
		// Test

		Scanner input = new Scanner(System.in);
		String fileName;

		try {
			System.out.print("Enter file name: ");
			fileName = input.nextLine();

			printTotalAndAverge(readFromFIle(fileName));

		} catch (Exception e) {
			System.out.println("EROR.\nInputed file dosn't exist!!!");
		}

		input.close();
	}

}
