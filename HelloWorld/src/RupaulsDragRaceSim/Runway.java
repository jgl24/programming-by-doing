package RupaulsDragRaceSim;

public class Runway {


    public double getRunwayScore(Queen ex) {
        return ex.getRunwayStat() * ex.getSewingStat();
    }

    public Queen runwayWinner(Queen[] remainingQueens) {
        double highestScore = 0;
        String rWayWinner;
        Queen winner = null;
        System.out.println();


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getRunwayScore(remainingQueens[i]);
            if (queenScore > highestScore) {
                highestScore = queenScore;
            }
        }


        for (int i = 0; i < remainingQueens.length; i++) {
            if (highestScore == getRunwayScore(remainingQueens[i])) {
                remainingQueens[i].incrementRunway();
                winner = remainingQueens[i];
                rWayWinner = remainingQueens[i].getDragName();
                System.out.print(rWayWinner);
            }
        }
        System.out.println(", congratulations my dear, you are the winner of this weeks runway");

        return winner;
    }

    public Queen runwayBottom2(Queen[] remainingQueens) {
        double lowest = Double.MAX_VALUE;
        double secondLowest = Double.MAX_VALUE;
        Queen bottomQueen = null;
        Queen bottomQueen2 = null;


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getRunwayScore(remainingQueens[i]);
            if (queenScore < lowest) {
                lowest = queenScore;
                bottomQueen = remainingQueens[i];
            } else if (queenScore < secondLowest && secondLowest > lowest) {
                secondLowest = queenScore;
                bottomQueen2 = remainingQueens[i];
            }
        }

        System.out.println();

        System.out.println(bottomQueen.getDragName() + " You made me want to run away after seeing you're outfit. " +
                "I'm sorry my dear, you are up for elimination");

        System.out.println();

        System.out.println(bottomQueen2.getDragName() + " You made me want to run away after seeing you're outfit. " +
                "I'm sorry my dear, you are up for elimination");


        Challenges elimination = new Challenges();
        Queen eliminatedGirl = elimination.isEliminated(bottomQueen, bottomQueen2);
        return eliminatedGirl;
    }


}
