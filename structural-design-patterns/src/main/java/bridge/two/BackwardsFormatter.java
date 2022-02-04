package bridge.two;

public class BackwardsFormatter implements Formatter {

    public String format(String key, String value) {
        return String.format("%s: %s", key, new StringBuilder(value).reverse().toString());
    }
}