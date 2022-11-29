package Data;

public class Teacher extends User {
    private Long teacherID;

    public Teacher(String firstName, String lastName, String patrynomic, Long teacherID) {
        super(firstName, lastName, patrynomic);
        this.teacherID = teacherID;
    }

    public Long getTeacherID() {
        return teacherID;
    }
    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }   
    
}
