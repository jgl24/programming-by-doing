package RupaulsDragRaceSim;

public class Runway {


    public double getRunwayScore(Queen ex) {
        return ex.getRunwayStat() * ex.getSewingStat();
    }

    public void runwayWinner(Queen[] remainingQueens) {
        double highestScore = 0;
        String rWayWinner;


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getRunwayScore(remainingQueens[i]);
            if (queenScore > highestScore) {
                highestScore = queenScore;
            }
        }

        for (int i = 0; i < remainingQueens.length; i++) {
            if (highestScore == getRunwayScore(remainingQueens[i])) {
                rWayWinner = remainingQueens[i].getDragName();
                System.out.println(rWayWinner);
            }
        }
    }

    public void runwayBottom2(Queen[] remainingQueens) {
        double currentLowest = Double.MAX_VALUE;
        double secondLowest;
        Queen bottomQueen = null;
        Queen bottomQueen2 = null;
        String bottom2;

        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getRunwayScore(remainingQueens[i]);
            if (queenScore < currentLowest) {
                currentLowest = queenScore;
                bottomQueen = remainingQueens[i];

            }
        }

        for (int i = 0; i < remainingQueens.length; i++) {
            if (currentLowest == getRunwayScore(remainingQueens[i])) {
                bottom2 = remainingQueens[i].getDragName();
                System.out.println(bottom2 + " You made me want to run away after seeing you're runway. " +
                        "I'm sorry my dear, you are up for elimination");
            }
        }
    }

}
