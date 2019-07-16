package trash.Inheritance.simple_infrastructure;

public class TestBase {
    private TestLogger logger = new TestLogger();

    public void setUp() {
        logger.log("Default setUp");
        new TestEnv().create();
        new TestBrowser().create();

    }
    public void tearDown() {
        logger.log("Default tearDown");
    }
}
