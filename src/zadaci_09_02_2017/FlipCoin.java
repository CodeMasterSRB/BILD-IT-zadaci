package zadaci_09_02_2017;
/* Napisati metodu koja prima jedan argument te simulira bacanje nov�i�a toliko puta.
 * Nakon �to se simulacija zavr�i, program ispisuje koliko puta je nov�i� pokazao glavu a koliko puta pismo.*/
public class FlipCoin {
	
	//method which flip and count coin
	private static void countFlips(int numberOfFliping){
		
		int head=0;
		int tail =0;
		
		//flip
		for (int flip = 0; flip < numberOfFliping; flip++) {
			
			if ((int)(Math.random()*2) == 0) {	//head or tail
				head++;	//increment if coin is fliped on head
			}else{
				tail++;//increment if coin is fliped on tail
			}
			
		}
		
		System.out.println("Novcic je bacen " + numberOfFliping + " puta");//print number of flips
		System.out.println("Pala je glava : " + head + "\nPalo je pismo: " + tail);	//print results
		
	}

	public static void main(String[] args) {
		// Test
		countFlips(100);

	}

}
