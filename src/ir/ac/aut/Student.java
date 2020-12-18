package ir.ac.aut;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private FinancialAccount account;
    private FileHelper file;
    private List<Order> orders;

    public Student(FileHelper file) {
        this.file = file;
        orders = new ArrayList<>();
    }

    public Student() {

    }

    public void orderFood() {
        Order order = new Order();
        order.showOrders(file);
        order.getOrder(file);
        if (account.withDrawl(order.getPrice())) {
            orders.add(order);
        }
    }
    public void chooseClass(){
        
    }

}
