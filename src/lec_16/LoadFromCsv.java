package lec_16;

import lec_16.Logger.FileLogger;
import lec_16.Logger.ILogger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class LoadFromCsv extends LoadUsers {
    public LoadFromCsv() {
        loadAll();
    }

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
        FileLogger.addToLogList("Load users from csv");
        return userList;
    }


}

