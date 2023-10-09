package blackJack;

import java.util.Random;

public class Deck {
    private Card[] cardArray = new Card[52];
    private int cardsUsed = 0;
    private Random random = new Random();
    
    Deck() {
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;

        for (int i = 1; i <= suits; i++) {
            for (int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
    }
    
    public void shuffle() {
        for (int i = cardArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cardArray[i];
            cardArray[i] = cardArray[j];
            cardArray[j] = temp;
        }
        cardsUsed = 0;
    }
    
    
    public Card drawCard() {
        if (cardsUsed == cardArray.length) {
            shuffle();
        }
        return cardArray[cardsUsed++];
    }
	
	
	public void print(){
		for(int i = 0; i < cardArray.length; i++)
		System.out.println(cardArray[i]);
	}

}
