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
    public void isValidFileName_BadExtensionUpperCase_ReturnsFalse() {

        LogAnalyzer analyzer = new LogAnalyzer();

        boolean result = analyzer.isValidLogFileName("badExtensionFile.FOO");
        Assert.assertFalse(result);
    }
    @Test
    public void isValidFileName_GoodExtension_ReturnsTrue(){

        LogAnalyzer analyzer = new LogAnalyzer();

        boolean result = analyzer.isValidLogFileName("goodExtensionFile.iml");
        Assert.assertTrue(result);
    }
    @Test
    public void isValidFileName_GoodExtensionUpperCase_ReturnsTrue(){

        LogAnalyzer analyzer = new LogAnalyzer();

        boolean result = analyzer.isValidLogFileName("goodExtensionFile.IML".toLowerCase());
        Assert.assertTrue(result);
    }
    @Test
    public void isValidFileName_GoodExtensionFirstLetterUpperCase_ReturnsTrue(){

        LogAnalyzer analyzer = new LogAnalyzer();

        boolean result = analyzer.isValidLogFileName("goodExtensionFile.Iml".toLowerCase());
        Assert.assertTrue(result);
    }
}
