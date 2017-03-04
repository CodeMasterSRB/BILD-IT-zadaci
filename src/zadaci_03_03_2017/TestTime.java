package zadaci_03_03_2017;

public class TestTime {
	
	public static void main(String[] args){
		
		Time newTime = new Time();
		Time time = new Time();


		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Seconds: " + newTime.getSeconds() + "\nMinute: " + newTime.getMinute() + "\nHour: " + newTime.getHour());
				
				System.out.println();
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				time.setTime(555550000);
				
				System.out.println("Seconds: " + time.getSeconds() + "\nMinute: " + time.getMinute() + "\nHour: " + time.getHour());
				
			}
		});
		
		
		thread1.start();
		thread2.start();
		
	}

}
