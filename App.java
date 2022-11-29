import Controller.Controller;

public class App {
    public static void main(String[] args) {
        Controller conroller = new Controller();
        conroller.createStudent("Ivan", "Ivanov", "Ivanovich");
        conroller.createStudent("Ivan2", "Ivanov2", "Ivanovich2");
        conroller.createStudent("Petr", "Petrov", "Petrovich");
        conroller.createStudent("Sergey", "Sergeev", "Sergeevich");
        conroller.createStudent("Victor", "Victorov", "Victorovich");

        conroller.createTeacher("Aleks", "Aleksov", "Aleksovish");
        conroller.createTeacher("Dmitry", "Dmotreev", "Dmitreevich");

        conroller.getAllStudents();
        List<Student> students = 
        conroller.showStudyGroups();
        
    }    
}

