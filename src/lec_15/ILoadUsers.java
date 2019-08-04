package lec_15;

import java.util.List;

public interface ILoadUsers {
    List<User> loadAll();
    User findById(int id) throws UserNotFoundException;
    User findByEmail(String email) throws UserNotFoundException;
    List<User> findByAge(int age) throws UserNotFoundException;
}
