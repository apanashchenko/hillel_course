package lec_6;

public class CountWordsOfEachLength {
    public static void main(String[] args) {
        char space = ' ';
        String text = "wew. ffefe efee. rr.";
        int wordWith1Leter = 0;
        int wordWith2Leter = 0;
        int wordWith3Leter = 0;
        int wordWith4Leter = 0;
        int wordWith5Leter = 0;
        int wordWith6Leter = 0;
        int wordWith7Leter = 0;
        int wordWith8Leter = 0;

        int index = 0, length;


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == space || i == (text.length() - 1)) {
                if (i == (text.length() - 1)) {
                    length = i + 1 - index;
                }
                else if(text.charAt(i - 1) == '.'){
                    length = i - index - 1;
                    index = i + 1;}
                else if(text.charAt(i) == '.' || i == (text.length() - 1)){
                    length = i - index;;
                    }
                else {
                    length = i - index;
                    index = i + 1;
                }

                switch (length) {
                    case 1:
                        wordWith1Leter++;
                        break;
                    case 2:
                        wordWith2Leter++;
                        break;
                    case 3:
                        wordWith3Leter++;
                        break;
                    case 4:
                        wordWith4Leter++;
                        break;
                    case 5:
                        wordWith5Leter++;
                        break;
                    case 6:
                        wordWith6Leter++;
                        break;
                    case 7:
                        wordWith7Leter++;
                        break;
                    case 8:
                        wordWith8Leter++;
                        break;
                }
            }

        }

        System.out.println("Words with 1 letter: " + wordWith1Leter);
        System.out.println("Words with 2 letters: " + wordWith2Leter);
        System.out.println("Words with 3 letters: " + wordWith3Leter);
        System.out.println("Words with 4 letters: " + wordWith4Leter);
        System.out.println("Words with 5 letters: " + wordWith5Leter);
        System.out.println("Words with 6 letters: " + wordWith6Leter);
        System.out.println("Words with 7 letters: " + wordWith7Leter);
        System.out.println("Words with 8 letters: " + wordWith8Leter);
    }
}

