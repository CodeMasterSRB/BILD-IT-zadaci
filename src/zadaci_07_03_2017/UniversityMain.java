package zadaci_07_03_2017;

import java.util.GregorianCalendar;

public class UniversityMain {

	public static void main(String[] args) {
		//Test
		
		 Student sasaG = new Student("Sasa", "Jefte Vukovica", "066-789-456",
				  "sasagavric@outlook.com"); System.out.println(sasaG.toString());
				  
				  Employee mita = new Employee("Dragan", "Jelisejska palata BB",
				  "626-656-669", "mita@iritel.com", "Beograd", 727.89, new
				  GregorianCalendar(2016, 1, 18) );
				  System.out.println(mita.toString());
				  
				  Faculty anja = new Faculty("Anja", "Beogradski bulevar",
				  "055-789-125", "anja@hotmail.com", "Doboj", 7581.94, new
				  GregorianCalendar(2012, 5, 28), 45, "Administration");
				  System.out.println(anja.toString());
				  
				  Staff marko = new Staff("marko", "Svetog Save 54", "066-041-689",
				  "markec@gmail.com", "Banja Luka", 5180.812, new
				  GregorianCalendar(2010, 11, 5), "Boss");
				  System.out.println(marko.toString());

	}

}
