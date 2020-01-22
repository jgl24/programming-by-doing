import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean playing = true;
        int rightGuess = 0;
        int wrongGuess = 0;
        int attempts = 7;
        System.out.println("Welcome to Hangman!");
        System.out.println("\n");
        System.out.println("This is a two player game. " +
                " We will play best 2 / 3" + "\n");

        System.out.print("Player one please enter your name: ");
        String playerOne = keyboard.nextLine();
        System.out.print("Player two please enter your name: ");
        String playertwo = keyboard.nextLine();

        System.out.print("Select a word: ");
        String chosenWord = keyboard.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.print("Word: ");


        /* think of was to make this are more advanced project you can add to a portfolio (40%)
        - display the actual hangman
        - allow for only one character to be entered at on time
        - make it a multi-player game where the players play best out of three rounds
         */
        char[] playersWrongGuess = new char[attempts];

        for (int i = 0; i < attempts; i++) {
            playersWrongGuess[i] = ' ';
        }

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


                if (guess.equals(letterChecker) || guess.equalsIgnoreCase(letterChecker)) {
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
                System.out.print("Wrong guesses: ");
                playersWrongGuess[wrongGuess] = guess.charAt(0); //charAt converts it to array of characters and gives
                // you char at the index
                wrongGuess++;
                printArray(playersWrongGuess);

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

    public static void printArray(char[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}