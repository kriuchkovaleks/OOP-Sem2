package Service;
import java.util.ArrayList;
import java.util.List;

import Data.Student;
import Data.User;

public class UserService implements DataService {
    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patrynomic) {
        Long id = 0L;
        for (User item : this.users) {
            if (item instanceof Student) {
                if (id < ((Student) item).getStudentID()) {
                    id = (((Student) item).getStudentID());
                }
            }
        }
        this.users.add(new Student(firstName, lastName, patrynomic, id++));
    }

    @Override
    public List<User> getAll() {

        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User item : this.users) {
            if (item instanceof Student) {
                if (id.equals(((Student) item).getStudentID())) {
                    users.remove(item);
                }
            }
        }
    }
}
