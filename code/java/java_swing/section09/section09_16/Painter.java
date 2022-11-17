package code.java.java_swing.section09.section09_16;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter {
    public static void main(String[] args) {
        JFrame application = new JFrame("Hehe");
        PaintPanel paintPanel = new PaintPanel();
        application.add(paintPanel, BorderLayout.CENTER);
        application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(1000, 600);
        application.setVisible(true);
    }
}
