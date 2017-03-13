package zadaci_11_03_2017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ProcessScores {
//http://cs.armstrong.edu/liang/data/Scores.txt
	
	private static void count() throws MalformedURLException{
		URL aURL = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(aURL.openStream()))) {

			String line;
			String[] splitLine;
			double scores = 0;
			

			while ((line = br.readLine()) != null) {

				splitLine = line.split(" ");
				
				for (int i = 0; i < splitLine.length; i++) {
					scores += Double.parseDouble(splitLine[i]);
				}
				
				
			}

			
			System.out.println("Scores " +scores);
			

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
