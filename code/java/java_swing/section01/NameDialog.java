package code.java.java_swing.section01;

import javax.swing.JOptionPane;

public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What's your name?");
        String message = String.format("Welcome %s.", name);
        JOptionPane.showMessageDialog(null, message);
    }
}
