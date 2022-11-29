package Controller;

import Service.*;
import View.*;
import Data.*;
import java.util.*;

public class Controller {

    private StudentService studentService = new StudentService();
    private StudentView studentView = new StudentView();
    private TeacherView teacherView = new TeacherView();
    private TeacherService teacherService = new TeacherService();
    private StudyGroupService studyGroupService = new StudyGroupService();
    private GroupView groupView = new GroupView();
    private Teacher teacher;

    public void createStudent(String firstName, String lastName, String patrynomic) {
        studentService.createUser(firstName, lastName, patrynomic);
        List<Student> students = studentService.getAll();
        // studentView.sendOnConsole(students);
        // return students;
    }

    public void getAllStudents() {
        studentService.getAll();
        for (Student student : studentService.getAll()) {
            Long id = ((Student) student).getStudentID();
            System.out.println("Student Name: " + student + ", Id: " + id);

        }
    }

    public void createTeacher(String firstName, String lastName, String patrynomic) {
        teacherService.createUser(firstName, lastName, patrynomic);
        List<Teacher> teachers = teacherService.getAll();
        teacherView.sendOnConsole(teachers);
    }

    public void showStudyGroups() {
        Teacher teacher;
        Student student;
        studyGroupService.completeStudyGroup(new Teacher(null, null, null, null), new ArrayList<>(
            Arrays.asList(new Student("Petr", "Zaverin", "Anton"),new Student("Ilon", "Mask", "Joe"), new Student("Joe", "Doe", "Djek"))));

    }

}