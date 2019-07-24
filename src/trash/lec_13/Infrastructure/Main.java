package trash.lec_13.Infrastructure;

import trash.lec_13.Infrastructure.WebDrivers.ChromeWebDriver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        WebDriverFactory webDriverFactory= new WebDriverFactory();
        IWebDriver driver = webDriverFactory.create();


        driver.open("https://google.com/");
        driver.sendKey("Selenium");
        driver.click();

        driver = webDriverFactory.create();


        driver.open("https://google.com/");
        driver.sendKey("Selenium");
        driver.click();

        User fullUser = new User("Fedor", "fedor@gmail.com", 35);
        System.out.println(fullUser);

        User emptyUser = new User();
        System.out.println(emptyUser);

        User userWithName = new User.Builder().withName("Petya").build();
        System.out.println(userWithName);

        User userWithNameAndAge = new User.Builder().withName("Petya").withAge(34).build();
        System.out.println(userWithNameAndAge);

        User user2 = new User();
        System.out.println(user2.toString());


    }
}
