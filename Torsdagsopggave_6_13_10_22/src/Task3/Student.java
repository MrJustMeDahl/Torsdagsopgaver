package Task3;

import java.util.ArrayList;

public class Student extends Person{

    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList passedCourses){
        super(name);
        this.passedCourses = passedCourses;
    }

    @Override
    public boolean addCourse(String course){
        for(String s: passedCourses){
            if(s.equalsIgnoreCase(course)){
                //Student has already passed this course.
                System.out.println(name + " has already passed " + course +".");
                return false;
            }
        }
        currentCourses.add(course);
        System.out.println(name + " has been added to " + course + ".");
        return true;
    }
}
