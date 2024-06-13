package user;
import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int result = o1.getSecondName().compareTo(o2.getSecondName());
        if (result == 0) {
            result = o1.getFirstName().compareTo(o2.getFirstName());
            if (result == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
            return result;
        }
        return result;
    }
}
