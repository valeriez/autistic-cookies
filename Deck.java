public class Deck {

	//create variables to be used
	private Card[] cards;
	private int cardsLeft;

	//no-args constructor
	public Deck() {
		
		//initialize variables
		cardsLeft = 52;
		int cardValue = 1;
		cards = new Card[52];

		//fill in the values for the deck with no repeats
		for(int i = 0; i < 52; i += 4) {
			cards[i] = new Card(cardValue, 'd');
			cards[i + 1] = new Card(cardValue, 's');
			cards[i + 2] = new Card(cardValue, 'c');
			cards[i + 3] = new Card(cardValue, 'h');
			cardValue++;
		}
	}

	//method to shuffle the cards
	public void shuffle() {
		
		//for loop to shuffle the deck 1000 times
		for(int i = 0; i < 1000; i++) {
			//create temporary variables
			int num1, num2;
			Card val;

			//initialize temporary variables
			num1 = (int)(Math.random() * 52);
			num2 = (int)(Math.random() * 52);

			//mix deck around
			val = cards[num1];
			cards[num1] = cards[num2];
			cards[num2] = val;
		}
	}

	//method to get the card on top of the deck
	public Card dealCard() {
		//temporary variable to get the card on top
		Card holder = cards[cardsLeft-1];
		cardsLeft--;

		return holder;
	}

	//method to get the number of cards in the deck
	public int cardscardsLeft() {
		return cardsLeft;
	}

	public String toString() {
		String object = "";

		for(int i = 0; i < cardsLeft; i++) {
			object += "\n" + cards[i].toString();
		}
		return object;
	}
} // end of Deck class