package trash.lec_13.Infrastructure;

public interface IWebDriver {
    void open(String url);
    void  click();
    void sendKey(String sendKey);
}
