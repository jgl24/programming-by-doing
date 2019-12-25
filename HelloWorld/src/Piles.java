import java.util.Scanner;

public class Piles {
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
                    keyboard.nextLine();
                    if (A > remove) {
                        if (A > 0) {
                            A = A - remove;
                            currentPlayer = playerTwo;


                        } else if (A == 0) {
                            System.out.println(" Nice try, " + playerOne + ". That pile is empty. Choose again. ");


                        }
                    } else if(remove > A) {
                        System.out.println("Pile doesn't have that many. Try again: ");
                        System.out.println(playerOne + " choose a pile: ");
                        pile = keyboard.nextLine();
                        currentPlayer = playerTwo;

                    }
                }
                if (pile.equals("B")) {
                    System.out.print("How many to remove from pile B: ");
                    remove = keyboard.nextInt();
                    keyboard.nextLine();
                    // this right here will bypass the issue with .nextInt, since its before your
                    // if and else statements you dont need to add it twice within like you have in the others
                    if (B > 0) {
                        B = B - remove;
                        currentPlayer = playerTwo;

                    } else {
                        System.out.println(" Nice try, " + playerOne + ". That pile is empty. Choose again.");
                    }
                }
                if (pile.equals("C")) {
                    System.out.print("How many to remove from pile C: ");
                    remove = keyboard.nextInt();
                    keyboard.nextLine();
                    if (C > 0) {
                        C = C - remove;
                        currentPlayer = playerTwo;


                    } else {
                        System.out.println(" Nice try, " + playerOne + ". That pile is empty. Choose again.");
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
                    keyboard.nextLine();
                    if (A > 0) {
                        A = A - remove;
                        currentPlayer = playerOne;


                    } else {
                        System.out.println(" Nice try, " + playerTwo + ". That pile is empty. Choose again. ");


                    }
                }
                if (pile.equals("B")) {
                    System.out.print("How many to remove from pile B: ");
                    remove = keyboard.nextInt();
                    keyboard.nextLine();
                    if (B > 0) {
                        B = B - remove;
                        currentPlayer = playerOne;


                    } else {
                        System.out.println(" Nice try, " + playerTwo + ". That pile is empty. Choose again");
                    }
                }
                if (pile.equals("C")) {
                    System.out.print("How many to remove from pile C: ");
                    remove = keyboard.nextInt();
                    keyboard.nextLine();
                    if (C > 0) {
                        C = C - remove;
                        currentPlayer = playerOne;


                    } else {
                        System.out.println(" Nice try, " + playerTwo + ". That pile is empty. Choose again");
                    }
                }
            }
            // if you call next and a type (nextInt, nextDouble) you have to call next line before you read more input
        } System.out.println(("A: " + A + "\t") + ("B: " + B + "\t") + ("C: " + C + "\t"));
        keyboard.nextLine();

        if(A == 0 && B == 0 && C == 0){
            if(currentPlayer == playerOne){
                System.out.println(playerTwo + ", there are no counters left, so you WIN!");
            }
            if(currentPlayer == playerTwo){
                System.out.println(playerOne + ", there are no counters left, so you WIN!");
            }
        }
    }
}
