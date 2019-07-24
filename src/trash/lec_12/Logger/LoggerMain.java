package trash.lec_12.Logger;

public class LoggerMain {
    public static void main(String[] args) {
        ILogger consoleLogger = new ConsoleLogger();
        ILogger fileLogger = new FileLogger();

        String info = "Useless info";

        consoleLogger.log(info);
        fileLogger.log(info);
    }
}