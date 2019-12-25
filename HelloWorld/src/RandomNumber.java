import java.util.Scanner;
import java.util.Random;
public class RandomNumber{

    public static void main(String []args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("I'm thinking of a number from 1 to 10.");
        Random r = new Random();
        int counter = 0;
        int x = 1 + r.nextInt(10);
        System.out.println("Your guess: ");
        int userInput = keyboard.nextInt();
        counter++;

        while (userInput != x){
            System.out.println("That is incorrect.  Guess again.");
            System.out.println("Your guess: ");
            counter++;
            userInput = keyboard.nextInt();
        }
        System.out.println("That's right! It only took you " + counter + " tries!");
    }
}