package trash.lec_15.DataMapping;

import java.util.List;

public interface ILoadUsers {
    List<User> loadAll();
    User findUserById(int id) throws UserNotFoundException;
}
