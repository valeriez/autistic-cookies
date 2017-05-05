public class ClockSolitaire {

	//main method to run the game
	public static void main(String[] args) {

		//create and initialize variables
		Pile[] piles = new Pile[13];
		Deck decks = new Deck();
		int step = 0;
		int score = 0;
		int gamesPlayed = 0;
			
		//shuffle the deck
		decks.shuffle();

		//loop to add cards to the face down pile
		for(int i = 0; i < piles.length - 1; i++) {
			for(int j = 0; j < 4; j++) {
				piles[i] = new Pile();
				piles[i].addCardFaceDown(decks.dealCard());
			}
		}

		//loop to print out all the piles
		for(int i = 0; i < piles.length - 1; i++) {
			System.out.print(piles[i].toString());
		}

		//loop to print out the number of cards face down in each pile, and remove one card from each pile to
		//and add it to the face up pile, whilst incrementing the number of times a card is removed and added
		for(int i = piles.length - 1; i < 0; i--) {
			System.out.print(piles[i].getNumberOfFaceDown());
			piles[i].addCardFaceUp(piles[i].removeCard());
			step++;
		}

		//loop to print the remaining piles        
		for(int i = 0; i < piles.length - 1; i++) {
			System.out.print(piles[i].toString());
		}

		//loop to score the game, which depends on the number of cards remaining face down in each pile
		for(int i = 0; i < piles.length - 1; i++) {
			score += piles[i].getNumberOfFaceDown();
			
			if(score == 0) {
				System.out.println("Your Score is: " + score + "\n You Win!");
			} else {
				System.out.println("Your Score is: " + score + "\n You Lose!");
			}
		}
		
	}

}