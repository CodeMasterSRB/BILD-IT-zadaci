package zadaci_11_03_2017;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Reformat {
	
	
		public static void main(String[] args) throws Exception {
			

			File file = new File("Main.txt");

			if (!file.exists()) {
				System.out.println("File does not exist");
			}

			ArrayList<String> list = new ArrayList<>();
			String string1 = "";
			String string2 = "";

			try (
				Scanner input = new Scanner(file);
			) {
				string1 = input.nextLine();
				while (input.hasNext()) {
					string2 = input.nextLine();
					if (string2.length() > 0 && 
						 string2.charAt(string2.length() - 1) == '{') {
						list.add(string1.concat(" {"));
						string1 = input.nextLine();
					}
					else {
						list.add(string1);
						string1 = string2;
					}
				}
				list.add(string1);
			}

			try (
				PrintWriter output = new PrintWriter(file);
			) {
				for (int i = 0; i < list.size(); i++) {
					output.println(list.get(i));
				}
			}
		}
	
	

}
