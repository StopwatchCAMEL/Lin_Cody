/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("Spades", "Jack", 11);
		Card card2 = new Card("Hearts", "Ace", 1);
		Card card3 = new Card("Clubs", "King", 12);
		
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
	}
}
