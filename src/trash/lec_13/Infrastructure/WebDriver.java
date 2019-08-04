package trash.lec_13.Infrastructure;

public interface WebDriver {
    void open(String url);
    void  click();
    void sendKey(String sendKey);
}
