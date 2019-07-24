package trash.lec_12.Logger;

public class ConsoleLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println(CurrentDateTime.getCurrentDateTime() + "   " + ThreadInfo.getThreadName() + "   " + message);
    }
}