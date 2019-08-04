package trash.lec_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonConvertor {
    public String convertToJson(Map<String, String> map){


        List<String> pairs = new ArrayList<>();
        for (String key: map.keySet()){
            String jsonKey = "\"" + key + "\"" + ":";
            String jsonValue = "\"" + map.get(key) + "\"" + ":";
            String pair = jsonKey + jsonValue;
            pairs.add(pair);
        }

        String joinPair = String.join(",", pairs);
        String json = "{" + joinPair + "}";
        return json;
    }
}
