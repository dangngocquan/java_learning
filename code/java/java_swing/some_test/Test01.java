package code.java.java_swing.some_test;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;

public class Test01 {
    public static void main(String[] args) {
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setTitle("Testing Application");
        application.setSize(1000, 600);
        application.setLayout(null);

        Button button = new Button();
        button.setBounds(0, 0, 100, 300);
        application.add(button);
        application.setVisible(true);
        if (true) {
            System.out.println("A");
        }

    }
}
