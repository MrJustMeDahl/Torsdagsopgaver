package Task3;

import java.util.ArrayList;

public class Teacher extends Person{

    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach){
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course){
        for(String s: canTeach){
            if(s.equalsIgnoreCase(course)){
                currentCourses.add(course);
                System.out.println(name + " is now teaching " + course + ".");
                return true;
            }
        }
        System.out.println(name + " can't teach this course.");
        return false;
    }

}
