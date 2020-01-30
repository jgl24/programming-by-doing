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
        String currentWordSelector = playerOne;
        String currentGuesser = playerTwo;


        while (currentRound < 3 && !gameOver) {
            System.out.print(currentWordSelector + " select a word: ");
            String chosenWord = keyboard.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.print("Word: ");


            char[] playersWrongGuess = new char[attempts];

            for (int i = 0; i < attempts; i++) {
                playersWrongGuess[i] = ' ';
            }

            String[] letters = generateNewWordArray(chosenWord);

            char[] randomWordArray = copiesCharacter(chosenWord);

            for (int i = 0; i < chosenWord.length(); i++) {
                System.out.print(letters[i]);
            } // this prints off the first set of all blank spaces
            System.out.println();
            System.out.println("Current round: " + currentRound);

            while (rightGuess != chosenWord.length() && wrongGuess < 7) {

                System.out.println();
                System.out.println("Guess: ");
                String guess = keyboard.nextLine();

                // String letterChecker = Character.toString(randomWordArray[i]);
                // converts each element in randomWordArray to a String instead of a char
                boolean found = letterCompare(guess, randomWordArray, letters);


                if (found) {
                    rightGuess++;
                    if (rightGuess == chosenWord.length()) {
                        System.out.println("You guessed the word :) ");
                        currentRound++;
                        playerOneScore++;
                        currentWordSelector = playerOne;
                        currentGuesser = playerTwo;
                    }
                } else {
                    System.out.print("Wrong guesses: ");
                    playersWrongGuess[wrongGuess] = guess.charAt(0); //charAt converts it to array of characters and gives
                    // you char at the index
                    wrongGuess++;
                    if (wrongGuess > 6) {
                        System.out.println();
                        currentRound++;
                        System.out.println(currentGuesser + " you got hanged ;(");
                        currentWordSelector = playerOne;
                        currentGuesser = playerTwo;
                    }
                }
            }
        }
    }


//                            if (currentGuesser.equals(playerOne)) {
//                                playerOneScore++;
//                                System.out.println("Congrats " + playerOne + " your score is " + playerOneScore);
//                                currentWordSelector = playerOne;
//                                System.out.print(playerOne + " select a word: ");
//                                chosenWord = keyboard.nextLine();
//
//
//
//
//
//                                System.out.println("\n\n\n\n\n\n\n\n\n\n");
//                                System.out.print("Word: ");
//
//                            } else if (currentGuesser.equals(playerTwo)) {
//                                playerTwoScore++;
//                                System.out.println("Congrats " + playerTwo + " your score is " + playerTwoScore);
//                                currentWordSelector = playerTwo;
//                                System.out.print(playerTwo + " select a word: ");
//                                chosenWord = keyboard.nextLine();
//                                System.out.println("\n\n\n\n\n\n\n\n\n\n");
//                                System.out.print("Word: ");
//
//
//                                String[] holdNewWord = generateNewWordArray(chosenWord);
//
//                                char [] copiesCharacter(chosenWord);
//                                String[] updatedWordArray = letterCompare(chosenWord, guess, letterChecker, randomWordArray, letters);
//
//
//                                System.out.print(holdNewWord);
//
//
//
//
//                            }
//
//
//                        }
//                    }
//                }
//
//
//                if (!found) {
//                    System.out.print("Wrong guesses: ");
//                    playersWrongGuess[wrongGuess] = guess.charAt(0); //charAt converts it to array of characters and gives
//                    // you char at the index
//                    wrongGuess++;
//                    //printArray(playersWrongGuess);
//
//                }
//
//                if (wrongGuess > 6) {
//                    System.out.println();
//                    currentRound++;
//                    if (currentGuesser.equals(playerOne)) {
//                        System.out.println(playerOne + " you got hanged ;(");
//                        currentWordSelector = playerOne;
//                        currentGuesser = playerTwo;
//                        System.out.print(currentWordSelector + " Select a word: ");
//                        chosenWord = keyboard.nextLine();
//
//
//                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
//                        System.out.print(" Word: ");
//
//                    } else if (currentGuesser.equals(playerTwo)) {
//                        System.out.println(playerTwo + " you got hanged ;(");
//                        currentWordSelector = playerTwo;
//                        currentGuesser = playerOne;
//                        System.out.print(currentWordSelector + " Select a word: ");
//                        chosenWord = keyboard.nextLine();
//
//
//                        System.out.print("Word: ");
//
//                    }
//
//                }
//
//                // sets blackspace equal to character if it finds it in the word
//                for (int i = 0; i < chosenWord.length(); i++) {
//                    System.out.print(letters[i]);
//                } // prints off initial array but with updated letters if guessed
//            }
//            if (playerOneScore > playerTwoScore && currentRound >= 3) {
//                System.out.println(playerOne + " is the winner! With a score of " + playerOneScore + " to " + playerTwoScore);
//                System.out.println();
//                System.out.println("Good game :)");
//            }
//            if (playerOneScore < playerTwoScore && currentRound >= 3) {
//                System.out.println(playerTwo + " is the winner! With a score of " + playerTwoScore + " to " + playerOneScore);
//                System.out.println();
//                System.out.println("Good game :)");
//            }
//            if (playerOneScore == playerTwoScore && currentRound >= 3) {
//                System.out.println("It was a draw ");
//                System.out.println();
//                System.out.println("Good game :)");
//            }
//
//        }
//    }


    public static String[] generateNewWordArray(String newWord) {
        String[] letters = new String[newWord.length()]; // set an array with all blank spaces that holds as many elements as there are letters in the word
        for (int i = 0; i < newWord.length(); i++) {
            letters[i] = " _ ";
            System.out.print(letters[i]);
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
}
