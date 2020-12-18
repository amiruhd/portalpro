package ir.ac.aut;

import java.io.Serializable;
import java.util.Objects;

public class Order implements Serializable {
    public String name;
    public Day day;
    public Time time;

    public Order() {

    }

    public Order(Day day, Time time) {
        this.day = day;
        this.time = time;
    }

    public Order order() {
        System.out.print("Name: ");
        this.name = Sc.nextLine();
        this.day = Day.whichDay();
        this.time = Time.when();
        return this;
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

    @Override
    public int hashCode() {
        return Objects.hash(day, time);
    }
    @Override
    public String toString(){
        return "Food: "+name+" Day: "+day+" Time: "+time;
    }
}
