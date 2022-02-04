package decorator.one;

public class Client {

    public static void main(String[] args) {
        try {
            LoggerFactory factory = new LoggerFactory();
            Logger logger = factory.getLogger();
            HTMLLogger htmlLogger = new HTMLLogger(logger);
            htmlLogger.log("A Message to Log");
            EncryptLogger encryptLogger = new EncryptLogger(logger);
            encryptLogger.log("A Message to Log");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
