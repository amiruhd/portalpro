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

    public void withDrawl() {
        while (true) {
            if (check()) {
                System.out.println("Wrong Id or Password");
                continue;
            }
            while (true) {
                System.out.print("How much you want get: ");
                double withDrawlAmount = Sc.getInstance().nextDouble();
                if (withDrawlAmount < balance) {
                    System.out.println("You don't have this amount of money in your account");
                    continue;
                }
                balance -= withDrawlAmount;
                return;
            }
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
