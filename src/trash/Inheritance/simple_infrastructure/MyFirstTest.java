package trash.Inheritance.simple_infrastructure;

public class MyFirstTest extends TestBase {
    private static TestLogger logger = new TestLogger();

    public static void main(String[] args) {
        MyFirstTest myFirstTest = new MyFirstTest();
        myFirstTest.setUp();

        logger.log("Login to site");
        logger.log("Check user is logged");
        logger.log("Logout from site");

        myFirstTest.tearDown();
    }
}
