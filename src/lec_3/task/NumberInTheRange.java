package lec_3.task;

public class NumberInTheRange {
    public static final int RANGE_MIN = -5;
    public static final int RANGE_MAX = 3;

    public static void main(String[] args) {
        int number = 2;
        if(number>RANGE_MIN && number<RANGE_MAX)
            System.out.println(number+" is in the range(-5;3)");
        else
            System.out.println(number+" isn't in the range(-5;3)");
    }
}
