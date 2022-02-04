package decorator.one;

public class LoggerDecorator implements Logger {

    protected Logger logger = null;

    public LoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    public void log(String dataLine) {
        logger.log(dataLine);
    }
}