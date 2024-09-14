package org.example;
import java.util.List;

@DevelopmentHistory
public class Faculty {
    private final String name;
    private final String designation;
    private final double salary;
    private List<Course> courses;

    @DevelopmentHistoryWithReviewer
    public Faculty(String name, String designation, double salary, List<Course> courses) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.courses = courses;
    }

    @DevelopmentHistoryWithReviewer
    public Faculty(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @DevelopmentHistoryWithReviewer
    public void teach(Course course) {
        courses.add(course);
        System.out.println("Teaching " + course.getName());
    }

    @DevelopmentHistoryWithReviewer
    public void research(String topic) {
        System.out.println("Researching on " + topic);
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public List<Course> getCourses() {
        return courses;
    }

}