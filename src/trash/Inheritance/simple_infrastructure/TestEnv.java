package trash.Inheritance.simple_infrastructure;

public class TestEnv {
    public void create(){
        switch (ConfigurationManager.getInstance().getTestEnv()){
            case "local":
                System.out.println("Test env is local");
                break;
            case "dev":
                System.out.println("Test env is dev");
                break;
            default:
                System.err.println("Test env is not set");
                break;
        }
    }
}
