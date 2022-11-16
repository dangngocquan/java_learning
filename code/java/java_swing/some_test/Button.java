package code.java.java_swing.some_test;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Image;

public class Button extends JPanel {
    public Button() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image = (new ImageIcon("code\\assets\\images\\java_swing\\section09\\section09_11\\goku1.png"))
                .getImage();
        g.drawImage(image, 0, 0, 100, 300, this);
    }
}
