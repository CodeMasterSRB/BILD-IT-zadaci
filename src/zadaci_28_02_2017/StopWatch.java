package zadaci_28_02_2017;

public class StopWatch {

	private double startTime;
	private double endTime;
	
	public StopWatch() {
		this.startTime = 0;
	}
	
	public void start(){
		this.startTime = System.currentTimeMillis(); 
	}
	
	public void stop(){
		this.endTime=System.currentTimeMillis();
	}
	
	public double getElapsedTime(){
		return (endTime - startTime)/1000;
	}

	public double getStartTime() {
		return startTime;
	}

	public double getEndTIme() {
		return endTime;
	}
	
	
	
}
