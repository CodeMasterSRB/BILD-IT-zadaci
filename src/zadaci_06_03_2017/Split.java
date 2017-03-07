package zadaci_06_03_2017;

public class Split {
	
	private static String[] split(String s, String regx){
		
		String oldS=s;
		String newWord="";
		int num =1;
		
	s = s.replaceAll(regx, " ");
		
		
		
		for (int i = 0; i < s.length(); i++) {
					
			if (s.charAt(i) == ' ') {
				num+=2;
			}
			
		}
		
		String[] words = new String[num];
		
		
		
		for (int i = 0,j=0; i < s.length(); i++) {
			
			if (s.startsWith(regx)) {
				words[i] = regx;
			}
			
			if (s.endsWith(regx)) {
				words[words.length-1] = regx;
			}
			
			if (s.charAt(i) != ' ') {
				newWord+=s.charAt(i);
				
			}else {
				words[j] = newWord;
				words[j+1] =""+ oldS.charAt(i);
				newWord="";
				j+=2;
			}
		}
		
		words[num-1]= newWord;
		
		return words;
		
	}
	
	public static void main(String[] args){
		
		String[] strings = split("ab#12#453", "#");
		
		for (int i = 0; i < strings.length; i++) {
			
			System.out.print(strings[i] + ", ");
		}
		
		System.out.println("\n");
		
		strings = split("a?b?gf#e", "[?#]");
		
		for (int i = 0; i < strings.length; i++) {
			
			System.out.print(strings[i] + ", ");
		}
		
		
		
	}

}
