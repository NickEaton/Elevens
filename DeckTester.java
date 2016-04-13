package Elevens;

public class DeckTester {
	public static void main(String[] args) {
		Deck deck = new Deck(new String[] {"Jack", "King", "Queen"}, new String[] {"Diamonds", "Spades", "Hearts"}, new int[] {10, 10, 10});
		
		System.out.println("Size: "+deck.getSize());
		
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		
		System.out.println("Deck empty?: "+deck.isEmpty());
		
		Deck ndeck = new Deck();
		System.out.println(ndeck.toString());
	}
}
