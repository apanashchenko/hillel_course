package trash.lec_16;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("user1");
        stringSet.add("user1");
        stringSet.add("user2");
        stringSet.add("user3");
        System.out.println(stringSet.toString());
        System.out.println(stringSet.size());


        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("user3");
        linkedHashSet.add("user4");
        linkedHashSet.add("user5");
        linkedHashSet.addAll(stringSet);

        Iterator<String> iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()
            );
        }


        System.out.println(linkedHashSet.toString());
    }
}
