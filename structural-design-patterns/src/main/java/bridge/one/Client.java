package bridge.one;

public class Client {

    public static void main(String[] args) {
        MessageLogger logger = new FileLogger();
        Message message = new EncryptedMessage(logger);
        message.log("Test Message");

        System.out.println("*************************************************************");
        logger = new ConsoleLogger();
        message = new TextMessage(logger);
        message.log("Test Message");
    }
}
