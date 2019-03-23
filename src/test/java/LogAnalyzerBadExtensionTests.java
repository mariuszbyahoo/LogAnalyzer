import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LogAnalyzerBadExtensionTests {

    private String fileName;

    public LogAnalyzerBadExtensionTests (String fileName){
        this.fileName = fileName;
        System.out.println("Constructor for string: " + fileName + " invoked ");
    }

    @Parameterized.Parameters
    public static Collection data(){
        System.out.println("data() method invoked ");
        Object [] parameters = new Object[]{"badExtensionFile.foo",
                "badExtensionFile.FOO"};
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
    public void isValidFileName_BadExtension_ReturnsFalse(){

        LogAnalyzer analyzer = new LogAnalyzer();

        boolean result = analyzer.isValidLogFileName(fileName);
        Assert.assertFalse(result);
    }
}
