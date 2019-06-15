package lec_3.task;

import java.lang.Math.*;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class CircleAndSquare {
    public static void main(String[] args) {
        double circleArea = 20;
        double squareArea = 5;

        double diameterOfCircle = 2*sqrt(circleArea/PI);
        double sideOfSquare = sqrt(squareArea);
        double diagonalOfSquare = sqrt(2*squareArea);

        if(diameterOfCircle<=sideOfSquare)
            System.out.println("The circle fits into the square");
        else{
            if(diameterOfCircle>=diagonalOfSquare)
                System.out.println("The square fits into the circle");
             else{
                System.out.println("The square doesn't fit into the circle");
                System.out.println("The circle doesn't fit into the square");
             }
        }

    }
}
