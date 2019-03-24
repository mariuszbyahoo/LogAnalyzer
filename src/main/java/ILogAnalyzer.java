import javax.naming.InvalidNameException;

public interface ILogAnalyzer {
    boolean isValid(String fileName) throws InvalidNameException;
}
