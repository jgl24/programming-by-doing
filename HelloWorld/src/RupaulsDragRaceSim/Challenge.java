package RupaulsDragRaceSim;

public interface Challenge {
    Queen getEliminated(Queen[] remainingQueens);

    void getWinner(Queen[] remainingQueens);
    // Queen isEliminated(Queen bottom1, Queen bottom2);

}
