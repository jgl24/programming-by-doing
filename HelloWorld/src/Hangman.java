import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightGuess = 0;
        int wrongGuess = 0;
        int attempts = 7;
        int currentRound = 1;
        int playerOneScore = 0;
        int playerTwoScore = 0;
        boolean gameOver = false;


        System.out.println("Welcome to Hangman!");
        System.out.println("\n");
        System.out.println("This is a two player game. " +
                " We will play best 2 / 3." + "\n");

        System.out.print("Player one please enter your name: ");
        String playerOne = keyboard.nextLine();
        System.out.print("Player two please enter your name: ");
        String playerTwo = keyboard.nextLine();

        String currentGuesser = playerTwo;


        System.out.print(playerOne + " select a word: ");
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
        System.out.println();

        while (currentRound < 3) {

            System.out.println("Current round: " + currentRound);

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
                        currentRound++;
                        if (currentGuesser.equals(playerOne)) {
                            playerOneScore++;
                            System.out.println("Congrats " + playerOne + " your score is " + playerOneScore);
                            currentGuesser = playerTwo;
                            System.out.print(playerOne + " Select a word: ");
                            chosenWord = keyboard.nextLine();
                            System.out.println("\n\n\n\n\n\n\n\n\n\n");
                            System.out.print("Word: ");
                        } else if (currentGuesser.equals(playerTwo)) {
                            playerTwoScore++;
                            System.out.println("Congrats " + playerTwo + " your score is " + playerTwoScore);
                            currentGuesser = playerOne;
                            System.out.print(playerTwo + " Select a word: ");
                            chosenWord = keyboard.nextLine();
                            System.out.println("\n\n\n\n\n\n\n\n\n\n");
                            System.out.print("Word: ");

                        }


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
                currentRound++;
                if (currentGuesser.equals(playerOne)) {
                    System.out.println(playerOne + " you got hanged ;(");
                    currentGuesser = playerTwo;
                    System.out.print(currentGuesser + " Select a word: ");
                    chosenWord = keyboard.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    System.out.print(" Word: ");
                } else if (currentGuesser.equals(playerTwo)) {
                    System.out.println(playerTwo + " you got hanged ;(");
                    currentGuesser = playerTwo;
                    System.out.print(currentGuesser + " Select a word: ");
                    chosenWord = keyboard.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    System.out.print("Word: ");
                }

            }

            // sets blackspace equal to character if it finds it in the word
            for (int i = 0; i < chosenWord.length(); i++) {
                System.out.print(letters[i]);
            } // prints off initial array but with updated letters if guessed
        }
        if (playerOneScore > playerTwoScore) {
            System.out.println(playerOne + " is the winner! With a score of " + playerOneScore + " to " + playerTwoScore);
            System.out.println();
            System.out.println("Good game :)");
        }
        if (playerOneScore < playerTwoScore) {
            System.out.println(playerTwo + " is the winner! With a score of " + playerTwoScore + " to " + playerOneScore);
            System.out.println();
            System.out.println("Good game :)");
        }
        if (playerOneScore == playerTwoScore) {
            System.out.println("It was a draw ");
            System.out.println();
            System.out.println("Good game :)");
        }
    }

    public static void printArray(char[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
