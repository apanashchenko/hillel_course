package lec_4;

public class Task1 {

    public static void main(String[] args) {
        int number = 8, b;

        while(number !=0 ) {
            b = number%2;
            System.out.print(b);
            number = number/2;
        }
    }
}