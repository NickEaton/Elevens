package Elevens;

public class CardTester {
	public static void main(String[] args) {
		Card card1 = new Card("Ace", "Diamonds", 1);
		Card card2 = new Card("King", "Spades", 10);
		Card card3 = new Card("Ace", "Diamonds", 1);
		
		System.out.println(card1+", "+card2+", "+card3);
		
		System.out.println("Check if card1 = card3: "+card1.equals(card3));
		System.out.println("Check if card2 = card3: "+card2.equals(card3));
		
		System.out.println(card1.getRank()+" "+card1.getSuit()+" "+card1.getValue());
	}
}
