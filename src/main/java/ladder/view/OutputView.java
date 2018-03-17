package ladder.view;

import java.util.ArrayList;

public class OutputView {

    public void printNames(ArrayList<String> names) {
        for (String name : names) {
            System.out.printf("%5s ", name);
        }
        System.out.println();
    }

    public void printLadder(boolean[][] ladder) {
        for (int i = 0; i < ladder.length; i++) {
            drawLadder(ladder, i);
        }
    }

    public void drawLadder(boolean[][] ladder, int i) {
        for (int j = 0; j < ladder[i].length; j++) {
            colLineController(ladder, i, j);
        }
        System.out.println();
    }

    public void colLineController(boolean[][] ladder, int i, int j) {
        if (j % 2 == 0 && j != 1) {
            System.out.print(" | ");
        }

        if (j % 2 == 1) {
            System.out.print(isTrue(ladder[i][j]));
        }
    }

    public String isTrue(boolean ladder) {
        if (ladder) {
            return "-----";
        }
        return "     ";
    }
}
