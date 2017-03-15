package zadaci_13_03_2017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import zadaci_11_03_2017.FacultyMember;
import zadaci_11_03_2017.FacultyMember.Rank;

public class Salaries {

	private static ArrayList<FacultyMember> employees = new ArrayList<>();

	private static void getEmployees() throws MalformedURLException {

		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {

			String[] elements;
			String element;

			while ((element = br.readLine()) != null) {
				
				elements = element.split(" ");
				employees.add(new FacultyMember(elements[0], elements[1], Double.parseDouble(elements[3]),
						Rank.equal(elements[2])));
			}

		} catch (Exception e) {
			System.out.println("Greska prilikom ucitavanja");
			e.printStackTrace(System.out);
		}

	}
	
	private static void countSalaries(){
		
		double fullSalary=0;
		double numOfFull=0;
		
		double assistSalary =0;
		double numOfAssist=0;
		
		double associateSalary=0;
		double numOfAssocia=0;
		
		double total;
		
		for (FacultyMember facultyMember : employees) {
			if (facultyMember.getRank().equals(Rank.ASSISTENT)) {
				assistSalary+=facultyMember.getSalary();
				numOfAssist++;
			}else if(facultyMember.getRank().equals(Rank.FULL)){
				fullSalary+=facultyMember.getSalary();
				numOfFull++;
			}else{
				associateSalary+=facultyMember.getSalary();
				numOfAssocia++;
			}
		}
		System.out.println("\n======================================\n");
		System.out.printf("Professors total salaries: %.2f \t Averge: %.2f\n" , fullSalary, (fullSalary/numOfFull));
		System.out.printf("Assistant total salaries: %.2f \t Averge: %.2f\n" , assistSalary, (assistSalary/numOfAssist));
		System.out.printf("Associate total salaries: %.2f \t Averge: %.2f\n" , associateSalary, (associateSalary/numOfAssocia));
		
		total = fullSalary+assistSalary+associateSalary;
		System.out.printf("\nTotal: %.2f \t Averge: %.2f", total , (total / employees.size()));

	}

	public static void main(String[] args) {

		try {
			getEmployees();
			employees.forEach((member) -> System.out.println(member));
			countSalaries();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			System.out.println("Greska");
		}

	}

}
