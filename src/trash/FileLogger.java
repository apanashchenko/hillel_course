package trash;

/**
 * Created by alpa on 2019-06-30
 */
public class FileLogger implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("LOG in file: " + message);
    }

}
