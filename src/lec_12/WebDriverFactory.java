package lec_12;


import lec_12.WebDrivers.ChromeWebDriver;
import lec_12.WebDrivers.FirefoxWebDriver;
import lec_12.WebDrivers.SafariWebDriver;

public class WebDriverFactory implements IWebDriverFactory{
    public IWebDriver create(){
        String browserFromConfig = ConfigurationManager.getInstance().getBrowser();
        Browsers browser = Browsers.valueOf(browserFromConfig.toUpperCase());
        IWebDriver driver = null;
        switch(browser){
            case CHROME:
                driver = new ChromeWebDriver();
                break;
            case FIREFOX:
                driver = new FirefoxWebDriver();
                break;
            case SAFARI:
                driver = new SafariWebDriver();
                break;

                default:
                    System.out.println("Browser doesn't suppoted");
        }
        return driver;
    }
}
