package trash.lec_13.Infrastructure.Config;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String browser = "chrome";
    private String env = "local";

    public ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (instance == null)
            return instance = new ConfigurationManager();
        else return instance;
    }

    public String getBrowser() {
        return System.getProperty("browser", browser);
    }

    public String getEnv() {
        return System.getProperty("env", env);
    }
}




