import javax.naming.InvalidNameException;

public class LogAnalyzer {
    public boolean isValidLogFileName (String fileName) throws InvalidNameException{
        boolean wasFileNameChecked = false;
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
