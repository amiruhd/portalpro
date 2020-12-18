package ir.ac.aut;

public class FinancialAccount {
    private double balance;
    private long id;
    private long password;

    public void getBalance() {
        while (true) {
            if (check()) {
                System.out.println("Wrong Id or Password");
                continue;
            }
            System.out.println(balance);
            return;
        }
    }

    public void addBalance() {
        while (true) {
            if (check()) {
                System.out.println("Wrong Id or Password");
                continue;
            }
            System.out.print("How much you want to add: ");
            double addAmount = Sc.getInstance().nextDouble();
            balance += addAmount;
            return;
        }
    }

    public boolean withDrawl(double amount) {
        while (true) {
            if (check()) {
                System.out.println("Wrong Id or Password");
                continue;
            }
            if (amount > balance) {
                System.out.println("You don't have this amount of money in your account");
                return false;
            }
            balance -= amount;
            return true;
        }
    }

    public boolean check() {
        System.out.print("Id: ");
        long id = Sc.getInstance().nextLong();
        System.out.print("PassWord: ");
        long password = Sc.getInstance().nextLong();
        return (this.id != id && this.password != password);
    }
}
