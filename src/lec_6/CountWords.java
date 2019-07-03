package lec_6;

public class CountWords {
    public static void main(String[] args) {
        char space = ' ';
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vel mi et risus varius molestie. Donec commodo ligula et viverra molestie. Fusce elit diam, vehicula sed leo id, iaculis porttitor turpis. Morbi ullamcorper venenatis nunc. Ut ultrices risus vitae quam fringilla, eget fermentum nisi ultricies. Suspendisse tincidunt purus eu enim cursus, quis mattis nunc pretium. Pellentesque a tellus eleifend, auctor metus et, scelerisque augue. Curabitur eros massa, dictum non finibus in, suscipit ac quam. Proin vehicula ex ut metus porttitor condimentum. Sed eu libero quis dolor tristique pulvinar ut id.";
        int count = 1;

        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) == space)
                count++;
        }

        System.out.println(count);
    }
}
