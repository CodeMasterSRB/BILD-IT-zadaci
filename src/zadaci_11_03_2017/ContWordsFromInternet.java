package zadaci_11_03_2017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ContWordsFromInternet {
	
	private static void count() throws MalformedURLException{
		URL aURL = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(aURL.openStream()))) {

			String line;
			String[] splitLine;
			int numOfWords = 0;
			int numOfParagraph=0;
			

			while (numOfParagraph < 100) {

				line = br.readLine();
				
				if (line != null) {
				splitLine = line.split(" ");
				numOfWords += splitLine.length;
				}else{
					numOfParagraph++;
				}
				
			}

			
			System.out.println("Number of words " +numOfWords);
			

		} catch (Exception e) {
			System.out.println("Eror!!!");
			e.printStackTrace(System.out);
		}

	}
	
	public static void main(String[] args){
		
		try {
			count();
		} catch (Exception e) {
			//System.out.println("EROR!!!");
			e.printStackTrace(System.out);
		}
		
	}

}
