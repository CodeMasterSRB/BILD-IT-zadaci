package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Date;

import javafx.scene.shape.Circle;

public class UseArrayList {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>();
		
		list.add(new Date(System.currentTimeMillis()));
		list.add(new Circle(50));
		
		for (Object object : list) {
			
			System.out.println(object.toString());
			
		}
		

	}

}
