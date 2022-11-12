package code.java.java_swing.section04;

import javax.swing.JFrame;

public class DrawSmileyTest {
    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        JFrame applicatiion = new JFrame();
        applicatiion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicatiion.setSize(500, 500);
        applicatiion.add(panel);
        applicatiion.setVisible(true);
    }
}
