package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<String> courses = new ArrayList<>();
        ArrayList<String> courses2 = new ArrayList<>();
        courses.add("Java 1.0");
        courses2.add("Philosophy");

        persons.add(new Student("Nicolai",courses));
        persons.add(new Student("Helena", courses));
        persons.add(new Student("Luna", courses2));
        persons.add(new Teacher("Tess", courses));
        persons.add(new Teacher("Signe", courses2));

        for(Person p: persons){
            p.addCourse("Java 1.0");
            p.addCourse(courses2.get(0));
        }
        //for(Person p: persons){
          //  p.addCourse(courses2.get(0));
        //}
    }
}
