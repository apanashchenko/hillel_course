package lec_5;

public class HexDecBinConversions {
    public static void main(String[] args) {
        int decValue = 4576;
        String binaryNumber = "110";
        String hexVelue = "6BF09A";

        // 10 to 2
        System.out.println(convertDecToBin(decValue));

        // 10 to 16
        System.out.println(convertDecToHex(decValue));

        // 2 to 10
        System.out.println(convertBinToDec(binaryNumber));

        // 16 to 10
        System.out.println(convertHexToDec(hexVelue));
    }

    public static String convertDecToBin(int decValue) {
        int b;
        String result = "";

        while (decValue != 0) {
            b = decValue % 2;
            result = b + result;
            decValue = decValue / 2;
        }
        return result;
    }

    public static int convertBinToDec(String binValue) {

        String[] arrayOfBinaryNumber = binValue.split("(?!^)");

        int result = 0;

        for (int i = 0; i < arrayOfBinaryNumber.length; i++) {
            if (arrayOfBinaryNumber[i].equals("1")) {
                result += Math.pow(2, arrayOfBinaryNumber.length - 1 - i);
            }
        }
        return result;
    }

    public static String convertDecToHex(int decValue) {
        int b;
        String result = "";

        while (decValue != 0) {
            b = decValue % 16;
            switch (b) {
                case 10:
                    result = "A" + result;
                    break;
                case 11:
                    result = "B" + result;
                    break;
                case 12:
                    result = "C" + result;
                    break;
                case 13:
                    result = "D" + result;
                    break;
                case 14:
                    result = "E" + result;
                    break;
                case 15:
                    result = "F" + result;
                    break;
                default:
                    result = b + result;
            }
            decValue = decValue / 16;
        }
        return result;
    }

    public static int convertHexToDec(String binValue) {
        String[] array = binValue.split("(?!^)");

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
        return result;
    }
}
