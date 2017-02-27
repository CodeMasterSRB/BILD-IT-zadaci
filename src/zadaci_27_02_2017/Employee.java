package zadaci_27_02_2017;


public class Employee implements Comparable<Employee>{
	
	private String name;
	private int[] hours;
	private int totalHours;
	
	public Employee(String name){
		
		this.name = name;
		this.hours = new int[7];
		
	}

	public int getTotalHours() {
		return totalHours;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getHours() {
		return hours;
	}

	public void setHours(int hours, int index) {
		this.hours[index] = hours;
		this.totalHours += hours;
	}

	

	@Override
	public int compareTo(Employee o) {
		if (this.totalHours < o.totalHours) {
			return 1;
		}else if(this.totalHours == o.totalHours){
			return 0;
		}else{
			return -1;
		}
	}
	
	
	
	
		

}
