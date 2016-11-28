import org.apache.log4j.Level;

import java.util.logging.ConsoleHandler;


public class Logger {

    org.apache.log4j.Logger logger;

    public Logger(String name) {
        logger = org.apache.log4j.Logger.getLogger(name);
        logger.setLevel(Level.INFO);
//        logger.addAppender(new ConsoleHandler());
    }

    @SuppressWarnings("rawtypes")
    public static Logger getLogger(Class cl) {
        return new Logger(cl.getName());
    }

    public void error(String msg, Throwable thrown) {
        logger.log(Level.FATAL, msg, thrown);
    }

    public void info(String msg) {
        logger.info(msg);
    }
}