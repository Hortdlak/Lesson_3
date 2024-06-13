package student;
import java.util.List;

import user.IUserView;

public class StudentView<T extends Student> implements IUserView<T> {
    @Override
    public void sendOnConsole(List<T> users) {
        for (T user : users) {
            System.out.println(user);
        }
    }
}
