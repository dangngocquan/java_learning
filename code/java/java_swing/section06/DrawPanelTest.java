package code.java.java_swing.section06;

import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(600, 600);
        application.add(panel);
        application.setVisible(true);
    }
}
