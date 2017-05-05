public class Pile {

	//create variables
	private Card[] cards;
	private Card[] down;
	private Card[] up;

	//no-args constructor to initialize variables
	public Pile() {
		cards = new Card[5];
		down = new Card[5];
		up = new Card[5];
	}

	//method to add cards face down
	public void addCardFaceDown(Card card) {
		//for loop to place card into the array for the face down pile
		for(int i = down.length-1; i > 0; i--) {
			down[i] = card;
		}
	}

	//method to remove the top card from the face down pile
	public Card removeCard() {
		//local variable to hold the data for the top card
		Card card = new Card();

		//give the top card the value of the top card in the pile
		for(int i = down.length-1; i > 0; i--) {
			if(down[i].equals("")) {
				card = down[i];
			} else {
				return null;
			}
		}

		//returns the card on top
		return card;
	}

	//method to display the number of cards that are face down
	public int getNumberOfFaceDown() {
		//local variable to get the card
		int numDown;

		//initialize the variable
		numDown = down.length;

		//return the number of cards
		return numDown;
	}

	//method to add cards that face up
	public void addCardFaceUp(Card card) {
		//loop to add the card face up
		for(int i = up.length-1; i > 0; i++) {
			up[i] = card;
		}
	}

	//method to get the number of cards that are facing up
	public int getNumberFaceUp() {
		//local variable to hold the number of cards that are in the pile
		int numUp;
		numUp = up.length;
		return numUp;
	}

	//method to convert this object into a string
	public String toString() {
		String object = "";

		System.out.println("Card(s) Face Down");

		for(int i = down.length - 1; i > 0; i++) {
			object += down[i] + "\n";
		}

		System.out.println("Card(s) Face Up");

		for(int i = up.length - 1; i > 0; i++) {
			object += up[i] + "\n";
		}

		return object;
	}
} // end of Pile class