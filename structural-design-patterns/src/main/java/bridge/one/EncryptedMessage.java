package bridge.one;

public class EncryptedMessage implements Message {
    private MessageLogger logger;

    public EncryptedMessage(MessageLogger logger) {
        this.logger = logger;
    }

    public void log(String message) {
        message = preProcess(message);
        logger.logMessage(message);
    }

    private String preProcess(String message) {
        message = message.substring(message.length() - 1) + message.substring(0, message.length() - 1 ) + " Encrypted message";
        return message;
    }
}
