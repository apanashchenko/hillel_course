package trash.lec_17;

import java.util.HashMap;
import java.util.Map;

public class MainJsonConvertor {

    public static void main(String[] args) {
        Map<String, String > map = new HashMap<>();
        map.put("id", "1");
        map.put("name", "john");
        map.put("email", "john@kk.com");

        JsonConvertor jsonConvertor = new JsonConvertor();
        String json = jsonConvertor.convertToJson(map);

        System.out.println(json);
    }
}
