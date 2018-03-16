import java.util.ArrayList;
import java.util.Arrays;

public class Names {

    private ArrayList<String> splitNames;
    private int realColSize;

    Names(String names) {
        ArrayList<String> splitName = new ArrayList<>(Arrays.asList(names.split(",")));
        this.splitNames = splitName;
    }

    public ArrayList<String> getSplitNames() {
        return this.splitNames;
    }

    public int sizeForRealCol() {
        return this.realColSize = (this.splitNames.size() * 2 - 1);
    }

}
