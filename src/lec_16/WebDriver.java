package lec_16;

import lec_16.Logger.FileLogger;

public abstract class WebDriver {
    abstract public void open(String url);
    public void click(){ FileLogger.addToLogList("Click"); }
    public void sendKey(String key){FileLogger.addToLogList("Send key= " + key); }
}
