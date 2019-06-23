package lec_4;

public class Task2 {

    public static void main(String[] args) {
        // 10 to 16
        int number = 7098786, b;
        String res = "";

        while (number != 0) {
            b = number % 16;
            switch (b) {
                case 10:
                    res = "A" + res;
                    break;
                case 11:
                    res = "B" + res;
                    break;
                case 12:
                    res = "C" + res;
                    break;
                case 13:
                    res = "D" + res;
                    break;
                case 14:
                    res = "E" + res;
                    break;
                case 15:
                    res = "F" + res;
                    break;
                default:
                    res = b + res;


            }
            number = number / 16;
        }
        System.out.println(res);

        // 2 to 10
        String numberNew = "6BF09A";
        String[] array = numberNew.split("(?!^)");

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case "1":
                    result += Math.pow(16, array.length - 1 - i) * 1;
                    break;
                case "2":
                    result += Math.pow(16, array.length - 1 - i) * 2;
                    break;
                case "3":
                    result += Math.pow(16, array.length - 1 - i) * 3;
                    break;
                case "4":
                    result += Math.pow(16, array.length - 1 - i) * 4;
                    break;
                case "5":
                    result += Math.pow(16, array.length - 1 - i) * 5;
                    break;
                case "6":
                    result += Math.pow(16, array.length - 1 - i) * 6;
                    break;
                case "7":
                    result += Math.pow(16, array.length - 1 - i) * 7;
                    break;
                case "8":
                    result += Math.pow(16, array.length - 1 - i) * 8;
                    break;
                case "9":
                    result += Math.pow(16, array.length - 1 - i) * 9;
                    break;
                case "A":
                    result += Math.pow(16, array.length - 1 - i) * 10;
                    break;
                case "B":
                    result += Math.pow(16, array.length - 1 - i) * 11;
                    break;
                case "C":
                    result += Math.pow(16, array.length - 1 - i) * 12;
                    break;
                case "D":
                    result += Math.pow(16, array.length - 1 - i) * 13;
                    break;
                case "E":
                    result += Math.pow(16, array.length - 1 - i) * 14;
                    break;
                case "F":
                    result += Math.pow(16, array.length - 1 - i) * 15;
                    break;
            }
        }
        System.out.println(result);
    }
}
