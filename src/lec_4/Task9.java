package lec_4;

public class Task9 {
    public static void main(String[] args) {
        int value0 = 1, value1 = 1, newValue = 0;
        int limitValue = 9;

        if (limitValue > 1) {
            System.out.print(value0 + " ");
            System.out.print(value1 + " ");
        }

        for (int i = 2; true; i++) {
            newValue = value0 + value1;
            value0 = value1;
            value1 = newValue;
            if (newValue >= limitValue) {
                break;
            }

            System.out.print(newValue + " ");
        }
    }
}








