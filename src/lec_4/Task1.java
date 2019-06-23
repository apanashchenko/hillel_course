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
        String binaryNumber = "110";
        String[] arrayOfBinaryNumber = binaryNumber.split("(?!^)");

        int result = 0;

        for(int i=0; i < arrayOfBinaryNumber.length; i++){
            if(arrayOfBinaryNumber[i].equals("1")){
                result+= Math.pow(2, arrayOfBinaryNumber.length-1-i);
            }
        }

       System.out.println(result);
    }
}