package ir.ac.aut;

public class Admin extends User {
    private FileHelper file;

    public Admin(FileHelper file) {
        this.file = file;
    }

    public void showStudents() {
        showUsers(file.getStudents());
    }

    public void showMasters() {
        showUsers(file.getMasters());
    }

    public void addStudent() {
        while (true) {
            Student student = new Student();
            student.register(file);
            if (file.getStudents().contains(student)) {
                System.out.println("Student is already registered");
                continue;
            }
            file.addStudent(student);
            return;
        }
    }

    public void addMaster() {
        while (true) {
            Master master = new Master();
            master.register(file);
            if (file.getMasters().contains(master)) {
                System.out.println("Master is already registered");
                continue;
            }
            file.addMaster(master);
            return;
        }
    }

    public void addOrder() {
        while (true) {
            Order order = new Order().order();
            if (file.getOrders().contains(order)) {
                System.out.println("This time is already registered");
                continue;
            }
            file.addOrder(order);
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
        Order order = new Order(day, time);
        for (Order f : file.getOrders()) {
            if (f.equals(order)) {
                System.out.println(f);
                break;
            }
        }
        // no food is registered in this time
    }

}