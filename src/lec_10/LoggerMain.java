package lec_10;

public class LoggerMain {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();

        String info = "Useless info";

        consoleLogger.log(info);
        fileLogger.log(info);
    }
}