package lec_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainJsonConvertor {

    public static void main(String[] args) {
        User user1 = new User(1, "nick@gmail.com", "Nick Berton");
        User user2 = new User(2, "jack@gmail.com", "Jack Richards");
        User user3 = new User(3, "bob@gmail.com", "Bob Dilan");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        JsonConvertor jsonConvertorSingleUser = new JsonConvertor();
        System.out.println(jsonConvertorSingleUser.convertToJsonSingleUser(user1));

        JsonConvertor jsonConvertorMultipleUsers = new JsonConvertor();
        System.out.println(jsonConvertorMultipleUsers.convertToJsonMultipleUsers(users));
    }
}