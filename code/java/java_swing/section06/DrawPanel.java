package code.java.java_swing.section06;

import java.awt.Color;
import java.util.Random;
import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {
    private Random randomNumbers = new Random();
    private MyLine[] lines;

    public DrawPanel() {
        setBackground(Color.WHITE);
        lines = new MyLine[100 + randomNumbers.nextInt(10)];
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int count = 0; count < lines.length; count++) {
            int x1 = randomNumbers.nextInt(getWidth());
            int y1 = randomNumbers.nextInt(getHeight());
            int x2 = randomNumbers.nextInt(getWidth());
            int y2 = randomNumbers.nextInt(getHeight());
            Color color = new Color(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256));
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
        for (MyLine line : lines) {
            line.draw(g);
        }
    }
}
