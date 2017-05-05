public class Card {

	private int value;
	private char suit;
	
	public Card() {
		value = 0;
		suit = 'a';
	}

	public Card(int inValue, char inSuit) {
		value = inValue;
		suit = inSuit;
	}

	public int getValue() {
		return value;
	}

	//method to get the suit of the card
	public String getSuit() {
		
		//temp variable to return the name of the card
		String name;

		//switches the letter of the suit to the actual word
		switch(suit) {
		case 'h': name = "Hearts"; break;
		case 'd': name = "Diamonds"; break;
		case 's': name = "Spades"; break;
		case 'c': name = "Clubs"; break;
		default: return " ";
		}
		return name;
	}

	//method to print turn the class into a string
	public String toString() {
		
		//variable to hold the name of card if it is a face card
		String card;

		//switch statement to turn face cards into the names
		switch(value) {
		case 1: card = "Ace"; break;
		case 11: card = "Jack"; break;
		case 12: card = "Queen"; break;
		case 13: card = "King"; break;
		default: card = Integer.toString(value);
		}

		//returns the string with the suit and the name
		return card + " of " + getSuit();
	}
} // end of Card class