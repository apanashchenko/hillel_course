package lec_16;

import lec_16.Factories.WebDriverFactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, UserNotFoundException {
        LoadUsers allUsersFromCsv = new LoadFromCsv();
        User userByIdFromCsv = allUsersFromCsv.findById(4);

        try {
            List<User> usersByAge = allUsersFromCsv.findByAge(5);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

        LoadUsers allUsersFromExcel = new LoadFromExcel();
        User userByIdFromExcel = allUsersFromExcel.findById(4);


        Url url = new Url.Builder().withProtocol("http").withHost("ithillel.com").withPath("search").build();

        IWebDriver driver = new WebDriverFactory().create();
        driver.open(url.toString());
        driver.click();
        driver.sendKey(userByIdFromCsv.getEmail());
        driver.sendKey(userByIdFromExcel.getEmail());
    }
}