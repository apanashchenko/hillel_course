package lec_16.Logger;

public class ConsoleLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}