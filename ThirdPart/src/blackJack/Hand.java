package blackJack;

public class Hand {
	private Card[] hand = new Card[5];
    private int numCards = 0;

    public void addCard(Card card) {
        if (numCards < 5) {
            hand[numCards] = card;
            numCards++;
        }
    }

    public void displayHand() {
        for (int i = 0; i < numCards; i++) {
            System.out.println(hand[i]);
        }
    }

    /*public int getPoints() {
        int totalPoints = 0;
        int numAces = 0;

        for (int i = 0; i < numCards; i++) {
            totalPoints += hand[i].getPoints();

            // Contar los Ases
            if (hand[i].getName().equals("Ace")) {
                numAces++;
            }
        }

        // Verificar si hay Ases y reducir puntos si es necesario
        while (totalPoints > 21 && numAces > 0) {
            totalPoints -= 10; // Restar 10 puntos por cada As (cambiar el valor de 11 a 1)
            numAces--;
        }

        return totalPoints;
    }*/

    public int getNumCards() {
        return numCards;
    }

}
