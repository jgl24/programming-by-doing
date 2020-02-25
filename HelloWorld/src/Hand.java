import threeOfAKind.Card;

import java.util.Random;
import java.util.Scanner;


public class Hand {
    Random random = new Random();
    Scanner keyboard = new Scanner(System.in);
    Card cards[] = new Card[52];

    public Hand(Card[] cards) {

    }

    public void printHand() {
        for (int i = 0; i < 52; i++) {
            System.out.println([i] = random.nextInt(13));

        }
    }

    public Card discard() {
        System.out.println("Which card would you like to get rid of? ");
        Card discard = keyboard.nextLine();
        return discard;
    }

    public void addToHand(Card addCard) {
        Hand += addCard;
    }

}


