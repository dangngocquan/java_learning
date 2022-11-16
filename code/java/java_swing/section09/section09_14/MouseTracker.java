package code.java.java_swing.section09.section09_14;

import javax.swing.JFrame;

public class MouseTracker {
    public static void main(String[] args) {
        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(600, 300);
        mouseTrackerFrame.setVisible(true);
    }
}
