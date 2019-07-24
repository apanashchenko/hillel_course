package trash.lec_13.Infrastructure.WebDrivers;

import trash.lec_13.Infrastructure.IWebDriver;

public class FirefoxWebDriver implements IWebDriver {
    @Override
    public void open(String url) {
        System.out.println("Open Firefox url" + url);
    }

    @Override
    public void click() {
        System.out.println("Firefox click on element");
    }

    @Override
    public void sendKey(String sendKey) {
        System.out.println("Firefox sendkey" + sendKey);
    }
}
