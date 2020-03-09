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
    private double personalityStat;


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
        this.personalityStat = personality;
    }

    public String getDragName() {
        return dragName;
    }

    public void setDragName(String dragName) {
        this.dragName = dragName;
    }

    public double getDanceStat() {
        return danceStat;
    }

    public void setDanceStat(double danceStat) {
        this.danceStat = danceStat;
    }

    public double getActingStat() {
        return actingStat;
    }

    public void setActingStat(double actingStat) {
        this.actingStat = actingStat;
    }

    public double getSewingStat() {
        return sewingStat;
    }

    public void setSewingStat(double sewingStat) {
        this.sewingStat = sewingStat;
    }

    public double getRunwayStat() {
        return runwayStat;
    }

    public void setRunwayStat(double runwayStat) {
        this.runwayStat = runwayStat;
    }

    public void incrementRunway() {
        if (this.runwayStat < 10) {
            this.runwayStat++;
        }
    }


    public double getHumorStat() {
        return humorStat;
    }

    public void setHumorStat(double humorStat) {
        this.humorStat = humorStat;
    }

    public double getUniqStat() {
        return uniqStat;
    }

    public void setUniqStat(double uniqStat) {
        this.uniqStat = uniqStat;
    }

    public double getLipSyncStat() {
        return lipSyncStat;
    }

    public void setLipSyncStat(double lipSyncStat) {
        this.lipSyncStat = lipSyncStat;
    }

    public double getPersonalityStat() {
        return personalityStat;
    }

    public void setPersonalityStat(double personality) {
        this.personalityStat = personality;
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
