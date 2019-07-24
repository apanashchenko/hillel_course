package trash.lec_13.Infrastructure.WebDrivers;

import trash.lec_13.Infrastructure.IWebDriver;

public class SafariWebDriver implements IWebDriver {
    @Override
    public void open(String url) {
        System.out.println("Open Safari url" + url);
    }

    @Override
    public void click() {
        System.out.println("Safari click on element");
    }

    @Override
    public void sendKey(String sendKey) {
        System.out.println("Safari sendkey" + sendKey);
    }
}
