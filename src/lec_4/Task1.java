package lec_4;

public class Task1 {

    public static void main(String[] args) {
        // 10 to 2
        int number = 6, b;
        String res = "";

        while (number != 0) {
            b = number % 2;
            res = b + res;
            number = number / 2;
        }
        System.out.println(res);

        // 2 to 10
        String number1 = "101101";
        String res = "";
        for(int i=0; i<number1.length(); i++)




        while (number != 0) {
            b = number % 2;
            res = b + res;
            number = number / 2;
        }
        System.out.println(res);


    }
}