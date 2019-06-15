package lec_2;
import java.lang.Math.*;

import static java.lang.Math.*;

public class MathTask {
    public static void main(String[] args) {
        double x = 1.5;

        double result9 =1.1* Math.pow(E, -x) + Math.abs(Math.cos(Math.sqrt(PI * x))) - (3.0 / 8.0);
        System.out.println("9) y= "+result9);

        double result10 = 1.0/3.0*sqrt(abs(sin(x)))*cbrt(pow(E, 0.12*x));
        System.out.println("10) y= "+result10);

        double result11 = 2.0*PI*x - abs(sin(sqrt(10.5*x)))/(cbrt(pow(x,2))+1.0/7.0);
        System.out.println("11) y= "+result11);

        double result12 = log(sqrt(abs(2.0-x))+1.2)/(2+pow(E, -x))+cbrt(2.0/x);
        System.out.println("12) y= "+result12);

        double result13 = pow(pow(E,-2.0+x), 1/5)/sqrt(pow(x, 2)+ pow(x,4)+log(abs(x-3.14)));
        System.out.println("13) y= "+result13);

        double result14 = (sqrt(pow(sin(x/2), 3))+ cbrt(pow(E,1.3*x)+pow(E, -1.3*x)))/abs(x+5.0/2.0);
        System.out.println("14) y= "+result14);

        double result15 = (abs(x*log(x)-4)*sqrt(x))/pow(pow(E, 4.0*x-1.0), 1.0/5.0);
        System.out.println("15) y= "+result15);

        double result16 = cbrt(pow(E,2*x)*sqrt(x) - ((x+1.0/3.0))/x)* abs(cos(2.5*x));
        System.out.println("16) y= "+result16);

        double result17 = pow(x, 3)/3.0 - pow(E,x)*log(abs(pow(1.3, 3)+pow(x,3))) + 4.0/3.0;
        System.out.println("17) y= "+result17);

        double result18 = abs(7.2 -10.0*x)/cbrt(pow(x,2)+pow(E,x))/tan((4.0*x/3)/sqrt(pow(1.1, 3)+pow(x,2)));
        System.out.println("18) y= "+result18);

        double result19 = acos(tan(5.0*x/PI))+ pow(x, 3.2)/28;
        System.out.println("19) y= "+result19);

        double result20 = (cbrt(pow(log(x), 2))+ tan(cos(PI*x)))*abs(log(x/10.5)+1/3);
        System.out.println("20) y= "+result20);

        double result21 = (pow(log10(x),1.0/4.0) + acos(x+3.0))/abs(x+ 2*pow(x,2));
        double a= pow(log10(x),1.0/4.0); // будет не Nan, если x>=1
        double b= acos(x+3.0); // будет не Nan, если -2>=x>= -4
        System.out.println("21) y= "+result21+ " - нет значения х, при котором уравнение имело б значение");

        double result22 = asin(log10(x)/(pow(x,2)+5.0*x+1))-pow(x, 3.2)/28;
        System.out.println("22) y= "+result22);

        double result23 = acos(tan(5.0*x/PI))+ pow(x, 5.7)/23;
        System.out.println("23) y= "+result23);

        double result24 = atan((abs(8.3-21.0*pow(x,2)-0.8*x))/cbrt(2.5+1/pow(x,2)));
        System.out.println("24) y= "+result24);

        double result25 = pow(log10(acos(abs(pow(x, 3.4)+ 2.5*pow(x, 1.2)-0.7)/cbrt(pow(E,2.5*x)))),1/4)+1.0;
        System.out.println("25) y= "+result25);

        double result26 = log(abs(sin(x)))+2*pow(E,2)+2.0*cos(abs(x)) +2.0;
        System.out.println("26) y= "+result26);
    }
}
