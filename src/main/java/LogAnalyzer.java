import javax.naming.InvalidNameException;

public class LogAnalyzer {
    public boolean wasFileNameChecked = false;
    public boolean isValidLogFileName (String fileName) throws InvalidNameException{
        if (fileName == null){
            throw new InvalidNameException("File Name is empty!");
        } else {
            if (fileName.endsWith(".iml") || fileName.endsWith(".IML")) {
                wasFileNameChecked = true;
                return true;
            }
        }
        wasFileNameChecked = true;
        return false;
    }
}
