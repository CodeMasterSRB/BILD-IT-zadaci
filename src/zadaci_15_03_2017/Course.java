package zadaci_15_03_2017;

public class Course implements Cloneable{

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		// Left as an exercise in Programming Exercise 10.9
	}

	@Override
	protected Course clone() throws CloneNotSupportedException {
		String[] dcStudents = new  String[100];
		
		for (int i = 0; i < this.students.length; i++) {
			dcStudents[i] = this.students[i];
		}
		
		Course newCourse = new Course(this.courseName);
		newCourse.students = dcStudents;
		
		return newCourse;
	}

	
}
