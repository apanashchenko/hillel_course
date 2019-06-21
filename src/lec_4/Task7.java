package lec_4;

public class Task7 {
    public static void main(String[] args) {
        char[] array = {'p', 'a', 'v', 'l', 'i', 'k'};

        // Выводим исходный массив
        System.out.print("Given array: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        // Инвертируем
        for (int i = 0; i < array.length; i++) {
            if (i > array.length - 1 - i) {
                break;
            }
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Выводим инвертированый массив
        System.out.print("Inverted: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}

