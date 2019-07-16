package lec_10;

public class Ball {
    int size;
    String color;
    Loggers consoleLogger;
    Loggers fileLogger;

    public Ball(int size, String color, Loggers consoleLogger, Loggers fileLogger) {
        this.size = size;
        this.color = color;
        this.consoleLogger = consoleLogger;
        this.fileLogger = fileLogger;
    }
}
