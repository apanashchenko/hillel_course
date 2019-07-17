package lec_11;

public class LoggerMain {
    public static void main(String[] args) {
        ILogger consoleLogger = new ConsoleLogger();
        ILogger fileLogger = new FileLogger();

        String info = "Useless info";

        consoleLogger.log(info);
        fileLogger.log(info);
    }
}