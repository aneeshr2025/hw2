package flippy;

/**
 * Keeps track of the cards and and answers questions
 * for the flippy card game. 
 * 
 * Red cards (hearts and diamonds) award positive points, while black cards 
 * (clubs and spades) award negative points.  Cards 2-10 have points worth 
 * their face value, Jack, Queen and King 10 and Ace 11.
 * 
 * @author 
 *
 */
public class FlippyCards {
	private Card[] cards; // the cards for the game

	/**
	 * Create a new flippy card game state, which consists of the
	 * numCards cards for the game.
	 * 
	 * @param numCards number of cards in the game
	 */
	public FlippyCards(int numCards){
		// TODO: Fill in good stuff here!
		this.cards = new Card[numCards]; // numCards is length of cards array
		CardDealer deck = new CardDealer(1);
		for (int i = 0; i < numCards; i++)
		{
			if (deck.hasNext())
			{
				cards[i] = deck.next();
			}
		}

	}

	/**
	 * Returns the flippy card at the given index 
	 * @param index given index
	 * @return the flippy card at the given index
	 */
	public Card getCard(int index) {
		// TODO: Fill in good stuff here!
		return cards[index];
	}
	
	/**
	 * Flip the card over at this index.  Card indices
	 * start at 0 and go up the cards.length-1
	 * 
	 * @param cardIndex the index of the card to flip over
	 */
	public void flipCard(int cardIndex) {
		//TODO: Fill in good stuff here!
		cards[cardIndex].flip(); // calls flip method in Card Class
	}

	/**
	 * Calculate the best possible score for the
	 * current cards.
	 * 
	 * @return the optimal score
	 */
	public int calculateOptimalScore(){
		//TODO: Fill in good stuff here!
		int sum = 0;
		for (Card c : cards) //calculates optimal score looping through all cards
		{
			if (c.isRedCard()) 
			{
				sum += c.getFlippyCardValue(); // adds red card values
			}
		}
		return sum;
	}


	/**
	 * Calculate the flippy card score for the cards that are
	 * face up.  
	 * 
	 * @return the flippy card score for faceup cards
	 */
	public int faceUpTotal(){
		//TODO: Fill in good stuff here!
		int sum = 0;
		for (Card c : cards)
		{
			if (c.isFaceUp()) // calculates sum for cards faced up
			{
				if (c.isRedCard())
				{
					sum += c.getFlippyCardValue();
				}
				else
				{
					sum -= c.getFlippyCardValue();
				}
			}
		}
		return sum;
	}
		

	/**
	 * Calculate the flippy card score for the cards that are
	 * face down.  
	 * 
	 * @return the flippy card score for facedown cards
	 */
	public int faceDownTotal(){
		//TODO: Fill in good stuff here!
		int sum = 0;
		for (Card c : cards)
		{
			if (!c.isFaceUp()) // calculates sum for cards faced down
			{
				if (c.isRedCard())
				{
					sum += c.getFlippyCardValue();
				}
				else
				{
					sum -= c.getFlippyCardValue();
				}
			}
		}
		return sum;
	}
	

	//TODO: Add a toString method here!
	public String toString()
	{
		String s = "";
		for (int i = 0; i < cards.length; i++)
		{
			if (i == 0)
			{
				if (cards[i].isFaceUp())
				{
					s += cards[i].getNumber() + " of " + cards[i].getSuit() + " |";
				}
				else
				{
					s += "FACE-DOWN" + " |";
				}
			}
			else if (i == cards.length - 1)
			{
				if (cards[i].isFaceUp())
				{
					s += " " + cards[i].getNumber() + " of " + cards[i].getSuit();
				}
				else
				{
					s += " FACE-DOWN";
				}
			}
			else
			{
				if (cards[i].isFaceUp())
				{
					s += " " + cards[i].getNumber() + " of " + cards[i].getSuit() + " |";
				}
				else
				{
					s += " FACE-DOWN" + " |";
				}
			}
		}
		return s;
	}
}

