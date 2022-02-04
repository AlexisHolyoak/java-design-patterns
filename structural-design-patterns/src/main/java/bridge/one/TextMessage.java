package bridge.one;

public class TextMessage implements Message {

    private MessageLogger logger;

    public TextMessage(MessageLogger logger) {
        this.logger = logger;
    }

    public void log(String message) {
        message = preProcess(message);
        logger.logMessage(message);
    }

    private String preProcess(String message) {
        return message;
    };
}
