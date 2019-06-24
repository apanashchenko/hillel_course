package lec_5;

import static java.lang.Math.*;

    public class QuadraticEquation{
        public static void main(String[]args) {
            //given a*pow(x,2)+b*x +c= 0
            double a = 3, b = -18, c = 5;

            quadraticEquationSolution(a, b, c);
        }

        public static void quadraticEquationSolution(double a, double b, double c){
            if (a == 0) {
                double x=(-c/b);
                System.out.println("x= " + x);
            } else {
                double discriminant = calculateDiscriminant(a, b, c);
                if (discriminant > 0) {
                    double x1 = (-b + sqrt(discriminant)) / (2.0 * a);
                    double x2 = (-b - sqrt(discriminant)) / (2.0 * a);
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                } else if (discriminant == 0) {
                    double x = (-b / (2.0 * a));
                    System.out.println("x = " + x);
                } else
                    System.out.println("Quadratic doesn't have solution");
            }
        }

        public static double calculateDiscriminant(double a, double b, double c){
            return pow(b, 2) - 4 * a * c;
        }
    }

