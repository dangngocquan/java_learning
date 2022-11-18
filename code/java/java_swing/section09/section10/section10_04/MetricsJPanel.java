package code.java.java_swing.section09.section10.section10_04;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MetricsJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        FontMetrics metrics = g.getFontMetrics();
        g.setFont(new Font("SanSerif", Font.BOLD, 12));
        g.drawString("Current Font: " + g.getFont(), 10, 30);
        g.drawString("Ascent: " + metrics.getAscent(), 10, 45);
        g.drawString("Descent: " + metrics.getDescent(), 10, 60);
        g.drawString("Height: " + metrics.getHeight(), 10, 75);
        g.drawString("Leading: " + metrics.getLeading(), 10, 90);

        Font font = new Font("Serif", Font.ITALIC, 14);
        metrics = g.getFontMetrics();
        g.setFont(font);
        g.drawString("Current Font: " + g.getFont(), 10, 30 + 90);
        g.drawString("Ascent: " + metrics.getAscent(), 10, 45 + 90);
        g.drawString("Descent: " + metrics.getDescent(), 10, 60 + 90);
        g.drawString("Height: " + metrics.getHeight(), 10, 75 + 90);
        g.drawString("Leading: " + metrics.getLeading(), 10, 90 + 90);
    }
}
