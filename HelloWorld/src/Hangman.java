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

        System.out.print("Player one please enter your name: ");
        String playerOne = keyboard.nextLine();
        System.out.print("Player two please enter your name: ");
        String playerTwo = keyboard.nextLine();
        String currentWordSelector = playerOne;
        String currentGuesser = playerTwo;




        while (playerOneScore < 2 || playerTwoScore < 2) {
            System.out.print(currentWordSelector + " select a word: ");
            String chosenWord = keyboard.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            String[] alreadyGuessed = new String[chosenWord.length()];


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
            System.out.println("Player Two current score: " + playerTwoScore);
            System.out.println();
            System.out.print("Word: ");

            for (int i = 0; i < chosenWord.length(); i++) {
                System.out.print(letters[i]);
            }
            System.out.println();

            // have another variable or array that holds the rightGuess and compares to another variable

            while (rightGuess != chosenWord.length() && wrongGuess < 7) {

                System.out.println();
                System.out.println("Guess: ");
                String guess = keyboard.nextLine();

                // String letterChecker = Character.toString(randomWordArray[i]);
                // converts each element in randomWordArray to a String instead of a char
                int found = letterCompare(guess, randomWordArray, letters);
                printAnArray(letters);


                if (found > 0) {


                    // consider having an array that holds the right guesses instead of using an int
                    // loop through the array and assign already guessed char to a new variable called alreadyGuessed
                    // if(guess != alreadyGuessed){
                    //   rightGuess++;


                    // creates a String array where I can store the already guessed words

                    boolean matchesPreviousGuess = false;
                    for (int j = 0; j < chosenWord.length(); j++) {
                        if (guess.equals(alreadyGuessed[j])) {
                            matchesPreviousGuess = true;
                        }
                        // so right now this is setting all the elements in the array equal to the guessed char??
                    }
                    if (!matchesPreviousGuess) {
                        rightGuess += found;
                    }

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
