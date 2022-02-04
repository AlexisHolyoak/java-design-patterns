package decorator.one;

public class HTMLLogger extends LoggerDecorator {

    public HTMLLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String dataLine) {
        dataLine = makeHTML(dataLine);
        this.logger.log(dataLine);
    }

    public String makeHTML(String dataLine) {
        dataLine = "<HTML><BODY>" + "<b>" + dataLine + "</b>" + "</BODY></HTML>";
        return dataLine;
    }
}