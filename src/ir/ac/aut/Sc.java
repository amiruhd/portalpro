package ir.ac.aut;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sc {
    public static final Scanner SC = new Scanner(System.in);

    private Sc() {

    }

    public static Scanner getInstance() {
        return SC;
    }

    public static int nextInt() {
        while (true) {
            try {
                return SC.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input should be Integer");
            }
        }
    }

    public static int nextBetWeenInt(int min, int max) {
        while (true) {
            int num = SC.nextInt();
            if (num <= max && num >= min) {
                return num;
            }
            System.out.println("Input should be from " + min + " to " + max);
        }
    }
    public void clear(){
        SC.nextLine();
    }

    public static String nextLine(){
        return SC.nextLine();
    }
}
