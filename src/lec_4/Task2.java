package lec_4;

public class Task2 {

    public static void main(String[] args) {
        // 10 to 2
        int number = 6, b;
        String res = "";

        while (number != 0) {
            b = number % 16;
            res = b + res;
            number = number / 2;
        }
        System.out.println(res);

        // 2 to 10
       /* String number = "101101";
        String rrr = number.split();
        String res = "";
*/
       /* while (number != 0) {
            b = number % 2;
            res = b + res;
            number = number / 2;
        }
        System.out.println(res);*/


    }
}