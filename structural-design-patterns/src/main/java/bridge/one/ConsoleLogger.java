package bridge.one;

public class ConsoleLogger implements MessageLogger {

    public void logMessage(String message) {
        System.out.println("Console: " + message);
    }
}