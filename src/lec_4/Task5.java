package lec_4;

public class Task5 {
    public static void main(String[] args) {
        // Создаем и заполняем массив
        int[] array = new int[10];
        fillArrayValue(array);

        // Выводим исходный массив
        System.out.print("Given array: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");
        System.out.println();

        // Сортируем
        for(int i = 0; i < array.length-1; i++){

            for(int j = 0 ; j < array.length-1 ; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
    }
        // Выводим отсортированый массив
        System.out.print("Sorted array: ");
        for (int z = 0; z < array.length; z++)
            System.out.print(array[z] + "  ");
    }

    private static void fillArrayValue(int [] array){
        for (int i = 0; i < array.length; i++)
         array[i] = (int)(Math.random() * 100);
    }
}
