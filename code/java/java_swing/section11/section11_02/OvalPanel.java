package code.java.java_swing.section11.section11_02;

import java.awt.Graphics;

import javax.swing.JPanel;

import java.awt.Dimension;

public class OvalPanel extends JPanel {
    private int diameter = 10;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillOval(10, 10, diameter, diameter);
    }

    public void setDiameter(int newDiameter) {
        diameter = (newDiameter >= 0 ? newDiameter : 10);
        repaint();
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    public Dimension getMinimumSize() {
        return getPreferredSize();
    }
}