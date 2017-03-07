package zadaci_06_03_2017;

public class TestMyStringBuilder {

	public static void main(String[] args) {
		
		MyStringBuilder1 s = new MyStringBuilder1("Sasa");
		
		MyStringBuilder1 a = new MyStringBuilder1("1995");

		MyStringBuilder1 f = s.append(a);
		
		System.out.println(f);

		

	}

}
