import javax.naming.InvalidNameException;

public class LogAnalyzer implements ILogAnalyzer{
    public boolean isValid (String fileName) throws InvalidNameException{
        if (fileName == null){
            throw new InvalidNameException("File Name is empty!");
        } else {
            if (fileName.endsWith(".iml")) {
                return true;
            }
        }
        return false;
    }
}
