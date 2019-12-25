import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int A = 3;
        int B = 4;
        int C = 5;
        System.out.print("Player 1, enter your name: ");
        String playerOne = keyboard.nextLine();
        System.out.print("Player 2, enter your name: ");

        // player 1 has to pick a pile then player 2 gets to pick,
        // player 1 goes again
        String playerTwo = keyboard.nextLine();

        System.out.println(("A: " + A + "\t") + ("B: " + B + "\t") + ("C: " + C + "\t"));
        String currentPlayer = playerOne;


        while (A > 0 || B > 0 || C > 0) {

            if (currentPlayer == playerOne) {

                System.out.println(playerOne + " choose a pile: ");
                String pile = keyboard.nextLine();
                int remove = 0;

                if (pile.equals("A")) {
                    System.out.print("How many to remove from pile A: ");
                    remove = keyboard.nextInt();
                    if (A > 0) {
                        A = A - remove;
                        currentPlayer = playerTwo;
                        keyboard.nextLine();

                    } else {
                        System.out.println(" Nice try, " + playerOne + ". That pile is empty. Choose again: ");
                        pile = keyboard.nextLine();

                    }
                }
                if (pile.equals("B")) {
                    System.out.print("How many to remove from pile B: ");
                    remove = keyboard.nextInt();
                    if (B > 0) {
                        B = B - remove;
                        currentPlayer = playerTwo;
                        keyboard.nextLine();

                    } else {
                        System.out.println(" Nice try, " + playerOne + ". That pile is empty. Choose again");
                    }
                }
                if (pile.equals("C")) {
                    System.out.print("How many to remove from pile C: ");
                    remove = keyboard.nextInt();
                    if (C > 0) {
                        C = C - remove;
                        currentPlayer = playerTwo;
                        keyboard.nextLine();

                    } else {
                        System.out.println(" Nice try, " + playerOne + ". That pile is empty. Choose again");
                    }
                }
            }

            // here is where we go if player two is current palyer
            if (currentPlayer == playerTwo) {

                System.out.println(playerTwo + " choose a pile: ");
                String pile = keyboard.nextLine();
                int remove = 0;

                if (pile.equals("A")) {
                    System.out.print("How many to remove from pile A: ");
                    remove = keyboard.nextInt();
                    if (A > 0) {
                        A = A - remove;
                        currentPlayer = playerOne;
                        keyboard.nextLine();

                    } else {
                        System.out.println(" Nice try, " + playerTwo + ". That pile is empty. Choose again: ");


                    }
                }
                if (pile.equals("B")) {
                    System.out.print("How many to remove from pile B: ");
                    remove = keyboard.nextInt();
                    if (B > 0) {
                        B = B - remove;
                        currentPlayer = playerOne;
                        keyboard.nextLine();

                    } else {
                        System.out.println(" Nice try, " + playerTwo + ". That pile is empty. Choose again");
                    }
                }
                if (pile.equals("C")) {
                    System.out.print("How many to remove from pile C: ");
                    remove = keyboard.nextInt();
                    if (C > 0) {
                        C = C - remove;
                        currentPlayer = playerOne;
                        keyboard.nextLine();

                    } else {
                        System.out.println(" Nice try, " + playerTwo + ". That pile is empty. Choose again");
                    }
                }
            }
            // if you call next and a type (nextInt, nextDouble) you have to call next line before you read more input
        } System.out.println(("A: " + A + "\t") + ("B: " + B + "\t") + ("C: " + C + "\t"));
        keyboard.nextLine();
    }
}