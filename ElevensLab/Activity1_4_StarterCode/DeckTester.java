/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	String[] rank = {"2", "Queen", "8"};
	String[] suits = {"clubs", "spades", "diamonds",};
	int[] pValue = {2, 12, 8};
	
	String[] rank1 = {"5", "7", "Ace"};
	String[] suits1 = {"spades", "hearts", "clubs",};
	int[] pValue1  = {5, 7, 1};
	
	String[] rank2 = {"Ace", "Two", "Three"};
	String[] suits2 = {"diamonds", "clubs", "hearts"};
	int[] pValue2 = {1, 2, 3};
	
	Deck deck1 = new Deck(rank, suits, pValue);
	Deck deck2 = new Deck(rank1, suits1, pValue1);
	Deck deck3 = new Deck(rank2, suits2, pValue2);
	
	System.out.println(deck1.deal());
	System.out.println(deck1);
	System.out.println(deck1.size());
	System.out.println(deck2.deal());
	System.out.println(deck2);
	System.out.println(deck2.size());
	System.out.println(deck3.deal());
	deck3.shuffle();
	System.out.println(deck3);
	
	String[] R2 = new String[52];
    String[] S2 = new String[52];
    int[] pointValues2 = new int[52];
		
    for (int i = 0; i < 52; i++) 
	{
		String ranks = "";
        String suit = "";
        if ( (i+1) % 13 == 11 ) 
		{
			ranks = "Jack";
        }
        else if ( (i+1) % 13 == 12 ) 
		{
			ranks = "Queen";
        }
        else if ( (i+1) % 13 == 0 ) 
		{
			ranks = "King";
        }
        else if ( (i+1) % 13 == 1 ) 
		{
            ranks = "Ace";
        }
        else 
	    {
            ranks = Integer.toString((i + 1) % 13);
        }
            
        if (i < 13) 
		{
            suit = "Hearts";
        }
        else if (i < 26) 
		{
            suit = "Diamonds";
        }
        else if (i < 39) 
		{ 
			suit = "Clubs";
        }
        else 
		{
            suit = "Spades";
        }
            
        R2[i] = ranks;
        S2[i] = suit;
        pointValues2[i] = ((i+1) % 13);
        }
        
        Deck x = new Deck(R2, S2, pointValues2);
        System.out.println(x);
    }
}
