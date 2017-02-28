package quiz;

public abstract class Person {
	
	private String name;
	private String password;
	
	public Person(String name, String password){
		
		this.name = name;
		this.password = password;
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public boolean logIn(String name, String password){
		
		if (this.name.equals(name) && this.password.equals(password)) {
			System.out.println("You are successfully logged in.");
			return true;
		}else{
			System.out.println("Name or password are incorrect!!!");
			return false;
		}
		
	}
	
	public abstract void menu();

}
