import java.util.Scanner;
import java.util.Random;
//Write a program that picks a random number from 1-100. The user keeps guessing as long as their guess is wrong, and they've guessed less than 7 times.
// If their guess is higher than the number, say "Too high." If their guess is lower than the number, say "Too low." When they get it right, the game stops.
// Or, if they hit seven guesses, the game stops even if they never got it right.
//        This means your while loop will have a compound condition using &&.
public class WhileLoops {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int randomNum = 1 + r.nextInt(100);
        int counter = 0;

        System.out.println("I have chosen a number between 1 and 100. Try to guess it but you only have 7 attempts.");
        System.out.print("First guess: ");
        int guess = keyboard.nextInt();
        counter++;

        while (guess < randomNum && counter < 7) {
            System.out.println("\nSorry you are too low");
            counter++;
            System.out.println("Guess # " + counter + ":");
            guess = keyboard.nextInt();

            while (guess > randomNum && counter < 7) {
                System.out.println("\nSorry you are too high");
                counter++;
                System.out.println("Guess # " + counter + ":");
                guess = keyboard.nextInt();
            }
            if (randomNum == guess && counter < 7) {
                System.out.println("You guessed it?! What are the odds?!");
            }
            if (counter >= 7) {
                System.out.println("You have reached the max number of attempts");
            }

        }
    }
}