package teacher;
import user.User;

public class Teacher extends User {
    private int teacherID;

    public Teacher(String firstName, String lastName, String secondName, int teacherID) {
        super(firstName, lastName, secondName);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setFirstName(String firstName) {
        super.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        super.secondName = secondName;
    }

    public void setLastName(String lastName) {
        super.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Teacher [teacherID=" + teacherID + ", " + super.toString() + "]";
    }
}
