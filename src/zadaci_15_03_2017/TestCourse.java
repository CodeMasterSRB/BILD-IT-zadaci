package zadaci_15_03_2017;

public class TestCourse {
	
	private static void printStudents(String[] students){
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
	}

	public static void main(String[] args) {
		
		Course course1 = new Course("Course 1");
		try {
			Course course2 = (Course) course1.clone();
			
			course1.addStudent("Sasa");
			course1.addStudent("Marija");
			course1.addStudent("Vanja");
			
			printStudents(course2.getStudents());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
