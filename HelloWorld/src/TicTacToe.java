import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static boolean playing = true; // so I did this so I can use it in the checkWin() method, is that best practice though?
    private static char turn = 'X';

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        initBoard();
        displayBoard();

        // char turn = 'X';
        // boolean playing = true;
        int row;
        int col;
        boolean tie = checkTie();

        while (playing) {
            System.out.println("( ...a game is in progress)");
            // print current board here

            if (turn == 'X') {
                System.out.println("\'X\' choose your location (row, column): ");
                row = keyboard.nextInt();
                col = keyboard.nextInt();
                board[row][col] = turn; // this actually stores the value (location) the user inputs into the variable turn
                displayBoard(); // prints the board with updated user input
                checkWin(); // checks all winning scenarios
                tie = checkTie(); // if you call a function that returns something you ALWAYS need to store it in a variable
                if(tie == true){
                    playing = false;
                    break;
                }
                turn = 'O';

            } else if (turn == 'O') {
                System.out.println("\'O\' choose your location (row, column): ");
                row = keyboard.nextInt();
                col = keyboard.nextInt();
                board[row][col] = turn; // this actually stores the value (location) the user inputs into the variable turn
                displayBoard(); // prints the board with updated user input
                checkWin();
                tie = checkTie(); // if you call a function that returns something you ALWAYS need to store it in a variable
                if(tie == true){
                    playing = false;
                    break;
                }
                turn = 'X';

            }
        }
        System.out.println("Game over :p");
    }

    public static void initBoard() {
// fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    //check for error handling like IO Exception or whatever
    // don't let players go in the same spot


// write a methods that holds all possibilities to win and put them within the if statements :p

    public static void checkWin() {
        // down first column win
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            if (board[0][0] != ' ') {
                System.out.println(turn + " is the winner");
                playing = false;
            }
        } // down second column win
        if (board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            if (board[1][0] != ' ') {
                System.out.println(turn + " is the winner");
                playing = false;
            }
        } // down third column win
        if (board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            if (board[2][0] != ' ') {
                System.out.println(turn + " is the winner");
                playing = false;
            }
        } // across first row win
        if (board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
            if (board[0][0] != ' ') {
                System.out.println(turn + " is the winner");
                playing = false;
            }
        } // across second row win
        if (board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
            if (board[0][1] != ' ') {
                System.out.println(turn + " is the winner");
                playing = false;
            }
        }  // across third row win
        if (board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
            if (board[0][2] != ' ') {
                System.out.println(turn + " is the winner");
                playing = false;
            }
        } // diagonally top left to bottom right win
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] != ' ') {
                System.out.println(turn + " is the winner");
                playing = false;
            }
        } // diagonally bottom left to top right win
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] != ' ') {
                System.out.println(turn + " is the winner");
                playing = false;
            }
        }
    }

    public static boolean checkTie() {
        boolean isTie = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    isTie = false;
                }
            }
        }
        if(isTie == true){
            System.out.println("the game was a tie :p");
        }

        return isTie;
    }
}