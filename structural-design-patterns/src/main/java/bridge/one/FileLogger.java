package bridge.one;

public class FileLogger implements MessageLogger {

    public void logMessage(String message) {
        System.out.println("File: " + message);
    }
}