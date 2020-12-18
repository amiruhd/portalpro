package ir.ac.aut;

import java.io.Serializable;
import java.util.Objects;

public class Order implements Serializable {
    private String name;
    private Day day;
    private Time time;
    private double price;


    public Order() {
    }

    public Order(Day day, Time time) {
        this.day = day;
        this.time = time;
    }

    public Order order() {
        System.out.print("Name: ");
        this.name = Sc.nextLine();
        System.out.println("Price: ");
        this.price = Sc.getInstance().nextDouble();
        this.day = Day.whichDay();
        this.time = Time.when();
        return this;
    }

    public void showOrders(FileHelper file) {
        Day[] days = Day.values();
        Time[] times = Time.values();
        for (Day day : days) {
            for (Time time : times) {
                showOrder(day, time, file);
            }
        }
    }

    private void showOrder(Day day, Time time, FileHelper file) {
        Order order = new Order(day, time);
        for (int i = 1; i < file.getOrders().size(); i++) {
            if (file.getOrders().get(i - 1).equals(order)) {
                System.out.println(file.getOrders().get(i - 1));
                break;
            }
        }
    }

    public Order getOrder(FileHelper file) {
        int option = Sc.nextBetWeenInt(1, file.getOrders().size());
        return file.getOrders().get(option - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return day == order.day && time == order.time;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, time);
    }

    @Override
    public String toString() {
        return "Food: " + name + " Day: " + day + " Time: " + time;
    }
}
