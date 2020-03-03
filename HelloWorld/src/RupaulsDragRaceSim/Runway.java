package RupaulsDragRaceSim;

public class Runway {

    private double sewingStat;
    private double runwayStat;


    public Runway(double runwayStat, double sewingStat) {
        this.runwayStat = runwayStat;
        this.sewingStat = sewingStat;
    }

    Queen runway = new Queen(runwayStat, sewingStat) {

    };

    public double getRunwayScore() {
        return runwayStat * sewingStat / 2;
    }


}
