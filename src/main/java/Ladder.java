import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String names = InputView.names(scan);
        Names playerNames = new Names(names);

        int column = playerNames.sizeForRealCol();
        int row = InputView.ladderHeight(scan);

        LadderSetting ladderSet = new LadderSetting(row, column);

        boolean[][] ladder = ladderSet.getLadder();

        OutputView printer = new OutputView();
        printer.printNames(playerNames.getSplitNames());
        printer.printLadder(ladder);
    }
}


