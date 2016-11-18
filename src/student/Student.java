package student;

/**
 * Created by sasha_koroleva on 18.11.2016.
 */
public class Student {

    private int numberOfGroup;
    private String name;
    private String surname;

    public Student(String surname, String name, int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
        this.name = name;
        this.surname = surname;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return numberOfGroup + " группа " + surname + " " + name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(this.name == ((Student)o).getName() && this.surname == ((Student)o).getSurname() && this.numberOfGroup == ((Student)o).getNumberOfGroup()){
            return true;
        }
        return false;

    }

}
