package lec_16;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class LoadUsers {
    abstract List<User> loadAll() throws IOException;

    List<User> userList = new ArrayList<>();

    public User findById(int id) throws UserNotFoundException {
        for (User user: userList) {
            if(user.getId() == id ){
                return user;
            }
        }
        throw new UserNotFoundException("id = " + id);
    }


    public User findByEmail(String email) throws UserNotFoundException {
        for (User user: userList) {
            if(user.getEmail() == email ){
                return user;
            }
        }
        throw new UserNotFoundException("email = " + email);
    }

    public List<User> findByAge(int age) throws UserNotFoundException {
        List<User> usersByAge = new ArrayList<>();
        for(User user: userList){
            if(user.getAge() == age){
                usersByAge.add(user);
            }
        }
        if(usersByAge.size()>0)
            return usersByAge;
        else throw new UserNotFoundException("age = " + age);
    }

    @Override
    public String toString() {
        return "LoadUsers{" +
                "userList=" + userList +
                '}';
    }
}
