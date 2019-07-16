package lec_6;

public class CodeValidation {
    public static void main(String[] args) {
        String code = "AX6BYU56UX6CV6BNT7NM 287430";
        String firstPart = "";
        String secondPart = "";
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == ' ') {
                firstPart = code.substring(0, i);
                secondPart = code.substring(i + 1);
            }
        }

        int digitCount = 0;
        int expectedDigitsCount = 6;
        int charUpperCaseCount = 0;
        int index = 0;
        char[] digitsArray = new char[expectedDigitsCount];

        for (int i = 0; i < firstPart.length(); i++) {
            if (Character.isDigit(firstPart.charAt(i))) {
                digitCount++;
                if (digitCount > expectedDigitsCount) {
                    System.out.println("Invalid code");
                    break;
                } else {
                    digitsArray[index] = firstPart.charAt(i);
                    index++;
                }
            } else if (Character.isUpperCase(firstPart.charAt(i))) {
                charUpperCaseCount++;
                continue;
            } else {
                System.out.println("Invalid code");
                break;
            }
        }

        int result = Integer.parseInt(String.valueOf(digitsArray[0]) + String.valueOf(digitsArray[1])) * Integer.parseInt(String.valueOf(digitsArray[2]) + String.valueOf(digitsArray[3])) * Integer.parseInt(String.valueOf(digitsArray[4]) + String.valueOf(digitsArray[5]));

        if (digitCount == expectedDigitsCount && charUpperCaseCount == firstPart.length() - expectedDigitsCount && result == Integer.valueOf(secondPart)) {
            System.out.println("Code is valid");
        }
    }
}
