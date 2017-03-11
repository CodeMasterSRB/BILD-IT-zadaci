package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * (Remove text) Write a program that removes all the occurrences of a
 * specified string from a text file. For example, invoking java
 * Exercise12_11 John filename removes the string John from the specified
 * file. Your program should get the arguments from the command line.
 */

public class RemoveText {
	private static Path path = Paths.get("RemoveText.txt");

	/**
	 * Method remove all words that are equal with words from args[]  in ArrayList 
	 * @param args
	 * @param words
	 * @return
	 */
	private static ArrayList<String> removeAllWords(String[] args, ArrayList<String> words) {

		for (int i = 0; i < words.size(); i++) {

			for (int j = 0; j < args.length; j++)
				words.set(i, words.get(i).replaceAll(args[i], ""));

		}

		return words;
	}

	/**
	 * read all words from file and put it in ArrayList
	 * @return
	 * @throws IOException
	 */
	private static ArrayList<String> readFile() throws IOException {
		ArrayList<String> words = new ArrayList<>();

		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		String word;

		try (BufferedReader br = Files.newBufferedReader(path)) {

			while ((word = br.readLine()) != null) {
				words.add(word);
			}

		} catch (Exception e) {
			System.out.println("Wrong!!!");
		}

		return words;
	}

	/**
	 * Rewrite text file with new content
	 * @param words
	 */
	private static void updateFile(ArrayList<String> words) {

		try (BufferedWriter bw = Files.newBufferedWriter(path)) {

			for (String word : words) {

				bw.write(word);
				bw.newLine();

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ArrayList<String> words = removeAllWords(args, readFile());

			updateFile(words);
		} catch (Exception e) {
			System.out.println("Wrong!!!");
		}

	}

}
