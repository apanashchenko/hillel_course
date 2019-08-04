package trash.lec_17;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(3);

        map.put(1, "bob");
        map.put(2, "mike");
        map.put(3, "john");
        map.put(null, "john");
        map.put(4, null);

        System.out.println(map);

        for (String value: map.values())
              {
                  System.out.println("value: " + value);
        }

        for (Integer key: map.keySet())
        {
            System.out.println("key: " + key);
        }

        for (Integer key: map.keySet())
        {
            System.out.println("value: " + map.get(key));
        }

    }
}
