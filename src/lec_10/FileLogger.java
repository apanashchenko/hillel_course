package lec_10;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger extends Loggers {
    public void log(String message) {
        Logger logger = Logger.getLogger("MyLog");

        FileHandler fh = null;
        try {
            fh = new FileHandler("C:/temp/test/MyLog.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fh);

        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        logger.info(message);
    }
}