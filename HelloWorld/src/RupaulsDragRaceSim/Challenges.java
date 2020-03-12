package RupaulsDragRaceSim;

import java.util.Random;

public class Challenges {

    // have each challenge be an object of the Challenge class
    public double getSnatchGameScore(Queen ex) {
        return ex.getHumorStat() * ex.getActingStat() * ex.getPersonalityStat() / 3;
    }

    ;

    public void getSnatchGameWinner(Queen[] remainingQueens) {
        double highestScore = 0;
        String snatchGameWinner;


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getSnatchGameScore(remainingQueens[i]);
            if (queenScore > highestScore) {
                highestScore = queenScore;
            }
        }

        for (int i = 0; i < remainingQueens.length; i++) {
            if (highestScore == getSnatchGameScore(remainingQueens[i])) {
                snatchGameWinner = remainingQueens[i].getDragName();
                System.out.println("The Snatch Game winner(s): " + snatchGameWinner);
            }
        }
    }

    public double getBookBallScore(Queen ex) {
        return ex.getRunwayStat() * ex.getSewingStat() * ex.getUniqStat() / 3;
    }

    public void getBookBallWinner(Queen[] remainingQueens) {
        double highestScore = 0;
        String bookBallWinner;


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getBookBallScore(remainingQueens[i]);
            if (queenScore > highestScore) {
                highestScore = queenScore;
            }
        }

        for (int i = 0; i < remainingQueens.length; i++) {
            if (highestScore == getBookBallScore(remainingQueens[i])) {
                bookBallWinner = remainingQueens[i].getDragName();
                System.out.println("The Book Ball winner(s): " + bookBallWinner);
            }
        }
    }

    public double getPoliticalAdScore(Queen ex) {
        return ex.getHumorStat() * ex.getActingStat() * ex.getPersonalityStat() / 3;
    }

    ;

    public void getPoliticalAdWinner(Queen[] remainingQueens) {

        double highestScore = 0;
        String PoliticalAdWinner;


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getPoliticalAdScore(remainingQueens[i]);
            if (queenScore > highestScore) {
                highestScore = queenScore;
            }
        }

        for (int i = 0; i < remainingQueens.length; i++) {
            if (highestScore == getPoliticalAdScore(remainingQueens[i])) {
                PoliticalAdWinner = remainingQueens[i].getDragName();
                System.out.println("The Political Ad winner(s): " + PoliticalAdWinner);
            }
        }
    }

    public double getDragOnDimeScore(Queen ex) {
        return ex.getRunwayStat() * ex.getSewingStat() * ex.getPersonalityStat() / 3;
    }

    ;

    public void getDragOnDimeWinner(Queen[] remainingQueens) {

        double highestScore = 0;
        String dragOnDimeWinner;


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getDragOnDimeScore(remainingQueens[i]);
            if (queenScore > highestScore) {
                highestScore = queenScore;
            }
        }

        for (int i = 0; i < remainingQueens.length; i++) {
            if (highestScore == getDragOnDimeScore(remainingQueens[i])) {
                dragOnDimeWinner = remainingQueens[i].getDragName();
                System.out.println("The Drag on a Dime winner(s): " + dragOnDimeWinner);
            }
        }
    }

    public double getPoseBallScore(Queen ex) {
        return ex.getRunwayStat() * ex.getHumorStat() * ex.getDanceStat() / 3;
    }

    ;

    public void getPoseBallWinner(Queen[] remainingQueens) {

        double highestScore = 0;
        String poseBallWinner;


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getPoseBallScore(remainingQueens[i]);
            if (queenScore > highestScore) {
                highestScore = queenScore;
            }
        }

        for (int i = 0; i < remainingQueens.length; i++) {
            if (highestScore == getPoseBallScore(remainingQueens[i])) {
                poseBallWinner = remainingQueens[i].getDragName();
                System.out.println("The Pose Ball winner(s): " + poseBallWinner);
            }
        }
    }

    public double getDragDebateScore(Queen ex) {
        return ex.getHumorStat() * ex.getActingStat() * ex.getPersonalityStat() / 3;
    }

    public void getDragDebateWinner(Queen[] remainingQueens) {

        double highestScore = 0;
        String dragDebateWinner;


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getDragDebateScore(remainingQueens[i]);
            if (queenScore > highestScore) {
                highestScore = queenScore;
            }
        }

        for (int i = 0; i < remainingQueens.length; i++) {
            if (highestScore == getDragDebateScore(remainingQueens[i])) {
                dragDebateWinner = remainingQueens[i].getDragName();
                System.out.println("The Drag Dem Debate winner(s): " + dragDebateWinner);
            }
        }
    }

    public double getThatBitchScore(Queen ex) {
        return ex.getLipSyncStat() * ex.getPersonalityStat() * ex.getDanceStat() * ex.getUniqStat() / 4;
    }

    public void getThatBitchWinner(Queen[] remainingQueens) {

        double highestScore = 0;
        String thatBitchWinner;


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getThatBitchScore(remainingQueens[i]);
            if (queenScore > highestScore) {
                highestScore = queenScore;
            }
        }

        for (int i = 0; i < remainingQueens.length; i++) {
            if (highestScore == getThatBitchScore(remainingQueens[i])) {
                thatBitchWinner = remainingQueens[i].getDragName();
                System.out.println("The I'm That Bitch winner(s): " + thatBitchWinner);
            }
        }
    }

    public double getVicBallScore(Queen ex) {
        return ex.getUniqStat() * ex.getRunwayStat() * ex.getSewingStat() / 3;
    }

    public void getVicBallWinner(Queen[] remainingQueens) {

        double highestScore = 0;
        String vicBallWinner;


        for (int i = 0; i < remainingQueens.length; i++) {
            double queenScore = getVicBallScore(remainingQueens[i]);
            if (queenScore > highestScore) {
                highestScore = queenScore;
            }
        }

        for (int i = 0; i < remainingQueens.length; i++) {
            if (highestScore == getVicBallScore(remainingQueens[i])) {
                vicBallWinner = remainingQueens[i].getDragName();
                System.out.println("The Victorian Ball winner(s): " + vicBallWinner);
            }
        }
    }


    public Queen isEliminated(Queen bottom1, Queen bottom2) {
        Random random = new Random();
        int dice = random.nextInt(10);
        System.out.println("\n\n\n\n");
        if (dice % 2 == 0) {
            System.out.println(bottom1.getDragName() + " sashay away ");
            Queen eliminatedGirl = bottom1;
            return eliminatedGirl;
        } else {
            System.out.println(bottom2.getDragName() + " sashay away ");
            Queen eliminatedGirl = bottom2;
            return eliminatedGirl;
        }
    }

    public Queen[] queensRemaining(Queen[] queenBank) {
        Runway getQueensLeft = new Runway();
        Queen eliminatedQueen = getQueensLeft.runwayBottom2(queenBank);
        System.out.println("Queens left in competition: ");
        for (int i = 0; i < queenBank.length; i++) {
            if (queenBank[i].getDragName().equals(eliminatedQueen.getDragName())) {
                queenBank[i].setDragName("null");
            }
            System.out.println(queenBank[i].getDragName());
        }

        return queenBank;
    }

}
