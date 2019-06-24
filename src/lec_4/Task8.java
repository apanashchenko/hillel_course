package lec_4;

public class Task8 {
    public static void main(String[] args) {
        int column1Lenght = 10;
        int[] column1 = new int[column1Lenght];
        fillArrayValue(column1);

        int column2Lenght = 10;
        int[] column2 = new int[column2Lenght];
        fillArrayValue(column2);

        if(column1.length > column2.length)
            System.out.println("column1 more than column2");
        else if(column1.length < column2.length)
            System.out.println("column1 less than column2");
        else{
            System.out.println("| column_1 | column_2 |   sum   | ");
            for (int i = 0; i < column1.length; i++) {
                for (int j = 0; j < column2.length; j++) {
                    if(i==j)
                    System.out.println("|    "+ column1[i] + "    |    "+ column2[j]+ "    |    "+sumOfColumnValues(column1[i],column2[j])+ "    |");
                }
            }
        }
    }

    private static void fillArrayValue(int [] array){
        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random() * 100);
    }

    public static int sumOfColumnValues(int value1, int value2){
        return  value1 + value2;
    }
}