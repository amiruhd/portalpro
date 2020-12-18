package ir.ac.aut;

import java.io.Serializable;
import java.util.List;

public abstract class User implements Serializable {
    private String userName;
    private String password;

    public void register(FileHelper fileHelper) {
        while (true) {
            System.out.print("UserName: ");
            String newUserName = Sc.nextLine();
            if (fileHelper.sameUserName(newUserName)) {
                continue;
            }
            this.userName = newUserName;
            break;
        }
        setPassword();
    }

    public void setPassword() {
        do {
            System.out.print("Password: ");
            String newPassword = Sc.getInstance().nextLine();
            if (newPassword.length() < 8) {
                System.out.println("Password should be longer than 8 character");
                continue;
            }
            this.password = newPassword;
            return;
        } while (true);
    }

    public <T extends User> void showUsers(List<T> users) {
        for (T t : users) {
            System.out.println(t);
        }
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "UserName: " + userName + "\tPart: " + getClass().getSimpleName();
    }

}
