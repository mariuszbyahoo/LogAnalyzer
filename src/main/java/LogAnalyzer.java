public class LogAnalyzer {
    public boolean isValidLogFileName (String fileName){
        if (fileName.endsWith(".iml") || fileName.endsWith(".IML")){
            return true;
        } else {
            return false;
        }
    }
}
