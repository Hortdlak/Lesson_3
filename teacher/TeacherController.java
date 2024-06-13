package teacher;
import java.util.ArrayList;
import java.util.Optional;
import java.util.List;
import user.IUserController;

public class TeacherController implements IUserController<Teacher> {
    private TeacherGroup teachers = new TeacherGroup(new ArrayList<>());
    private TeacherView<Teacher> teacherView = new TeacherView<>();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxID = teachers.getTeacherList().stream()
                            .mapToInt(Teacher::getTeacherID)
                            .max()
                            .orElse(0) + 1;
        Teacher teacher = new Teacher(firstName, lastName, secondName, maxID);
        teachers.addTeacher(teacher);
    }

    public void nameСhange(int teacherID, String firstName, String secondName, String lastName) {
        Optional <Teacher> optionalTeacher = teachers.getTeacherList()
        .stream().filter(t -> t.getTeacherID() == teacherID).findFirst();
        if (optionalTeacher.isPresent()) {
            Teacher teacher = optionalTeacher.get();
            if (firstName != null) {
                teacher.setFirstName(firstName);
            }
            if (secondName != null) {
                teacher.setSecondName(secondName);
            }
            if (lastName != null) {
                teacher.setLastName(lastName);
            }
            
        }
       
    }

    public void create(String firstName, String secondName, String lastName, int teacherID) {
        Teacher teacher = new Teacher(firstName, lastName, secondName, teacherID);
        teachers.addTeacher(teacher);
    }

    public void edit(int teacherID, String firstName, String secondName, String lastName) {
        Optional<Teacher> optionalTeacher = teachers.getTeacherList().stream()
                                            .filter(t -> t.getTeacherID() == teacherID)
                                            .findFirst();
        if (optionalTeacher.isPresent()) {
            Teacher teacher = optionalTeacher.get();
            teacher.setFirstName(firstName);
            teacher.setSecondName(secondName);
            teacher.setLastName(lastName);
        } else {
            System.out.println("Учитель с ID " + teacherID + " не найден.");
        }
    }

    public void printTeachers() {
        teacherView.sendOnConsole(teachers.getTeacherList());
    }
    
    public void printSortedTeachers() {
        TeacherGroupService service = new TeacherGroupService(teachers);
        List<Teacher> sortedTeachers = service.getSortedTeacherGroupByFIO();
        teacherView.sendOnConsole(sortedTeachers);
    }
}
