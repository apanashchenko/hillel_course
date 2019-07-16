package lec_6;

public class UpperLowerCaseChange {
    public static void main(String[] args) {
        String text = "given text";
        System.out.println(text.toUpperCase());

        // change each letter to UpperCase
        for (int i = 0; i < text.length(); i++) {
            if(text.substring(i,i+1).equals(" "))
                continue;
            else if (i == 0) {
                String modifiedText = text.substring(i, i + 1).toUpperCase() + text.substring(i + 1);
                System.out.println(modifiedText);
            } else
                System.out.println(text.substring(0, i) + text.substring(i, i + 1).toUpperCase() + text.substring(i + 1));
        }

        // change first letter of words to UpperCase
        for (int i = 0; i < text.length(); i++) {
            if(text.substring(i,i+1).equals(" "))
                continue;
            else if (i == 0) {
                String modifiedText = text.substring(i, i + 1).toUpperCase() + text.substring(i + 1);
                System.out.println(modifiedText);
            } else
                System.out.println(text.substring(0, i) + text.substring(i, i + 1).toUpperCase() + text.substring(i + 1));
        }
    }
}