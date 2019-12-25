import java.util.Random;
import java.util.Scanner;
public class BlackJack {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int firstP = 2+ rand.nextInt(11);
        int secondP = 2+ rand.nextInt(11);
        int firstD = 2+ rand.nextInt(11);
        int secondD = 2+ rand.nextInt(11);
        int playerTotal = firstP + secondP;
        int dealerTotal = firstD + secondD;
        System.out.println("You drew " + firstP + " and " + secondP);
        System.out.println("Your total is " + playerTotal);

        System.out.println();

        System.out.println("The dealer has a " + firstD + " showing, and a hidden card.  ");
        System.out.println("His total is hidden too.  " );

        System.out.print("Would you like to \"hit\" or \'stay\'? ");
        String hitOrStay = keyboard.nextLine();

        while (hitOrStay.equals("hit")) {

                int thirdP = 2 + rand.nextInt(11);
                System.out.println(" You drew a " + thirdP);
                playerTotal += thirdP;
                System.out.println("Your total is " + playerTotal);
                System.out.print("Would you like to \"hit\" or \"stay\"?");
                hitOrStay = keyboard.nextLine();
            }
        if(hitOrStay.equals("stay"))
            System.out.println("Okay, dealer's turn.");
            System.out.println("His hidden card was a " + secondD + ".");
            System.out.println("His total was " + dealerTotal);

        while(dealerTotal < 16) {
                System.out.println("Dealer chooses to hit.");
                int dealerNextHit = 2 + rand.nextInt(11);
                dealerTotal += dealerNextHit;
                System.out.println("His total is " + dealerTotal);
            }
        System.out.println();
        System.out.println("Dealer stays. ");
        System.out.println("Dealer total is " + dealerTotal);
        System.out.println("Your total is " + playerTotal);

        if(dealerTotal > playerTotal && dealerTotal < 21){
            System.out.println();
            System.out.println("the ugly dealer won ");
        } else {
            System.out.println();
            System.out.println("YOU WIN!");
        }
    }
}