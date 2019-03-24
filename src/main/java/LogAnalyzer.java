import javax.naming.InvalidNameException;

public class LogAnalyzer{
    private IExtensionManager analyzer;

    public LogAnalyzer (IExtensionManager analyzer){
        this.analyzer = analyzer;
    }

    public boolean isValid (String fileName) throws InvalidNameException{
        if (fileName == null){
            throw new InvalidNameException("File Name is empty!");
        } else {
            if (analyzer.isValid(".iml")) {
                return true;
            }
        }
        return false;
    }
}
