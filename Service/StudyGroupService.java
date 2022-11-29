package Service;

import java.util.*;
import Data.*;

public class StudyGroupService {

    private List<StudyGroup> studyGroups;

    public StudyGroupService() {
        this.studyGroups = new ArrayList<>();

    }

    public void completeStudyGroup(Teacher teacher, List<Student> studentsList) {
        this.studyGroups.add(new StudyGroup(teacher, studentsList));
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

}