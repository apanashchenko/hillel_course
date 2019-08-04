package trash.lec_16;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainCollections {
    public static void main(String[] args) {
        List<String> list = Collections.singletonList("test");
        list.add("newElement");
        System.out.println(list);
    }
}
