package student;

import java.util.Comparator;

/**
 * Created by sasha_koroleva on 18.11.2016.
 */
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {


       int result = o1.getNumberOfGroup() - o2.getNumberOfGroup();
        if (result != 0) return (int) (result / Math.abs(result));

        result = o1.getSurname().compareTo(o2.getSurname());
        if (result != 0) return (int) (result / Math.abs(result));

        result = o1.getName().compareTo(o2.getName());
        return (result != 0) ? (int) (result / Math.abs(result)) : 0;
    }
}
