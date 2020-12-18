package ir.ac.aut;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper implements Serializable, MyFile {
    public static final String ORDER_FILE = "orders";
    public static final String STUDENT_FILE = "students";
    public static final String MASTER_FILE = "masters";
    private final List<Order> orders;
    private final List<Student> students;
    private final List<Master> masters;

    public FileHelper() {
        orders = new ArrayList<>();
        masters = new ArrayList<>();
        students = new ArrayList<>();
    }

    @Override
    public void read() {
        readObjets(MASTER_FILE, masters);
        readObjets(STUDENT_FILE, students);
        readObjets(ORDER_FILE, orders);
    }

    @Override
    public void write() {
        writeObject(MASTER_FILE, masters);
        writeObject(STUDENT_FILE, students);
        writeObject(ORDER_FILE, orders);
    }

    public <T> void writeObject(String fileName, List<T> elements) {
        try (FileOutputStream file = new FileOutputStream(fileName);
             ObjectOutputStream obj = new ObjectOutputStream(file)) {
            for (T element : elements) {
                obj.writeObject(element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> void readObjets(String fileName, List<T> elements) {
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                try {
                    elements.add((T) obj.readObject());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (EOFException ignored) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public List<Master> getMasters() {
        return new ArrayList<>(masters);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addMaster(Master master) {
        this.masters.add(master);
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void removeMaster(Master master) {
        masters.remove(master);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public boolean sameUserName(String userName) {
        for (Student s : students) {
            if (userName.equals(s.getUserName())) {
                return true;
            }
        }
        for (Master m : masters) {
            if (userName.equals(m.getUserName())) {
                return true;
            }
        }
        return false;
    }
}
