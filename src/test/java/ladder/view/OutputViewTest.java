package ladder.view;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OutputViewTest {
    @Test
    public void drawLineTester() {
        OutputView tester = new OutputView();
        boolean drawtest = true;
        boolean drawtest2 = false;

        assertEquals("-----", tester.isTrue(drawtest));
        assertEquals("     ", tester.isTrue(drawtest2));
    }
}