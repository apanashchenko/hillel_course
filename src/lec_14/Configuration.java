package lec_14;

public class Configuration {
    private static Configuration ourInstance;
    private String browser = "chrome";
    private String env = "test";

    private Configuration() {
    }

    public String getBrowser() {
        return System.getProperty("browser", browser);
    }

    public String getEnv() {
        return System.getProperty("env", env);
    }

    public static Configuration getInstance() {
        if(ourInstance == null){
            ourInstance = new Configuration();
        }
        return ourInstance;
    }
}