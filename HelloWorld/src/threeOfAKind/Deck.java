package threeOfAKind;

import java.util.Random;

public class Deck {

    Card cards[];
    int deckTracker;

    public Deck() {
        Suit[] suits = Suit.values();
        Face[] faces = Face.values();
        cards = new Card[suits.length * faces.length];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < faces.length; j++) {
                cards[index] = new Card(suits[i], faces[j]);
                index++;
            }
        }
        shuffle();
    }

    private void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cards.length; i++) {
            int randomIndex = rand.nextInt(cards.length);
            Card tempCard = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = tempCard;
        }
    }

    public boolean isEmpty() {
        if (cards.equals("")) {
            return true;
        } else return false;
    }

    public Card draw() {
        if (!cards.equals(""))
            return cards;
        else {
            return ??;
        }
    }


}
