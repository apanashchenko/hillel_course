package lec_4;

public class Task9 {
    public static void main(String[] args) {
        int prevValue = 1, newValue=0;
        int limitValue = 55;
        int count = 0;
        int[] fibonacci;

        for (int i = 0; newValue< limitValue; i++) {
            if (i < 2) {
                newValue = prevValue;
                if(newValue>=limitValue){
                    break;}
                fibonacci[i] = newValue;
                count++;

            } else {
                newValue = fibonacci[i-1] + fibonacci[i-2];
                if(newValue>=limitValue){
                    break;}
                fibonacci[i] = newValue;
                count++;
            }
        }

        for (int i = 0; i < count; i++)
            System.out.print(fibonacci[i] + " ");
    }
}


