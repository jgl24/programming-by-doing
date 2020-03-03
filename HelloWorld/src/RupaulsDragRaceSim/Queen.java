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
    private double personality;


    public Queen(String dragName, double danceStat, double actingStat,
                 double sewingStat, double runwayStat, double humorStat, double uniqStat, double lipSyncStat, double personality) {
        this.dragName = dragName;
        this.danceStat = inRange(danceStat);
        this.actingStat = inRange(actingStat);
        this.sewingStat = inRange(sewingStat);
        this.runwayStat = inRange(runwayStat);
        this.humorStat = inRange(humorStat);
        this.uniqStat = inRange(uniqStat);
        this.lipSyncStat = inRange(lipSyncStat);
        this.personality = personality;
    }

    public Queen(double runwayStat, double sewingStat) {
        this.runwayStat = runwayStat;
        this.sewingStat = sewingStat;
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
