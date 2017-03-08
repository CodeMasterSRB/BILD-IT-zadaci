package zadaci_07_03_2017;

import java.util.GregorianCalendar;

public class Faculty extends Employee {
	
	private int officeHours;
	private String rank;

	public Faculty(String name, String adress, String phoneNumber, String email, String office, double salary,
			GregorianCalendar date, int officeHours, String rank) {
		super(name, adress, phoneNumber, email, office, salary, date);
		
		this.officeHours = officeHours;
		this.rank = rank;
		
	}

	public int getOfficeHours() {
		return officeHours;
	}

	public String getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return super.toString() + officeHours + "\n" + rank;
	}
	
	
	
	

}
