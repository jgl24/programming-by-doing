package threeOfAKind;

import java.util.Random;

public class Deck {

    Random random = new Random();

    Card cards[] = new Card[52];

    int deckTracker;

    public Deck() {

    }

    public boolean isEmpty() {
        if (cards <= 0) {
            return true;
        } else return false;
    }

    public Card draw() {
        if (cards == 1)
            return cards;
        else {
            return ???;
        }
    }


}
