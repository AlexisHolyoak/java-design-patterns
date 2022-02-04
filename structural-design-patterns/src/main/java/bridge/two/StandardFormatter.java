package bridge.two;

public class StandardFormatter implements Formatter {

    public String format(String key, String value) {
        return String.format("%s: %s", key, value);
    }
}