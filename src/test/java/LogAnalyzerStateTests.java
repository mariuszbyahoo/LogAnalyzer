import org.junit.Assert;
import org.junit.Test;

import javax.naming.InvalidNameException;

public class LogAnalyzerStateTests {
    @Test
    public void hadStateChanged_whenCalled_wasFileNameCheckedTurnsTrue() throws InvalidNameException {
        LogAnalyzer analyzer = new LogAnalyzer();

        Assert.assertFalse(analyzer.wasFileNameChecked);

        analyzer.isValid("bleble");

        Assert.assertTrue(analyzer.wasFileNameChecked);
    }
}
