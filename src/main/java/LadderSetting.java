import java.util.Random;

public class LadderSetting {

    private boolean[][] ladder;
    private int column;
    private int row;

    LadderSetting(int row, int column) {
        ladder = new boolean[row][column];
        this.column = column;
        this.row = row;

        setRowLadder();
    }

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

    boolean[][] getLadder() {
        return ladder;
    }
}


