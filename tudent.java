public class Student {
    private String name;
    private Course course; // Dependency on Course

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public Course getCourse() {
        return course;
    }

    public void printStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Duration: " + course.getDuration() + " months");
    }
}
