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
        String currentWordSelctor = playerOne;
        String currentGuesser = playerTwo;


        while (currentRound < 3 && !gameOver) {
            System.out.print(currentWordSelctor + " select a word: ");
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
            System.out.println("Current round: " + currentRound);

            while (currentRound < 3) {


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
                                currentWordSelctor = playerOne;
                                System.out.print(playerOne + " Select a word: ");
                                chosenWord = keyboard.nextLine();
                                System.out.println("\n\n\n\n\n\n\n\n\n\n");
                                System.out.print("Word: ");
                            } else if (currentGuesser.equals(playerTwo)) {
                                playerTwoScore++;
                                System.out.println("Congrats " + playerTwo + " your score is " + playerTwoScore);
                                currentWordSelctor = playerTwo;
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
                    //printArray(playersWrongGuess);

                }

                if (wrongGuess > 6) {
                    System.out.println();
                    currentRound++;
                    if (currentGuesser.equals(playerOne)) {
                        System.out.println(playerOne + " you got hanged ;(");
                        currentWordSelctor = playerOne;
                        currentGuesser = playerTwo;
                        System.out.print(currentWordSelctor + " Select a word: ");
                        chosenWord = keyboard.nextLine();
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
                        System.out.print(" Word: ");
                    } else if (currentGuesser.equals(playerTwo)) {
                        System.out.println(playerTwo + " you got hanged ;(");
                        currentWordSelctor = playerTwo;
                        currentGuesser = playerOne;
                        System.out.print(currentWordSelctor + " Select a word: ");
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
            if (playerOneScore > playerTwoScore && currentRound >= 3) {
                System.out.println(playerOne + " is the winner! With a score of " + playerOneScore + " to " + playerTwoScore);
                System.out.println();
                System.out.println("Good game :)");
            }
            if (playerOneScore < playerTwoScore && currentRound >= 3) {
                System.out.println(playerTwo + " is the winner! With a score of " + playerTwoScore + " to " + playerOneScore);
                System.out.println();
                System.out.println("Good game :)");
            }
            if (playerOneScore == playerTwoScore && currentRound >= 3) {
                System.out.println("It was a draw ");
                System.out.println();
                System.out.println("Good game :)");
            }

        }
    }
}
// i noticed that if the user types in the q three times and the word is que it still says they got it right
// basically the user can type any ONE letter they find the .length of the chosenWord and it will say they got it right
// i also noticed that when you switch rounds and let the user pick a new word it prints off the guesses from the previous round
// make sure whatever variable is holding your chosenWord is reset when you select a new word
// i would suggest looking at your for loops that initialize the blank spaces and word at first and putting them into functions