public class OutputView {

    void printLadder(boolean[][] ladder) {
        for (int i = 0; i < ladder.length; i++) {
            colLadder(ladder, i);
        }
    }

    void colLadder(boolean[][] ladder, int i) {
        for (int j = 0; j < ladder[i].length; j++) {
            System.out.print(" | ");
            isTrue(ladder[i][j]);
        }
        System.out.println(" | ");
    }

    void isTrue(boolean ladder) {
        if (ladder) {
            System.out.print("-");
        } else {
            System.out.print(" ");
        }
    }

}
