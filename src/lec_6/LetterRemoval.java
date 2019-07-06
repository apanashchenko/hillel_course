package lec_6;

public class LetterRemoval {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vel mi et risus varius molestie. Donec commodo ligula et viverra molestie. Fusce elit diam, vehicula sed leo id, iaculis porttitor turpis. Morbi ullamcorper venenatis nunc. Ut ultrices risus vitae quam fringilla, eget fermentum nisi ultricies. Suspendisse tincidunt purus eu enim cursus, quis mattis nunc pretium. Pellentesque a tellus eleifend, auctor metus et, scelerisque augue. Curabitur eros massa, dictum non finibus in, suscipit ac quam. Proin vehicula ex ut metus porttitor condimentum. Sed eu libero quis dolor tristique pulvinar ut id.";
        char symbol = 'a';
        String result = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                result += text.substring(index, i );
                index = i+1;
            }
        }
        System.out.println(result);
    }
}
