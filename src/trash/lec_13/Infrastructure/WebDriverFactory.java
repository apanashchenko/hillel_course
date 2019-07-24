package trash.lec_13.Infrastructure;

import lec_8.ConfigurationManager;
import trash.lec_13.Infrastructure.WebDrivers.ChromeWebDriver;
import trash.lec_13.Infrastructure.WebDrivers.EdgeWebDriver;
import trash.lec_13.Infrastructure.WebDrivers.FirefoxWebDriver;
import trash.lec_13.Infrastructure.WebDrivers.SafariWebDriver;

public class WebDriverFactory implements IWebDriverFactory {
    @Override
    public IWebDriver create() {
        IWebDriver driver = null;
        String browserFromConfig = ConfigurationManager.getInstance().getBrowser();
        Browsers browser = Browsers.valueOf(browserFromConfig.toUpperCase());

        switch (browser){
            case CHROME:
                driver = new ChromeWebDriver();
                break;
            case FIREFOX:
            driver = new FirefoxWebDriver();
            break;
            case EDGE:
            driver = new EdgeWebDriver();
            break;
            case SAFARI:
            driver = new SafariWebDriver();
            break;
            default:
                System.out.println("Browser not supported");
        }
        return driver;
    }
}
