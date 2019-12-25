import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Does player one choose rock, paper, or scissors?");
        String playerOne = input.nextLine();
        System.out.println("Does player two choose rock, paper, or scissors?");
        String playerTwo = input.nextLine();

        if (playerOne.equals("rock")) {
            if (playerTwo.equals("scissors")) {
                System.out.println("Player one wins");
            } else if (playerTwo.equals("paper")) {
                System.out.println("Player two wins");
            } else {
                System.out.println("tie!!");
            }
        }
        if (playerOne.equals("paper")) {
            if (playerTwo.equals("rock")) {
                System.out.println("Player one wins");
            } else if (playerTwo.equals("scissors")) {
                System.out.println("Player two wins");
            } else {
                System.out.println("tie!!");
            }
        }
        if (playerOne.equals("scissors")) {
            if (playerTwo.equals("rock")) {
                System.out.println("Player 2 wins");
            } else if (playerTwo.equals("paper")) {
                System.out.println("Player 1 wins");
            } else {
                System.out.println("tie!!");
            }
        }
    }
}

