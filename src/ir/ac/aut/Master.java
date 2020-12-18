package ir.ac.aut;

import java.util.ArrayList;
import java.util.List;

public class Master extends User {
    private final List<Course> courses;

    public Master() {
        courses = new ArrayList<>();
    }

    public void addClass() {
        while (true) {
            Course course = new Course();
            course.setName(Sc.nextLine());
            course.setCapacity(Sc.nextBetWeenInt(1, 100));
            course.setNumberOfUnit(Sc.nextBetWeenInt(1, 3));
            course.chooseTimes();
            if (courses.contains(course)) {
                System.out.println("Course is already registered");
                continue;
            }
            courses.add(course);
            return;
        }
    }

    public void removeCourse() {
        Course course = getCourse();
        courses.remove(course);
        // if need remoe from student too
    }

    public void putGrade() {
        Course course = getCourse();
        Student student = getStudent(course);
//      ask for score
//        student.addScore();

    }

    public Course getCourse() {
        for (int i = 1; i <= courses.size(); i++) {
            System.out.println((i) + ": " + courses.get(i - 1));
        }
        int option = Sc.nextBetWeenInt(1, courses.size());
        return courses.get(option - 1);
    }
//    public void showCourses() {
//        for (int i = 1; i <= courses.size(); i++) {
//            System.out.println((i) + ": " + courses.get(i - 1));
//        }
//    }

    public Student getStudent(Course course) {
        for (int i = 1; i <= course.getStudents().size(); i++) {
            System.out.println((i) + ": " + course.getStudents().get(i - 1));
        }
        int option = Sc.nextBetWeenInt(1, course.getStudents().size());
        return course.getStudents().get(option - 1);
    }
}
