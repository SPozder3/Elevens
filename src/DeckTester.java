/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] suits = new String[]{"Diamonds", "Hearts", "Spades", "Clubs"};
		String[] ranks1 = new String[]{"Two", "Three", "Four"};
		String[] ranks2 = new String[]{"Five", "Six", "Seven"};
		String[] ranks3 = new String[]{"Eight", "Nine", "Ten"};
		int[] pointValues1 = new int[]{2,3,4};
		int[] pointValues2 = new int[]{5,6,7};
		int[] pointValues3 = new int[]{8,9,10};

		Deck deck1 = new Deck(ranks1, suits, pointValues1);
		Deck deck2 = new Deck(ranks2, suits, pointValues2);
		Deck deck3 = new Deck(ranks3, suits, pointValues3);

		System.out.println(deck1.isEmpty());
		while (deck1.size() != 0){
			System.out.println(deck1.deal().toString());
		}
		System.out.println(deck1.isEmpty());

		System.out.println("");

		System.out.println(deck2.isEmpty());
		while (deck2.size() != 0){
			System.out.println(deck2.deal().toString());
		}
		System.out.println(deck2.isEmpty());

		System.out.println("");

		System.out.println(deck3.isEmpty());
		while (deck3.size() != 0){
			System.out.println(deck3.deal().toString());
		}
		System.out.println(deck3.isEmpty());
	}
}
