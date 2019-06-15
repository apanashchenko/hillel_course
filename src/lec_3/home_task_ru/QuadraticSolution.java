package lec_3.home_task_ru;

import static java.lang.Math.*;

public class QuadraticSolution {
public static void main(String[]args) {
    //given a*pow(x,2)+b*x +c= 0
    double a=3, b=-18, c=27;

    if (a == 0) {
        double x=(-c/b);
        System.out.println("x= " + x);
    } else {
        double discriminant = pow(b,2) - 4*a*c;
        if (discriminant>0) {
            double x1 = (-b+sqrt(discriminant))/(2.0*a);
            double x2 = (-b-sqrt(discriminant))/(2.0*a);
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        } else if (discriminant==0) {
            double x = (-b/(2.0*a));
            System.out.println("x= " + x);
        } else
            System.out.println("Quadratic doesn't have solution");
    }
}
}


