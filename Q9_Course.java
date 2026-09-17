class Course {
    String courseName;
    String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class Student {
    String name;
    Course enrolledCourse;

    Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    public String toString() {
        return "Student: " + name +
               " Course: " + enrolledCourse.courseName +
               " (" + enrolledCourse.duration + ")";
    }
}

class PremiumStudent extends Student {
    int discount;

    PremiumStudent(String name, Course course, int discount) {
        super(name, course);
        this.discount = discount;
    }

    public String toString() {
        return "Premium Student: " + name +
               " Course: " + enrolledCourse.courseName +
               " (" + enrolledCourse.duration + ")" +
               " Discount: " + discount + "%";
    }
}

public class Q9_Course {
    public static void main(String[] args) {

        Course java = new Course("Java", "3 months");

        Student s = new Student("Arjun", java);
        PremiumStudent p = new PremiumStudent("Meena", java, 20);

        System.out.println(s);
        System.out.println(p);
    }
}