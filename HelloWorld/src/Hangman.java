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


        System.out.println("Welcome to Hangman!");
        System.out.println("\n");
        System.out.println("This is a two player game. ");

        System.out.print("threeOfAKind.Player One please enter your name: ");
        String playerOne = keyboard.nextLine();
        System.out.print("threeOfAKind.Player Two please enter your name: ");
        String playerTwo = keyboard.nextLine();
        String currentWordSelector = playerOne;
        String currentGuesser = playerTwo;
        boolean gameOver = false;


// bug found: try making the word a two letter word and guess the wrong letter at first


        while (!gameOver) {
            System.out.print(currentWordSelector + " select a word: ");
            String chosenWord = keyboard.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");

            String[] alreadyGuessed = new String[chosenWord.length()];
            // this string array will hold letters that have been guessed


            char[] playersWrongGuess = new char[attempts];

            for (int i = 0; i < attempts; i++) {
                playersWrongGuess[i] = ' ';
            }
            // fills an array of wrong guesses with blanks


            String[] letters = generateNewWordArray(chosenWord);
            //generates string array the length of the chosenWord

            char[] randomWordArray = copiesCharacter(chosenWord);
            // copies over each letter from chosen word in the for of a char and puts it into a char array


            System.out.println();
            System.out.println("Current round: " + currentRound);
            System.out.println("threeOfAKind.Player One current score: " + playerOneScore);
            System.out.println("threeOfAKind.Player Two current score: " + playerTwoScore);
            System.out.println();
            System.out.print("Word: ");

            for (int i = 0; i < chosenWord.length(); i++) {
                System.out.print(letters[i]);
            }
            // prints off first set of _ _ _ _ and any updates made to letters array
            System.out.println();


            while (rightGuess != chosenWord.length() && wrongGuess < 7) {

                System.out.println();
                System.out.println("Guess: ");
                String guess = keyboard.nextLine();


                int found = letterCompare(guess, randomWordArray, letters);
                printAnArray(letters);

                // this function converts EACH  char in the array of letters to a string and compares it to guess
                // since guess is a string
                // if the char (now a string) matches to guess then guess = letters[i]
                // and you found++ depending on the number of times said letter is found


                if (found > 0) {

                    boolean matchesPreviousGuess = false;

                    // this loop is checking if the letter that was guessed is inside the alreadyGuessed array
                    // note that the first time alreadyGuessed won't contain anything but it is updated
                    // at the top of the for loop

                    for (int j = 0; j < chosenWord.length(); j++) {
                        if (guess.equals(alreadyGuessed[j])) {
                            matchesPreviousGuess = true;
                        }
                    }

                    if (!matchesPreviousGuess) {
                        rightGuess += found;
                    }

                    // if the letter hasn't already been guessed then we increment rightGuess
                    // by the number of times that letter appears in the word

                    if (rightGuess == chosenWord.length()) {
                        System.out.println();
                        System.out.println("You guessed the word :) ");
                        currentRound++;
                        if (currentGuesser.equals(playerOne)) {
                            playerOneScore++;
                            currentWordSelector = playerOne;
                            currentGuesser = playerTwo;
                        } else if (currentGuesser.equals(playerTwo)) {
                            playerTwoScore++;
                            currentWordSelector = playerTwo;
                            currentGuesser = playerOne;
                        }
                    }

                    if (playerOneScore >= 2 || playerTwoScore >= 2) {
                        gameOver = true;
                    }

                } else {
                    System.out.println();
                    System.out.print("Wrong guesses: ");
                    playersWrongGuess[wrongGuess] = guess.charAt(0); //charAt converts it to array of characters and gives
                    // you char at the index

                    for (int i = 0; i < playersWrongGuess.length; i++) {
                        System.out.print(playersWrongGuess[i] + " ");
                    } // this will print off each wrong guess the player attempts

                    wrongGuess++;

                    if (wrongGuess > 6) {
                        rightGuess = 0;
                        System.out.println();
                        currentRound++;
                        System.out.println(currentGuesser + " you got hanged ;(");
                        if (currentGuesser.equals(playerOne)) {
                            currentWordSelector = playerOne;
                            currentGuesser = playerTwo;
                        } else if (currentGuesser.equals(playerTwo)) {
                            currentWordSelector = playerTwo;
                            currentGuesser = playerOne;
                        }
                    }
                }
                // this is holding the outdated copy of right guesses to use as a comparison
                // we need it to be within the while loops so it continues to update
                for (int i = 0; i < letters.length; i++) {
                    alreadyGuessed[i] = letters[i];
                }
            }
            rightGuess = 0;
            wrongGuess = 0;


        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        if (playerOneScore > playerTwoScore) {
            System.out.println("Good game, it looks like " + playerOne + " is the winner with a score of " + playerOneScore + " to " + playerTwoScore);
        } else {
            System.out.println("Good game, it looks like " + playerTwo + " is the winner with a score of " + playerTwoScore + " to " + playerOneScore);
        }

    }





    public static String[] generateNewWordArray(String newWord) {
        String[] letters = new String[newWord.length()]; // set an array with all blank spaces that holds as many elements as there are letters in the word
        for (int i = 0; i < newWord.length(); i++) {
            letters[i] = " _ ";
        }
        return letters;
    }

    public static char[] copiesCharacter(String newWord) {
        char[] randomWordArray = new char[newWord.length()];

        for (int i = 0; i < newWord.length(); i++) {
            randomWordArray[i] = newWord.charAt(i);
        }
        return randomWordArray;
    }

    public static int letterCompare(String rightGuess, char[] newRandomWordArray, String[] rightGuesses) {
        int found = 0;

        for (int i = 0; i < newRandomWordArray.length; i++) {

            String letterChecker = Character.toString(newRandomWordArray[i]);
            if (rightGuess.equalsIgnoreCase(letterChecker)) {
                rightGuesses[i] = rightGuess;
                found++;
            }
        }

        return found;
    }

    public static void printAnArray(String[] exArray) {
        for (int i = 0; i < exArray.length; i++) {
            System.out.print(exArray[i]);
        }

    }
}
