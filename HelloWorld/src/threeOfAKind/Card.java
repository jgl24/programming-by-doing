package threeOfAKind;

public class Card {
    private Suit suit;
    private Face face;


    public Card(Suit suit, Face face) {
        this.face = face;
        this.suit = suit;
    }

    public void printCard() {

        System.out.println(suit + " " + face);
    }
}
