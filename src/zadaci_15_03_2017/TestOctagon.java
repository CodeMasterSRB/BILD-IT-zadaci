package zadaci_15_03_2017;

public class TestOctagon {

	public static void main(String[] args) {
		Octagon octagon1 = new Octagon(5);
		try {
			Octagon octagon2 = (Octagon) octagon1.clone();
			System.out.println(octagon1.compareTo(octagon2));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
