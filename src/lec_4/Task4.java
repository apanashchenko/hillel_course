package lec_4;

import static java.lang.Math.*;


public class Task4 {
    public static void main(String[] args) {
        int count =0;
        for (double i = 0; i <= 2.0*PI; i+= PI/18.0){
            //System.out.println(sin(2*PI));
           System.out.println(count+"|  "+sin(i));
            count+=10;
        }
    }
}
