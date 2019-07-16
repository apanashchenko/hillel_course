package lec_10;

public class LoggerMain {
    public static void main(String[] args) {
        Loggers consoleLogger = new ConsoleLogger();
        Loggers fileLogger = new FileLogger();

        String info = "Useless info";

        consoleLogger.log(info);
        fileLogger.log(info);
    }
}