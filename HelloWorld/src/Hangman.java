import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        boolean playing = true;
        int rightGuess = 0;
        int wrongGuess = 0;
        System.out.print("Select a word: ");
         String chosenWord = keyboard.nextLine();
         System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.print("Word: ");

        /* think of was to make this are more advanced project you can add to a portfolio (40%)
        - display the wrong guesses the user enters
        - display the actual hangman
        - allow for only one character to be entered at on time
        - display a welcome to hangman sign
        - make it a multi-player game where the players play best out of three rounds
        - make it not case sensitive
         */

        String[] letters = new String[chosenWord.length()]; // set an array with all blank spaces that holds as many elements as there are letters in the word
        for (int i = 0; i < chosenWord.length(); i++) {
            letters[i] = " _ ";
        } // dude this array is where you're storing your blank spaces so this is what you need to manipulate each time the user gets a letter right

        for (int i = 0; i < chosenWord.length(); i++) {
            System.out.print(letters[i]);
        } // this prints off the first set of all blank spaces

        while (playing) {
            System.out.println();
            System.out.println("Guess: ");
            String guess = keyboard.nextLine();


            // creates a char array
            char[] randomWordArray = new char[chosenWord.length()];

            for (int i = 0; i < chosenWord.length(); i++) {
                randomWordArray[i] = chosenWord.charAt(i);
            } // copies character one at a time into array
            // so now the array is what holds the values of each letter in the corresponding element


            boolean found = false;
            for (int i = 0; i < chosenWord.length(); i++) {

                String letterChecker = Character.toString(randomWordArray[i]);
                // converts each element in randomWordArray to a String instead of a char
                if (guess.equals(letterChecker)) {
                    letters[i] = guess;
                    rightGuess++;
                    found = true;
                    if (rightGuess == chosenWord.length()) {
                        System.out.println("You guessed the word :) ");
                        playing = false;
                    }
                }
            }

            if (!found) {
                wrongGuess++;
            }

            if (wrongGuess > 6) {
                System.out.println();
                System.out.println("You got hanged ;(");
                playing = false;
                //end game
            }

            // sets blackspace equal to character if it finds it in the word
            for (int i = 0; i < chosenWord.length(); i++) {
                System.out.print(letters[i]);
            } // prints off initial array but with updated letters if guessed
        }
    }
}