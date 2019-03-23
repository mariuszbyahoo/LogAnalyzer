import org.junit.Assert;
import org.junit.Test;

public class LogAnalyzerTests {

    @Test
    public void isValidFileName_BadExtension_ReturnsFalse(){
        LogAnalyzer analyzer = new LogAnalyzer();
        boolean result = analyzer.isValidLogFileName("badExtensionFile.foo");
        Assert.assertFalse(result);
    }
    @Test
    public void isValidFileName_GoodExtensionUpperCase_ReturnsTrue() {
        LogAnalyzer analyzer = new LogAnalyzer();
        boolean result = analyzer.isValidLogFileName("goodExtensionFile.IML");
        Assert.assertTrue(result);
    }
}
