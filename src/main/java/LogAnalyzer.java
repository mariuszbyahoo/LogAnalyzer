public class LogAnalyzer {
    public boolean isValidLogFileName (String fileName){
        if (fileName.endsWith(".iml")){
            return true;
        } else {
            return false;
        }
    }
}
