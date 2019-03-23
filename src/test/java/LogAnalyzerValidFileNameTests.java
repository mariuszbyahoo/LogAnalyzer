import org.junit.Test;

import javax.naming.InvalidNameException;

public class LogAnalyzerValidFileNameTests {

    @Test(expected = InvalidNameException.class)
    public void isFileNameNotNull() throws InvalidNameException{
        LogAnalyzer analyzer = LogAnalyzerFactory.getInstance();
        analyzer.isValidLogFileName(null);
    }
}
