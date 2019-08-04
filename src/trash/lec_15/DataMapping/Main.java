package trash.lec_15.DataMapping;

import java.util.List;

public class Main {
    public static void main(String[] args){
        ILoadUsers loadUsers = new LoadUserFromCsv();
        List<User> userList = loadUsers.loadAll();

        System.out.println(userList.toString());

        try {
            User user1 = loadUsers.findUserById(3);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        try {
            User user2 = loadUsers.findUserById(5);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
