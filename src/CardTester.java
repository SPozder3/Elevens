/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card ace = new Card("Ace", "Spades", 14);
		Card two = new Card("Two", "Clubs", 2);
		Card twoClubs = new Card("Two", "Clubs", 2);

		System.out.println(ace.suit());
		System.out.println(ace.rank());
		System.out.println(ace.pointValue());

		System.out.println("");

		System.out.println(ace.matches(two));
		System.out.println(two.matches(twoClubs));

		System.out.println("");

		System.out.println(ace.toString());
	}
}
