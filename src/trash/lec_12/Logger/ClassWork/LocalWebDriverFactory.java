package trash.lec_12.Logger.ClassWork;

public class LocalWebDriverFactory implements IWebDriverFactory {
    @Override
    public String create() {
        return "Local WebDriver";
    }
}
