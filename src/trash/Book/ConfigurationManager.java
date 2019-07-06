package trash.Book;

public class ConfigurationManager {
    private String browser = "chrome";
   // private String browser = "dev";


    public String getBrowser(){
        return System.getProperty("browser", browser);
    }
}

//src -d