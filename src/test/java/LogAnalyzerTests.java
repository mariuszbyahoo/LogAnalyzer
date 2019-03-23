import org.junit.Assert;
import org.junit.Test;

public class LogAnalyzerTests {

    @Test
    public void isValidFileName_BadExtension_ReturnsFalse(){
        LogAnalyzer analyzer = new LogAnalyzer();
        boolean result = analyzer.isValidLogFileName("badExtensionFile.foo");
        Assert.assertFalse(result);
    }
}