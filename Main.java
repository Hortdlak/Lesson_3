import teacher.TeacherController;
public class Main {
    public static void main(String[] args) {
       TeacherController controller = new TeacherController();
       controller.create("Ivan", "Ivanov", "Ivanovich");
       controller.create("Petr", "Petrov", "Petrovich");
       controller.nameСhange(1, "Egor", null, null);
       controller.printTeachers();
    }
}