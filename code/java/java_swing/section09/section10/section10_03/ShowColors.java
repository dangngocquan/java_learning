package code.java.java_swing.section09.section10.section10_03;

import javax.swing.JFrame;

public class ShowColors {
    public static void main(String[] args) {
        JFrame application = new JFrame("Using Colors");
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 180);

        ColorPanel colorPanel = new ColorPanel();
        application.add(colorPanel);
        application.setVisible(true);

    }
}
