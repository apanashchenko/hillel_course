package trash.Inheritance.simple_infrastructure;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String browser = "chrome";
    private String testEnv = "local";

    private ConfigurationManager(){};

    public static ConfigurationManager getInstance() {
        if (instance == null){
            return instance = new ConfigurationManager();

        }
        return  instance;
    }

    public String getBrowser() {
        return  System.getProperty("browser", browser);}

        public String getTestEnv() {
            return System.getProperty("env", testEnv);
        }
}
