package hangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	/**
	 * generate one word from list
	 * @return
	 */
	private static String generateWord() {

		String[] possibleWords = { "stolica", "televizor", "automobil", "rusija", "beograd", "brod", "racunar","java","partizan" };

		Random rand = new Random();

		return possibleWords[rand.nextInt(9)];

	}

	/**
	 * print array
	 * @param array
	 */
	private static void printArray(char[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static void main(String[] args) {

		HangMan hang = new HangMan();
		hang.printHang0();

		
		char[] wordToFind = generateWord().toCharArray();
		char[] line = new char[wordToFind.length];
		String printCorrectWord = Arrays.toString(wordToFind);
		
		
		for (int i = 0; i < wordToFind.length; i++) {

			line[i] += '_';

		}

		System.out.print("   ");
		printArray(line);

		Scanner input = new Scanner(System.in);
		char letter;

		int counter = 0;
		boolean correct = false;
		int correctWord=0;
		char[] currectWord = new char[wordToFind.length];

		while (counter != 6) {
			correct = false;
			System.out.print("\n\nUnos: ");
			letter = input.next().charAt(0);

			for (int i = 0; i < wordToFind.length; i++) {

				if (wordToFind[i] ==  Character.toLowerCase(letter)) {
					line[i] = Character.toUpperCase(letter);
					correct = true;
					correctWord++;
					
					currectWord[i]= Character.toUpperCase(letter);	
					wordToFind[i]='#';
				}
				
			}
			

			if (!correct) {
				hang.print(counter);
				counter++;
			}else if(correctWord == wordToFind.length){
				System.out.println("Pobijedili ste\n");
				printArray(line);
				System.exit(0);
			}
			printArray(line);
		}

		System.out.println("\n\nKraj(Izgubili ste)\nTrazena rijec je: ");
		System.out.println(printCorrectWord);


		input.close();

	}

}
