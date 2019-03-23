import javax.naming.InvalidNameException;

public class LogAnalyzer {
    public boolean isValidLogFileName (String fileName) throws InvalidNameException{
        if (fileName == null){
            throw new InvalidNameException("File Name is empty!");
        } else {
            if (fileName.endsWith(".iml") || fileName.endsWith(".IML")) {
                return true;
            } else {
                return false;
            }
        }
    }
}
