package kalendar;

//This is one note for reminder
public class Note {

	private int day;
	private int month;
	private int year;

	private String message;

	public Note(int day, int month, int year, String message) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.message = message;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public String getMessage() {
		return message;
	}

	// generate message for one reminder
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return day + "." + month + "." + year + "--->" + message;
	}

}
