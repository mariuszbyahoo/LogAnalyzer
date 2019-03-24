import sun.rmi.runtime.Log;

import javax.naming.InvalidNameException;

public class LogAnalyzer implements ILogAnalyzer{
    private ILogAnalyzer analyzer;

    public LogAnalyzer (ILogAnalyzer analyzer){
        this.analyzer = analyzer;
    }
    private boolean isValidAbstract(String fileName) throws InvalidNameException{
        return analyzer.isValid(fileName);
    }
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
