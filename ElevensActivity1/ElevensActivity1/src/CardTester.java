/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("Spades", "Ace", 1);
                Card c2 = new Card("Spades", "Jack", 11);
                Card c3 = new Card("Diamonds", "Seven", 7);
                
                c1.toString();
                c2.toString();
                c3.toString();
                
                System.out.println(c1);
                System.out.println(c2);
                System.out.println(c3);
                
	}
}
