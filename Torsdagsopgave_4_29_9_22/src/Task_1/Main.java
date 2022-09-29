package Task_1;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nicolai"));
        students.add(new Student("Signe"));
        students.add(new Student("Helena"));
        students.add(new Student("Luna"));

        for(Student s: students){
            s.addCourse(new Course("Programming"));
            s.addCourse(new Course("Marketing"));
            s.addCourse(new Course("Mathematics"));
        }

        System.out.println(students);
    }
}
