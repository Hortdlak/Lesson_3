package teacher;
import java.util.ArrayList;
import java.util.List;

import user.UserComparator;

public class TeacherGroupService {
    private TeacherGroup teacherGroup;

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public TeacherGroup getTeacherGroup() {
        return teacherGroup;
    }

    public List<Teacher> getSortedTeacherGroupByFIO() {
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
        teacherList.sort(new UserComparator<>());
        return teacherList;
    }
}