package kalendar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Reminders {

	private ArrayList<Note> listOfReminders;
	Path path = Paths.get("ListOfReminders");

	public Reminders() {
		this.listOfReminders = new ArrayList<>();
	}

	// create one reminder and add to the ArrayList which will be inputed in
	// file
	public void createReminder(int day, int month, int year, String message) {

		boolean add = true;

		GregorianCalendar remCal = new GregorianCalendar(year, --month, day);//date for reminder
		GregorianCalendar curCal = new GregorianCalendar();	//current date
		
		
		//Check if inputed date is valid
		remCal.setLenient(false);
		
		try {
		    remCal.getTime();
		}
		catch (Exception e) {//invalid date like 31.02.2017
		  System.out.println("\n\nDatum je pogresno unesen");
		  add = false;
		}

		
		//validate if date of reminder is expired
		if (!remCal.after(curCal)) {
			System.out.println("\nTaj datum je prosao!!!");
			add = false;
		}
		
		//validate if date is currect range
		if ((day <= 0 || day > 31) || (month <= 0 || month > 12) || (year <= 0 || year > 5000)) {
			add = false;// validation unsuccessful
		}

		// add note in list of reminders
		if (add && listOfReminders.add(new Note(day, month, year, message))) {// successful
																				// validation
			System.out.println("\n\nPodsjetnik je uspijesno kreiran");
		} else {// unsuccessful validation
			System.out.println("\nPogresan unos podataka.\nPodsjetnik nije kreiran");
		}

	}

	// method which print all reminders
	public void printAllReminders() {
		if (!listOfReminders.isEmpty()) {// if reminders exist
			for (Note note : listOfReminders) {
				System.out.println(note);//print one reminder per iteration
			}
		} else {// if reminders does not exist
			System.out.println("Nema podsjetnika");
		}
	}

	// input reminders from list to ArrayList
	public void updateReminders() {

		// Check if list exist, if list does not exist create one
		if (!Files.exists(path)) {
			try {
				Files.createFile(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//read file from selected path
		try (BufferedReader br = Files.newBufferedReader(path)) {

			String word;
			String[] words;

			while ((word = br.readLine()) != null) {// read until list have
													// elements
				// create array from every word separated by add one reminder in list per iteration
				words = word.split("-");
				listOfReminders.add(

						new Note(Integer.parseInt(words[0]), Integer.parseInt(words[1]), Integer.parseInt(words[2]),
								words[3]));

			}

		} catch (Exception e) {
			System.out.println("Azuriranje nije uspjelo");
		}

	}

	// method which write reminders in file
	public void inputRemindersInList() {

		try (BufferedWriter bw = Files.newBufferedWriter(path)) {

			// input one reminder per iteration and then print new line
			for (Note n : listOfReminders) {
				// input reminder in format day-month-year-message
				bw.write(n.getDay() + "-" + n.getMonth() + "-" + n.getYear() + "-" + n.getMessage());
				bw.newLine();// new line in file
			}

		} catch (IOException e) {
			System.out.println("Doslo je do greske prilikom ucitavanja!!!");
		}

	}

}
