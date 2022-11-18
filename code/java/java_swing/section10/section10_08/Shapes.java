package code.java.java_swing.section09.section10.section10_08;

import javax.swing.JFrame;

public class Shapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing 2D shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(425, 200);

        ShapesJPanel shapesJPanel = new ShapesJPanel();
        frame.add(shapesJPanel);

        frame.setVisible(true);
    }
}
