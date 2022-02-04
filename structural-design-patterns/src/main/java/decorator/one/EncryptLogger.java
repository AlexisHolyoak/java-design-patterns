package decorator.one;

public class EncryptLogger extends LoggerDecorator {

    public EncryptLogger(Logger logger) {
        super(logger);
    }

    public void log(String dataLine) {
        dataLine = encrypt(dataLine);
        logger.log(dataLine);
    }

    public String encrypt(String dataLine) {
        dataLine = dataLine.substring(dataLine.length() - 1) + dataLine.substring(0, dataLine.length() - 1);
        return dataLine;
    }
}