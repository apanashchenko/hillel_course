package lec_3.task;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        int sideA = 3;
        int sideB = 7;
        int sideC = 3;

        if (sideA==sideB || sideA==sideC || sideB==sideC)
            System.out.println("Triangle is isosceles");
        else
            System.out.println("Triangle isn't isosceles");
    }
}
