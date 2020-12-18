package ir.ac.aut;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private List<Food> orders;
    private List<Student> students;
    private List<Master> masters;

    /**
     * barname ghazaiy
     * change user and password
     * see students and masters
     * add student and master
     */
    public Admin() {
        orders = new ArrayList<>();
        masters = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addStudent() {
        while (true) {
            Student student = new Student();
            student.register();
            if (students.contains(student)) {
                System.out.println("Student is already registered");
                continue;
            }
            students.add(student);
        }
    }

    public void addMaster() {
        while (true) {
            Master master = new Master();
            master.register();
            if (masters.contains(master)) {
                System.out.println("Master is already registered");
                continue;
            }
            masters.add(master);
        }
    }

    public void addOrder() {
        while (true) {
            Food food = new Food().order();
            if (orders.contains(food)) {
                System.out.println("This time is already registered");
                continue;
            }
            orders.add(food);
            return;
        }
    }

    public void showOrders() {
        Day[] days = Day.values();
        Time[] times = Time.values();
        for (Day day : days) {
            for (Time time : times) {
                showOrder(day, time);
            }
        }
    }

    private void showOrder(Day day, Time time) {
        Food food = new Food(day, time);
        for (Food f : orders) {
            if (f.equals(food)) {
                System.out.println(f);
                break;
            }
        }
        // no food is registered in this time
    }
}