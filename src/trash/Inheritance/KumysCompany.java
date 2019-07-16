package trash.Inheritance;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class KumysCompany extends Company {
    public KumysCompany(String name, String description, int employeeNumber, String location) {
        super(name, description, employeeNumber, location);
    }

    @Override
    public void startWorkTime(){
        System.out.println("Our all employees maybe can start work at 11 o'clock");
    }

    public void lunchTime() {
        System.out.println("Lunch time at 13 o'clock");
    }
}
