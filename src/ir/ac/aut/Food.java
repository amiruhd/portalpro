package ir.ac.aut;

import java.util.Objects;

public class Food {
    public String name;
    public Day day;
    public Time time;

    public Food() {

    }

    public Food(Day day, Time time) {
        this.day = day;
        this.time = time;
    }

    public Food order() {
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
        Food food = (Food) o;
        return day == food.day && time == food.time;
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
