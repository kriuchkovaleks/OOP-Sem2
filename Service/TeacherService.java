package Service;

import java.util.ArrayList;
import java.util.List;

import Data.*;


public class TeacherService  {
    private final List<Teacher> users;

    public TeacherService() {
        this.users = new ArrayList<>();
    }


    // @Override
    public void createUser(String firstName, String lastName, String patrynomic) {
        Long id = 0L;
        for (User item : this.users) {
            if (item instanceof Teacher) {
                if (id < ((Teacher) item).getTeacherID()) {
                    id = (((Teacher) item).getTeacherID());
                }
            }
        }
        this.users.add(new Teacher(firstName, lastName, patrynomic, id++));
    }

    // @Override
    public List<Teacher> getAll() {

        return this.users;
    }

    // @Override
    public void deleteUser(Long id) {
        for (User item : this.users) {
            if (item instanceof Teacher) {
                if (id.equals(((Teacher) item).getTeacherID())) {
                    users.remove(item);
                }
            }
        }
    }
    
}
