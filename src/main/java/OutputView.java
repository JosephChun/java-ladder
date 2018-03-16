import java.util.ArrayList;
import java.util.Arrays;

public class OutputView {

    void printNames(ArrayList<String> names) {
        for (String name : names) {
            System.out.printf("%5s ", name);
        }
        System.out.println();
    }

    void printLadder(boolean[][] ladder) {
        for (int i = 0; i < ladder.length; i++) {
            drawLadder(ladder, i);
        }
    }

    void drawLadder(boolean[][] ladder, int i) {
        for (int j = 0; j < ladder[i].length; j++) {
            colLineController(ladder, i, j);
        }
        System.out.println();
    }

    void colLineController(boolean[][] ladder, int i, int j) {
        if (j % 2 == 0 && j != 1) {
            System.out.print(" | ");
        }

        if (j % 2 == 1) {
            isTrue(ladder[i][j]);
        }
    }

    void isTrue(boolean ladder) {
        if (ladder == true) {
            System.out.print("-----");
        } else {
            System.out.print("     ");
        }
    }

    void printAskPlayer() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    }

    void printAskHeight() {
        System.out.println("최대 사다리 높이는 몇 개 인가요?");
    }
}
