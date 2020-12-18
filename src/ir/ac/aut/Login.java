package ir.ac.aut;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Login {

    private JFrame login;
    private JButton loginButton;
    private JRadioButton Admin;
    private JRadioButton Student;
    private JRadioButton Professor;
    private JTextField unameField;
    private JPasswordField passField;

    public Login() {
        login = new JFrame("AUT LOGIN PAGE");
        //login.setSize(500 , 500);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension d1 = new Dimension(300, 180);
        login.setPreferredSize(d1);
        login.setLocation(525, 100);
        JPanel LoginPanel = new JPanel(new BorderLayout(5, 5));
        //LoginPanel.setBackground(Color.yellow);

        JLabel label = new JLabel("دانشگاه صنعتی امیرکبیر");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        //label.setBackground(Color.GREEN);
        label.setOpaque(true);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        label.setBorder(border);
        login.setContentPane(LoginPanel);
        ///
        JPanel insidePanel1 = new JPanel(new BorderLayout(5, 5));
        insidePanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
        //
        //
        JPanel insidePanel2 = new JPanel(new GridLayout(2, 2, 0, 0));
        JLabel unameLabel = new JLabel(" نام کاربری : ");
        JLabel passLabel = new JLabel(" رمز عبور : ");
        unameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        passLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        unameField = new JTextField();
        ButtonHandler handler = new ButtonHandler();
        unameField.addActionListener(handler);
        unameField.addFocusListener(handler);
        passField = new JPasswordField();

        insidePanel2.add(unameField);
        insidePanel2.add(unameLabel);
        insidePanel2.add(passField);
        insidePanel2.add(passLabel);

        //
        JPanel insidePanel3 = new JPanel(new GridLayout(1, 3, 10, 10));
        Admin = new JRadioButton(" ادمین ");
        Student = new JRadioButton(" دانشجو ");
        Professor = new JRadioButton(" استاد ");
        insidePanel3.add(Admin);
        insidePanel3.add(Student);
        insidePanel3.add(Professor);

        insidePanel1.add(insidePanel2, BorderLayout.CENTER);
        insidePanel1.add(insidePanel3, BorderLayout.SOUTH);

        loginButton = new JButton(" LOGIN ");
        loginButton.addActionListener(handler);
        ///
        LoginPanel.add(label, BorderLayout.NORTH);
        LoginPanel.add(insidePanel1, BorderLayout.CENTER);
        LoginPanel.add(loginButton, BorderLayout.SOUTH);
    }

    public void showGUI() {
        login.pack();
        login.setVisible(true);
    }

    private class ButtonHandler implements ActionListener, FocusListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input_username = unameField.getText();
            String input_pwd = new String(passField.getPassword());
            String user = "aaa";
            String pwd = "bbb";
            if (user.equals(pwd)) {
                JOptionPane.showMessageDialog(login, "خوش آمدید", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(login, "رمز یا نام کاربری اشتباه است!", "Result", JOptionPane.ERROR_MESSAGE);
            }


        }

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {

        }
    }
}
