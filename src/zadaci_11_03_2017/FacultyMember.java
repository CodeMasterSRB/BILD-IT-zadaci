package zadaci_11_03_2017;

public class FacultyMember {
	
	private final String firstName;
	private final String lastName;
	public enum Rank{
		ASSISTENT, ASSOCIATE, FULL
	}
	private final double salary;
	private final Rank rank;
	
	
	public FacultyMember(String firstName, String lastName, double salary, Rank rank) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.rank = rank;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getSalary() {
		return salary;
	}

	public Rank getRank() {
		return rank;
	}
	
	
	public String toString(){
		return firstName + " " + lastName + " " + rank + " " + salary;
	}
	
	
}


