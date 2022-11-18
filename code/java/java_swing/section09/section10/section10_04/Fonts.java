package code.java.java_swing.section09.section10.section10_04;

import javax.swing.JFrame;

public class Fonts {
    public static void main(String[] args) {
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(420, 150);

        FontJPanel fontJPanel = new FontJPanel();
        application.add(fontJPanel);
        application.setVisible(true);
    }
}
