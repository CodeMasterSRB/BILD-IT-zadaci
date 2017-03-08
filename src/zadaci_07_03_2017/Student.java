package zadaci_07_03_2017;

public class Student extends Person{
	
	/**
	 * Constant data for student
	 */
	private final String CLASS_STATUS = "Junior";

	public Student(String name, String adress, String phoneNumber, String email) {
		super(name, adress, phoneNumber, email);
		
	}

	public String getClassStatus() {
		return CLASS_STATUS;
	}

	@Override
	public String toString() {
		
		return super.toString() + CLASS_STATUS + "\n";
	}
	
	
	
	

}
