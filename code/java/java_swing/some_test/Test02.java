package code.java.java_swing.some_test;

import java.awt.Color;

import javax.swing.JFrame;

public class Test02 {
    public static void main(String[] args) {
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(1000, 600);

        application.setLayout(null);
        application.getContentPane().setBackground(Color.BLUE);
        Button2 button = new Button2("Chào mọi Người Ỵ Ữ");
        button.setBounds(100, 50, button.buttonWidth, button.buttonHeight);
        application.add(button);
        application.setVisible(true);
    }
}
