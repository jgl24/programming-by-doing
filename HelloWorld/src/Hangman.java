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
        System.out.println("This is a two player game. ");

        System.out.print("Player one please enter your name: ");
        String playerOne = keyboard.nextLine();
        System.out.print("Player two please enter your name: ");
        String playerTwo = keyboard.nextLine();
        String currentWordSelector = playerOne;
        String currentGuesser = playerTwo;


        while (currentRound <= 3) {
            System.out.print(currentWordSelector + " select a word: ");
            String chosenWord = keyboard.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");


            char[] playersWrongGuess = new char[attempts];

            for (int i = 0; i < attempts; i++) {
                playersWrongGuess[i] = ' ';
            }


            String[] letters = generateNewWordArray(chosenWord);

            char[] randomWordArray = copiesCharacter(chosenWord);

            // this prints off the first set of all blank spaces
            System.out.println();
            System.out.println("Current round: " + currentRound);
            System.out.println("Player One current score: " + playerOneScore);
            System.out.println("Player Two current socre: " + playerTwoScore);
            System.out.println();
            System.out.print("Word: ");

            for (int i = 0; i < chosenWord.length(); i++) {
                System.out.print(letters[i]);
            }
            System.out.println();

            while (rightGuess != chosenWord.length() && wrongGuess < 7) {

                System.out.println();
                System.out.println("Guess: ");
                String guess = keyboard.nextLine();

                // String letterChecker = Character.toString(randomWordArray[i]);
                // converts each element in randomWordArray to a String instead of a char
                boolean found = letterCompare(guess, randomWordArray, letters);
                printAnArray(letters);


                if (found) {
                    rightGuess++;
                    if (rightGuess == chosenWord.length()) {
                        System.out.println();
                        System.out.println("You guessed the word :) ");
                        currentRound++;
                        if (currentGuesser == playerOne) {
                            playerOneScore++;
                            currentWordSelector = playerOne;
                            currentGuesser = playerTwo;
                        } else if (currentGuesser == playerTwo) {
                            playerTwoScore++;
                            currentWordSelector = playerTwo;
                            currentGuesser = playerOne;
                        }
                    }
                } else {
                    System.out.println();
                    System.out.print("Wrong guesses: ");
                    playersWrongGuess[wrongGuess] = guess.charAt(0); //charAt converts it to array of characters and gives
                    // you char at the index
                    wrongGuess++;
                    if (wrongGuess > 6) {
                        System.out.println();
                        currentRound++;
                        System.out.println(currentGuesser + " you got hanged ;(");
                        if (currentGuesser == playerOne) {
                            currentWordSelector = playerOne;
                            currentGuesser = playerTwo;
                        } else if (currentGuesser == playerTwo) {
                            currentWordSelector = playerTwo;
                            currentGuesser = playerOne;
                        }
                    }
                }
            }
            rightGuess = 0;

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

    public static boolean letterCompare(String newGuess, char[] newRandomWordArray, String[] rightGuesses) {
        boolean found = false;
        for (int i = 0; i < newRandomWordArray.length; i++) {

            String letterChecker = Character.toString(newRandomWordArray[i]);
            if (newGuess.equalsIgnoreCase(letterChecker)) {
                rightGuesses[i] = newGuess;
                found = true;
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
