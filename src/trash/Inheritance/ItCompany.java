package trash.Inheritance;

public class ItCompany extends Company {
    public ItCompany(String name, String description, int employeeNumber, String location) {
        super(name, description, employeeNumber, location);
    }

    @Override
    public void companyIntro()
    {
        super.companyIntro();
        setWorkTime("10:00");
        startWorkTime();
    }}
