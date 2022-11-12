package code.java.java_swing.section09.section09_03;

import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter the first integer:");
        String secondNumber = JOptionPane.showInputDialog("Enter the second integer:");
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        int sum = number1 + number2;
        JOptionPane.showMessageDialog(null, String.format("The sum is %d.", sum),
                "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
}