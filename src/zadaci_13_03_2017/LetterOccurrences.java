package zadaci_13_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterOccurrences {
	
	private static List<Character> countLetters(String fileName) throws IOException{
		
		List<Character> characters = new ArrayList<>();
		
		Path path = Paths.get(fileName);
		
		if (!Files.exists(path)) {
			System.out.println("File doesn't exist!!!");
		}
		
		try(BufferedReader br = Files.newBufferedReader(path)) {
			
			String element;
			
			while ((element = br.readLine()) != null) {
				for (int i = 0; i < element.length(); i++) {
					if (Character.isAlphabetic(element.charAt(i))) {
						characters.add(Character.toUpperCase(element.charAt(i)));
					}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return characters;
	}
	
	private static void printNumOfOccurrencies(ArrayList<Character> characters){
		
		int[] letters = new int[26];
		
		for (int i = 0; i < characters.size(); i++) {	
			letters[((int)characters.get(i) - 65)]++;	
		}
		
		for (int i = 0; i < letters.length; i++) {
			System.out.println("Number of "+ (char) (i+65) + "'s :"+ (letters[i]) );
		}
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fileName;
		
		ArrayList<Character> characters;
		
		try {
			System.out.print("Enter name of the file [file.txt]: ");
			fileName = input.nextLine();
			
			characters = (ArrayList<Character>) countLetters(fileName);
			
			printNumOfOccurrencies(characters);
		} catch (Exception e) {
			System.out.println("Wrong!!!");
			e.printStackTrace(System.out);
		}
		input.close();
	}

}
