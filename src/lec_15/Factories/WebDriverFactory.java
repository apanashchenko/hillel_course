package lec_15.Factories;

import lec_15.Configuration;
import lec_15.Enums.Browsers;
import lec_15.IWebDriver;
import lec_15.WebDrivers.ChromeWebDriver;
import lec_15.WebDrivers.FirefoxWebDriver;
import lec_15.WebDrivers.SafariWebDriver;

public class WebDriverFactory {
    public IWebDriver create(){
        IWebDriver driver = null;

        Browsers browser = Browsers.valueOf(Configuration.getInstance().getBrowser().toUpperCase());

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
                try {
                    throw new Exception("Browser doesn't supported");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

        return driver;
    }
}