package lec_4;

public class Task3 {
    public static void main(String[] args) {
        int[] sequence={4, 18, -5, 0, 8, -17};
        int min=sequence[0];
        for (int i = 1; i <= sequence.length - 1; i++){
           if(sequence[i] < min)
               min = sequence[i];
    }
        System.out.println(min);
    }
}