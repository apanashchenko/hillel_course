package trash.Cake;

/**
 * Created by alpa on 2019-06-30
 */
public class ConsoleLogger implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("CONSOLE LOG: " + message);
    }
}
