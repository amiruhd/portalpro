package ir.ac.aut;

public abstract class User {
    private String userName;
    private String password;

    public void register(){
        this.userName = Sc.nextLine();
        setPassword();
    }

    public void setPassword() {
        do {
            String newPassword = Sc.getInstance().nextLine();
            if (newPassword.length() < 8) {
                System.out.println("Password should be longer than 8 character");
                continue;
            }
            this.password = newPassword;
            return;
        } while (true);
    }

    public void changeUserName() {
        this.userName = Sc.getInstance().nextLine();
    }

    @Override
    public String toString() {
        return "UserName: " + userName + "Part: " + getClass().getSimpleName();
    }
}
