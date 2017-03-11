package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountElementsInFile {

	public static void main(String[] args) {

		Path path = Paths.get(args[0]);

		try (BufferedReader br = Files.newBufferedReader(path)) {

			String line;
			String[] splitLine;
			int numOfChars = 0;
			int numOfWords = 0;
			int numOfLines = 0;

			while ((line = br.readLine()) != null) {

				splitLine = line.split(" ");
				numOfWords = splitLine.length;
				for (String n : splitLine) {
					numOfChars += n.length();
				}
				numOfLines++;
			}

			System.out.println("Number of chars "+numOfChars);
			System.out.println("Number of words " +numOfWords);
			System.out.println("Number of lines "+numOfLines);

		} catch (Exception e) {
			System.out.println("Eror!!!");
		}

	}

}
