package threeOfAKind;

public class Card {
    private Suit2 suit;
    private Face face;


    public Card(Suit2 suit, Face face) {
        this.face = face;
        this.suit = suit;
        Suit2.CLUB;
        Suit.CLUB.name();
    }

    public void printCard() {

        System.out.println(suit + " " + face);
    }
}
