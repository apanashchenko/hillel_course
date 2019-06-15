package lec_3.home_task_ru;

public class EquationSolution {
    public static void main(String[] args) {
        double a=-9, b=5.56;
        if(a==0)
            System.out.println("Division by zero is prohibited");
        else {
            double x=-b/a;
            System.out.println("x= "+x);
        }
    }
}
