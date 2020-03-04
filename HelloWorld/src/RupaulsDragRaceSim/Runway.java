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

    public String getWinnerName(Queen ex) {

        return ex.getDragName();
    }

//
//        double queenOneScore = getRunwayScore(a);
//        double queenTwoScore = getRunwayScore(b);
//        double queenThreeScore = getRunwayScore(c);
//
//        if (queenOneScore > queenTwoScore && queenOneScore > queenThreeScore) {
//            System.out.println(a.getDragName());
//
//        }
//        if (queenOneScore < queenTwoScore && queenTwoScore > queenThreeScore) {
//            System.out.println(b.getDragName());
//        }
//        if (queenOneScore < queenTwoScore && queenTwoScore < queenThreeScore) {
//            System.out.println(c.getDragName());
//        }
//    }


}
