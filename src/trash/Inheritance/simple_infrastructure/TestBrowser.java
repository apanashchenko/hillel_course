package trash.Inheritance.simple_infrastructure;

public class TestBrowser {
    public void create(){
        switch (ConfigurationManager.getInstance().getBrowser()){
            case "chrome":
                System.out.println("Test browser is chrome");
                break;
            case "firefox":
                System.out.println("Test browser is firefox");
                break;
            default:
                System.out.println("Test browser is undefined");
                break;
        }
    }
}

