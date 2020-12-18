package ir.ac.aut;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {
    private String name;
    private int numberOfUnit;
    private int capacity;
    private final List<Student> students;
    private final List<ClassTime> classTimes;


    public Course() {
        this.students = new ArrayList<>();
        this.classTimes = new ArrayList<>();
    }

    public void chooseTimes() {
        for (int i = 0; i < numberOfUnit; i++) {
            classTimes.add(ClassTime.getTime());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfUnit(int numberOfUnit) {
        this.numberOfUnit = numberOfUnit;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Course course = (Course) obj;
        return this.name.equals(course.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
