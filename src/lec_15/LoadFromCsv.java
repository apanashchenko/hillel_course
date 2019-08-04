package lec_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadFromCsv  implements ILoadUsers{
    public LoadFromCsv() {
        loadAll();
    }

    List<User> userList = new ArrayList<>();

    @Override
    public List<User> loadAll() {
        Scanner scanner = null;

        {
            try {
                scanner = new Scanner(new File("/Users/stanton/IdeaProjects/Homework/src/users.csv"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        while(scanner.hasNext()){
            String row = scanner.next();
            String[] columns = row.split(",");
            int id = Integer.parseInt(columns[0]);
            String email = columns[1];
            String name = columns[2];
            int age = Integer.parseInt(columns[3]);
            User user = new User(id, email, name, age);
            userList.add(user);
         }
        return userList;
    }

    @Override
    public User findById(int id) throws UserNotFoundException {
        for (User user: userList) {
            if(user.getId() == id ){
                return user;
            }
        }
        throw new UserNotFoundException("id = " + id);
    }

    @Override
    public User findByEmail(String email) throws UserNotFoundException {
        for (User user: userList) {
            if(user.getEmail() == email ){
                return user;
            }
        }
        throw new UserNotFoundException("email = " + email);
    }

    @Override
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
        return "LoadFromCsv{" +
                "userList=" + userList +
                '}';
    }
}

