package factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();
        logger.log("A Message to Log");
    }
}
