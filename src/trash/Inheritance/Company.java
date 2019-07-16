package trash.Inheritance;

import java.sql.SQLOutput;

public class Company {
    private String name;
    private  String description;
    private int employeeNumber;
    private String location;
    private String workTime = "7 o'clock";

    public Company(String name, String description, int employeeNumber, String location) {
        this.name = name;
        this.description = description;
        this.employeeNumber = employeeNumber;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getLocation() {
        return location;
    }

    public void  companyIntro() {
        System.out.println(name + " company has " + employeeNumber + " employees and located in " + location);
    };

    public void startWorkTime(){
        System.out.println("Our all employees start work at " + workTime);
    }
    protected void setWorkTime(String worktime){
        this.workTime = worktime;
    }

}
