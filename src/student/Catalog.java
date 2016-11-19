package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by sasha_koroleva on 18.11.2016.
 */
public class Catalog {

    private ArrayList<Student> studentsOfBSU;

    public void createList() {

        studentsOfBSU.add(new Student("Ляшевич", "Александр", 1));
        studentsOfBSU.add(new Student("Дрозд", "Алексей", 9));
        studentsOfBSU.add(new Student("Романчук", "Маргарита", 1));
        studentsOfBSU.add(new Student("Лазарев", "Дмитрий", 3));
        studentsOfBSU.add(new Student("Королёва", "Татьяна", 1));
        studentsOfBSU.add(new Student("Королёва", "Александра", 9));
        studentsOfBSU.add(new Student("Тимошенко", "Нина", 3));
        studentsOfBSU.add(new Student("Лазарев", "Владимир", 3));
        studentsOfBSU.add(new Student("Лазарев", "Алексей", 9));
        studentsOfBSU.add(new Student("Сидоренко", "Роман", 5));

    }

    public Catalog() {
        studentsOfBSU = new ArrayList<Student>(0);
        createList();
    }

    public ArrayList<Student> getStudentsOfBSU() {
        return studentsOfBSU;
    }

    public void sortOfList(){
    Collections.sort(studentsOfBSU, new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int result = o1.getNumberOfGroup() - o2.getNumberOfGroup();
            if (result != 0) return (int) (result / Math.abs(result));

            result = o1.getSurname().compareTo(o2.getSurname());
            if (result != 0) return (int) (result / Math.abs(result));

            result = o1.getName().compareTo(o2.getName());
            return (result != 0) ? (int) (result / Math.abs(result)) : 0;
        }
    });
    }
}




