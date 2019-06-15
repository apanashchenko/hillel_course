package lec_3.home_task_ru;
import java.lang.Math.*;

import static java.lang.Math.abs;

public class ComparingMagnitude {
    public static void main(String[] args) {
        int x=9, y=-10;
        if(abs(x)>abs(y))
            System.out.println("Magnitude of \"x\" more than magnitude of \"y\"");
        else if(abs(y)>abs(x))
            System.out.println("Magnitude of \"y\" more than magnitude of \"x\"");
        else
            System.out.println("Magnitudes of two numbers are equal");
    }
}
