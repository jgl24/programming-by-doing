package RupaulsDragRaceSim;

public class Runway {
    public double getRunwayScore(Queen x) {
        return x.getRunwayStat() * x.getSewingStat();
    }


}
