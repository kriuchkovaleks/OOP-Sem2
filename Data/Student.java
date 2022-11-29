package Data;

public class Student extends User {
    private Long studentID;

    public Student(String firstName, String lastName, String patrynomic, Long studentID) {
        super(firstName, lastName, patrynomic);
        this.studentID = studentID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }
}
