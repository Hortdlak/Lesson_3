package teacher;
import java.util.List;

import user.IUserView;

public class TeacherView <T extends Teacher> implements IUserView<T> {
    @Override
    public void sendOnConsole(List<T> users) {
        for (T user : users) {
            System.out.println(user);
        }
    }
}

