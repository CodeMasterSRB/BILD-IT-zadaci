package zadaci_07_03_2017;

import java.util.GregorianCalendar;

public class Staff extends Employee{

	private String title;

	/**
	 * set data for fields of this class and extended class
	 * @param name
	 * @param adress
	 * @param phoneNumber
	 * @param email
	 * @param office
	 * @param salary
	 * @param dateHired
	 * @param title
	 */
	public Staff(String name, String adress, String phoneNumber, String email, String office, double salary,
			GregorianCalendar dateHired, String title) {
		super(name, adress, phoneNumber, email, office, salary, dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		
		return "\n" + super.toString() + title;
	}
	
	
	
}
