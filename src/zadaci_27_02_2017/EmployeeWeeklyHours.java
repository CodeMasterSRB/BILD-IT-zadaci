package zadaci_27_02_2017;

import java.util.Arrays;
import java.util.Random;

/*(Compute the weekly hours for each employee) Suppose the weekly hours for all
	employees are stored in a two-dimensional array. Each row records an employee’s
	seven-day work hours with seven columns. For example, the following
	array stores the work hours for eight employees. Write a program that displays
	employees and their total hours in decreasing order of the total hours.*/

public class EmployeeWeeklyHours {

	// method which compute weekly hours for eight employees
	private static Employee[] computeWeeklyHours() {

		Employee[] employees = new Employee[8];

		Random random = new Random();


		// input hours for specific employee
		for (int row = 0; row < employees.length; row++) {

			// set name for employee
			employees[row] = new Employee("Employee " + row);

			for (int i = 0; i < employees[row].getHours().length; i++) {

				// randomly input hours for employee
				employees[row].setHours(random.nextInt(9), i);
				

			}

		}

		return employees;

	}
	
	//method which print employees
	private static void printAllEmployees(){
		
		Employee[] employees = computeWeeklyHours();
		
		
		//print days in week
		System.out.println("             MO  TU  WE  TH  FR  SA  SU");
		
		for (int i = 0; i < employees.length; i++) {
			System.out.print(employees[i].getName() + ": ");
			
			for (int j = 0; j < employees[i].getHours().length; j++) {
				System.out.printf("%3d " ,employees[i].getHours()[j]);
				
			}
			
			System.out.println();
			
		}
		
		Arrays.sort(employees);
		
		System.out.println("\n\nSortiranje zaposlenih po ukupnom broju sati: \n");
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getName()+ "   Total hours: " +  employees[i].getTotalHours());
		}
		
	}
	
	

	public static void main(String[] args) {
		//Test
		
		
			
			//print result
			try{
			printAllEmployees();
			}catch(Exception e){
				System.out.println("Greska!!!");
				e.printStackTrace(System.out);
			}
		
	}

}
