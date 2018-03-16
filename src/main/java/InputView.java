import java.util.Scanner;

public class InputView {

    public static int ladderHeight(Scanner scanner) {
        OutputView printer = new OutputView();
        printer.printAskHeight();
        int row = scanner.nextInt();
        return row;
    }

    public static String names(Scanner scanner) {

        OutputView printer = new OutputView();
        printer.printAskPlayer();

        String getNames = scanner.nextLine();
        return getNames;
    }
}
