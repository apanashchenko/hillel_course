package lec_12;

public class Main {
    public static void main(String[] args) {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        IWebDriver  driver = webDriverFactory.create();

        driver.open("https://google.com/");
    }
}