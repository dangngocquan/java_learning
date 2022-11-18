package code.java.java_swing.section09.section10.section10_04;

import javax.swing.JFrame;

public class Metrics {
    public static void main(String[] args) {
        JFrame application = new JFrame("Demonstrating FontMetrics");
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(510, 240);

        MetricsJPanel metricsJPanel = new MetricsJPanel();
        application.add(metricsJPanel);
        application.setVisible(true);
    }
}
