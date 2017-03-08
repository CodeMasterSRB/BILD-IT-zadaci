package zadaci_07_03_2017;

import java.util.GregorianCalendar;

public class Employee  extends Person{
	
	private String office;
	private double salary;
	private GregorianCalendar dateHired = new GregorianCalendar();
	
	/**
	 * set all datas for object
	 * @param name
	 * @param adress
	 * @param phoneNumber
	 * @param email
	 * @param office
	 * @param salary
	 * @param date
	 */
	public Employee(String name, String adress, String phoneNumber, String email, String office, double salary, GregorianCalendar date) {
		super(name, adress, phoneNumber, email);
		
		this.office = office;
		this.salary = salary;
		
		this.dateHired= date;
	}

	public String getOffice() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public GregorianCalendar getDateHired() {
		return dateHired;
	}

	@Override
	public String toString() {
		return super.toString()  + office + "\n" + salary +"€\n"+ 
	dateHired.get(GregorianCalendar.DATE) + "-" + (dateHired.get(GregorianCalendar.MONTH) + 1 )+ "-" + dateHired.get(GregorianCalendar.YEAR) + "\n";
	}
	
	
	
	

}
