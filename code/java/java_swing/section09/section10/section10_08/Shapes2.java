package code.java.java_swing.section09.section10.section10_08;

import javax.swing.JFrame;

public class Shapes2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(396, 416);
        Shapes2JPanel shapes = new Shapes2JPanel();
        frame.add(shapes);
        frame.setVisible(true);
    }
}
