package decorator.one;

import java.io.IOException;

import common.Util;

public class LoggerFactory {

    public boolean isFileLoggingEnabled() throws Exception {
        try {
            String fileLoggingValue = Util.getPropertyValue("logger.properties", "FileLogging");
            return fileLoggingValue.equalsIgnoreCase("ON");
        } catch (IOException ex) {
            return false;
        }
    }

    // Factory Method
    public Logger getLogger() throws Exception {
        if (isFileLoggingEnabled()) {
            return new FileLogger();
        } else {
            return new ConsoleLogger();
        }
    }
}
