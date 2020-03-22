package RupaulsDragRaceSim;

import java.util.Random;

public class BookBall implements Challenge {


    @Override

    public void getWinner(Queen[] remainingQueens) {
        double highestScore = 0;
        String bookBallWinner;


        for (int i = 0; i < remainingQueens.length; i++) {
            if (!remainingQueens[i].getIsEliminated()) {
                double queenScore = getBookBallScore(remainingQueens[i]);
                if (queenScore > highestScore) {
                    highestScore = queenScore;
                }
            }
        }

        for (int i = 0; i < remainingQueens.length; i++) {
            if (highestScore == getBookBallScore(remainingQueens[i])) {
                bookBallWinner = remainingQueens[i].getDragName();
                System.out.println();
                System.out.println("The Book Ball winner(s): " + bookBallWinner);
                remainingQueens[i].setWins(+1);
                System.out.println();
            }
        }
    }

    @Override

    public Queen getEliminated(Queen[] remainingQueens) {

        double lowest = Double.MAX_VALUE;
        double secondLowest = Double.MAX_VALUE;
        Queen bottomQueen = null;
        Queen bottomQueen2 = null;


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getBookBallScore(remainingQueens[i]);
            if (!remainingQueens[i].getIsEliminated()) {

                if (queenScore < lowest) {
                    lowest = queenScore;
                    bottomQueen = remainingQueens[i];
                } else if (queenScore < secondLowest && secondLowest > lowest) {
                    secondLowest = queenScore;
                    bottomQueen2 = remainingQueens[i];
                }
            }
        }

        System.out.println();

        System.out.println(bottomQueen.getDragName() +
                " I'm sorry my dear, you are up for elimination");

        System.out.println();

        System.out.println(bottomQueen2.getDragName() +
                " I'm sorry my dear, you are up for elimination");

        Random random = new Random();
        int dice = random.nextInt(10);
        System.out.println("\n\n\n\n");
        if (dice % 2 == 0) {
            bottomQueen.setIsEliminated(true);
            System.out.println(bottomQueen.getDragName() + " sashay away ");
            Queen eliminatedGirl = bottomQueen;
            return eliminatedGirl;
        } else {
            bottomQueen2.setIsEliminated(true);
            System.out.println(bottomQueen2.getDragName() + " sashay away ");
            Queen eliminatedGirl = bottomQueen2;
            return eliminatedGirl;
        }
    }

    public double getBookBallScore(Queen ex) {
        return ex.getRunwayStat() * ex.getSewingStat() * ex.getUniqStat() / 3;
    }
}
