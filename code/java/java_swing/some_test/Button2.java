package code.java.java_swing.some_test;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Canvas;

public class Button2 extends JPanel {
    private String title;
    private Font font = new Font("Serif", Font.PLAIN, 70);
    public int buttonWidth, buttonHeight, descent, leading;

    public Button2(String title) {
        this.title = title;
        Canvas c = new Canvas();
        FontMetrics metrics = c.getFontMetrics(font);
        descent = metrics.getDescent();
        leading = metrics.getLeading();
        this.buttonWidth = metrics.stringWidth(title) + 16 * leading;
        this.buttonHeight = metrics.getHeight() + 4 * leading + 4 * leading;

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0, 0, 0, 0));
        g.fillRect(0, 0, buttonWidth, buttonHeight);
        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(title, 8 * leading, buttonHeight - descent - 4 * leading - 2 * leading);

    }
}
