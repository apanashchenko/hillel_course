package trash.lec_16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("cat", "dog", "cow");
        List<String> list2 = Arrays.asList("cat", "dog", "cow");

        list1.addAll(list2);

        Set<String> uniqueSet = new HashSet<>();
        uniqueSet.addAll(list1);
        uniqueSet.addAll(list2);
        System.out.println(uniqueSet);
    }
}
