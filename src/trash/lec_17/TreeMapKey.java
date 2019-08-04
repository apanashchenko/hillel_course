package trash.lec_17;

import trash.lec_16.Array;

import java.util.*;
import java.util.TreeMap;

public class TreeMapKey {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "bob");
        map.put(2, "mike");
        map.put(3, "john");
       // map.put(null, "john"); /// key not null
        map.put(4, null);

        Map<Integer, List<String>> mapWithList = new TreeMap<>();
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        mapWithList.put(1, list);

        mapWithList.put(1,list);

        List<String> list1 = mapWithList.get(1);
        list1.remove("b");

        System.out.println(list1);

    }

}
