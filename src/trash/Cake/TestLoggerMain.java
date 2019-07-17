package trash.Cake;

/**
 * Created by alpa on 2019-06-30
 */
public class TestLoggerMain {

    public static void main(String[] args) {
        /*ConsoleLogger consoleLogger = new ConsoleLogger();
        consoleLogger.log("first message");

        FileLogger logger = new FileLogger();
        logger.log("first message");
        logger.logInFile("first message in file");

        fileLogger.log("bsdfsdfsdf");
        */


        ILogger fileLogger = new FileLogger();
        Cake cake2 = new Cake(fileLogger);
        cake2.setName("Chocolate cake 2");
        cake2.setWeight(5.0);
        cake2.setHeight(15.0);
        cake2.setWidth(35.0);
        cake2.setLayerNumber(3);

        cake2.print();
    }
}
