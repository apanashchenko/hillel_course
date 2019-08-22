package lec_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonConvertor {
    public String convertToJsonSingleUser(User user){

        Map<String, String > map = new HashMap<>();
        map.put("id", String.valueOf(user.getId()));
        map.put("name", user.getName());
        map.put("email", user.getEmail());

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

    public String convertToJsonMultipleUsers(List<User> users){
        String jsonPart;
        List<String> usersJsonList = new ArrayList<>();

        for(User user: users){
            jsonPart = convertToJsonSingleUser(user);
            usersJsonList.add(jsonPart);
        }

        String json = "[" + String.join(",", usersJsonList) + "]";
        return json;
    }
}