import java.util.Random;

public class LadderLine {

    private boolean[][] ladder;
    private int column;
    private int row;

    LadderLine(int row, int column) {
        ladder = new boolean[row][column];
        this.column = column;
        this.row = row;
    }

    /*
    00 01 02 03 04
    10 11 12 13 14
    20 21 22 23 24
    30 31 32 33 34
    40 41 42 43 44
    */

    boolean randomGenerator() {
        Random random = new Random();
        return random.nextBoolean();
    }
    void setRowLadder() {
        for (int i = 0; i < row; i++) {
            setColumnLadder(i, column);
        }
    }

    void setColumnLadder(int i, int column) {
        for (int j = 0; j < column; j++) {
            ladder[i][j] = randomGenerator();
        }
    }
}


