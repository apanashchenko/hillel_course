package trash.lec_16;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainList {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("cat");
        list.add("dog");
        list.add(2, "elephant");
      //  list.add(1, "bat");
     //   list.set(2, "root");

        System.out.println(list.toString());
        System.out.println(list.get(2));
        System.out.println(list.indexOf("cat"));

        ListIterator<String> stringListIterator = list.listIterator();

        List<String> subList = list.subList(1,3);
        System.out.println(subList);
        subList.add("rabbit");
        System.out.println(list.toString());


     }
}
