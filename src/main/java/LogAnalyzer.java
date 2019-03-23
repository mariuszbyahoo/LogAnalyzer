public class LogAnalyzer {
    public boolean isValidLogFileName (String fileName){
        if (fileName.endsWith(".iml")){
            return false;
        } else {
            return true;
        }
    }
}
