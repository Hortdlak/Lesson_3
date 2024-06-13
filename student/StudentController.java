package student;
import java.util.ArrayList;

import user.IUserController;

public class StudentController implements IUserController<Student> {
    private StudentGroup students = new StudentGroup(new ArrayList<>());
    private StudentView<Student> studentView = new StudentView<>();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxID = students.getStudentList().stream()
                            .mapToInt(Student::getStudentID)
                            .max()
                            .orElse(0) + 1;
        Student student = new Student(firstName, lastName, secondName, maxID);
        students.addStudent(student);
    }

    public void printStudents() {
        studentView.sendOnConsole(students.getStudentList());
    }
}
