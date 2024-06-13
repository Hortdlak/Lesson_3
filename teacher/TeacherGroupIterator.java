package teacher;
import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private List<Teacher> teacherList;
    private int counter;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.teacherList = teacherGroup.getTeacherList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teacherList.size();
    }

    @Override
    public Teacher next() {
        if(hasNext()){
            return teacherList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext())
            teacherList.remove(counter);
    }
}
