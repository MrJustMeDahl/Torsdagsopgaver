package Task_1;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name){
        this.name = name;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public String toString(){
        return "Student name is: " + name + ", the student takes the following courses: " + courses + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
