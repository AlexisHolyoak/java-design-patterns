package decorator.one;

public class FileLogger implements Logger {

    public void log(String message) {
        System.out.println("File: " + message);
    }
}