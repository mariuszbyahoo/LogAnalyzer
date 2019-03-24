import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import javax.naming.InvalidNameException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LogAnalyzerValidFileExtensionTests {

    private String fileName;
    private boolean expectedResult;

    public LogAnalyzerValidFileExtensionTests(String fileName, boolean expectedResult){
        this.expectedResult = expectedResult;
        this.fileName = fileName;
        System.out.println("Constructor for string: " + fileName +
                " and expected result : " + expectedResult + " invoked ");
    }

    @Parameterized.Parameters
    public static Collection data(){
        System.out.println("data() method invoked ");
        Object [][] parameters = new Object[][] {
                { "badExtensionFile.foo", false },
                { "badExtensionFile.FOO", false },
                { "badExtensionFile.Foo", false },
                { "goodExtensionFile.iml", true },
                { "goodExtensionFile.IML", true }
        };
        return Arrays.asList(parameters);
    }

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass() invoked");
    }

    @After
    public void tearDown(){
        System.out.println("tearDown() invoked");
    }
    @Test
    public void isValidFileName_variousExtensions_checkThem() throws InvalidNameException {

        LogAnalyzer analyzer = LogAnalyzerFactory.getInstance();

        boolean result = analyzer.isValid(fileName);
        Assert.assertEquals(result, expectedResult);
    }
}
