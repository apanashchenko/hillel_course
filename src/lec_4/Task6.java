package lec_4;

public class Task6 {
    public static void main(String[] args) {
        char[] array = {'p','o','t','o','p'};

        for(int i = 0; i < array.length; i++){
            if(array[i]!= array[array.length - 1 - i]){
                System.out.println("Word isn't palindrome");
            break;
            }
            else if(i > array.length - 1 - i){
                System.out.println("Word is palindrome");
                break;
            }

        }
    }
}
