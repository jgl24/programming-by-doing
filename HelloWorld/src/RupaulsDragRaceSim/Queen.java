package RupaulsDragRaceSim;

public class Queen {
    private String dragName;
    private double danceStat;
    private double actingStat;
    private double sewingStat;
    private double runwayStat;
    private double humorStat;
    private double uniqStat;
    private double lipSyncStat;


    public Queen(String dragName, double danceStat, double actingStat,
                 double sewingStat, double runwayStat, double humorStat, double uniqStat, double lipSyncStat) {
        this.dragName = dragName;
        this.danceStat = inRange(danceStat);
        this.actingStat = inRange(actingStat);
        this.sewingStat = inRange(sewingStat);
        this.runwayStat = inRange(runwayStat);
        this.humorStat = inRange(humorStat);
        this.uniqStat = inRange(uniqStat);
        this.lipSyncStat = inRange(lipSyncStat);
    }

    public double inRange(double score) {
        if (score > 0 && score <= 10) {
            return score;
        } else {
            throw new RuntimeException();
        }
        // throw exception here instead to have the user input score in range
    }
}
