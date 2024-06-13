package student;
import user.User;

public class Student extends User {
    private int studentID;
    
    public Student(String firstName, String lastName, String secondName, int studentID) {
        super(firstName, lastName, secondName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", " + super.toString() + "]";
    }
}