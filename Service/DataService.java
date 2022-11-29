package Service;

import java.util.*;

import Data.User;

public interface DataService {
    void createUser(String firstName, String lastName, String patrynomic);

    List<User> getAll();

    void deleteUser(Long id);

}
