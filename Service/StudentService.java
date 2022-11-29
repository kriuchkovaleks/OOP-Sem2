package Service;

import java.util.ArrayList;
import java.util.List;

import Data.Student;
import Data.User;

public class StudentService  {
    private final List<Student> users;

    public StudentService() {
        this.users = new ArrayList<>();
    }

    // @Override
    public void createUser(String firstName, String lastName, String patrynomic) {
        Long id = 0L;
        for (Student item : this.users) {
            if (item instanceof Student) {
                if (id < ((Student) item).getStudentID()) {
                    id = (((Student) item).getStudentID());
                }
            }
        }
        this.users.add(new Student(firstName, lastName, patrynomic, id++));
    }

    // @Override
    public List<Student> getAll() {

        return this.users;
    }

    // @Override
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
