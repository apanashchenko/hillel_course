package lec_10;

public class LoggerMain {
    public static void main(String[] args) {
        Loggers consoleLogger = new ConsoleLogger();
        Loggers fileLogger = new FileLogger();
        String info = "Useless info";
        Ball ball = new Ball(3, "green", consoleLogger, fileLogger);
        ball.consoleLogger.log(info);
        ball.fileLogger.log(info);
    }
}
