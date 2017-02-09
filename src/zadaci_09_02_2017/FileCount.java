package zadaci_09_02_2017;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* Napišite program koji æe brojati broj karaktera, rijeèi i linija teksta u nekom fileu.
 *  Rijeèi trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u vaš program.*/

public class FileCount {

	// This method count characters, words and lines in file
	private static void countCharsWordsLines(String fileName) {

		Path path = Paths.get(fileName); // get location of the file

		int chars, words, lines;
		chars = words = lines = 0;

		// read file
		try (BufferedReader br = Files.newBufferedReader(path)) {

			String fileLine;
			String[] wordsInLine;

			while ((fileLine = br.readLine()) != null) { // read line
				wordsInLine = fileLine.split(" "); // separate words in line

				// counting chars in one line
				for (int i = 0; i < wordsInLine.length; i++) {
					chars += wordsInLine[i].length();
				}

				words += wordsInLine.length; // counting words in line

				lines++;// increment lines

			}

		} catch (Exception e) {
			System.out.println("Greska");
		}

		// print results
		System.out.println("Karaktera u fajlu: " + chars + "\nRijeci u fajlu: " + words + "\nLinija u fajlu: " + lines);

	}

	public static void main(String[] args) {
		// Test
		countCharsWordsLines("file.txt");
	}

}
