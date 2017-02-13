package zadaci_13_02_2017;

/*
 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52
 * karte. Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6,
 * 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta (Srce, Pik,
 * Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 */

public class Cards {

	private static void generateCard() {
		
		//generate numbers between 1 and 13 convert to String
			String card =""+ ((int)(Math.random()*13)+1);//generate card
			
			if (card.equals("1")) {//replace card value 1 with A
				card = "A";
			}else if(card.equals("11")){//replace card value 11 with J
				card = "J";
			}else if(card.equals("12")){//replace card value 12 with Q
				card = "Q";
			}else if(card.equals("13")){//replace card value 13 with K
				card = "K";
			}
			
			//generate numbers between 1 and 4 and convert to String
			String symbol =""+ ((int)(Math.random()*4)+1);//generate card
			
			if (symbol.equals("1")) {//replace card value 1 with Srce
				symbol = " Srce";
			}else if(symbol.equals("2")){//replace card value 2 with Pik
				symbol = " Pik";
			}else if(symbol.equals("3")){//replace card value 3 with Djeteline
				symbol = " Djeteline";
			}else if(symbol.equals("4")){//replace card value 4 with Kocke
				symbol = " Kocke";
			}
			
			
			//print results
			System.out.println("Karta koju ste izvukli je " +  card + " u znaku"+ symbol);
		
	}

	public static void main(String[] args) {
		// Test
		
		//generate 10 random cards
		for (int i = 0; i < 10; i++) {
			generateCard();//generate card
		}

	}

}
