package RupaulsDragRaceSim;

public class Runway {
    public double getRunwayScore(Queen ex) {
        return ex.getRunwayStat() * ex.getSewingStat();
    }

    public void runwayWinner(Queen a, Queen b, Queen c) {

        double queenOneScore = getRunwayScore(a);
        double queenTwoScore = getRunwayScore(b);
        double queenThreeScore = getRunwayScore(c);

        if (queenOneScore > queenTwoScore && queenOneScore > queenThreeScore) {
            System.out.println(a.getDragName());

        }
        if (queenOneScore < queenTwoScore && queenTwoScore > queenThreeScore) {
            System.out.println(b.getDragName());
        }
        if (queenOneScore < queenTwoScore && queenTwoScore < queenThreeScore) {
            System.out.println(c.getDragName());
        }
    }


}
