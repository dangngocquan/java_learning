# **Java 2D API**

## **Example 1**

### ***Code***

#### *class* ***ShapesJPanel***

```
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.TexturePaint;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class ShapesJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100, Color.YELLOW, true));
        g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));

        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));

        BufferedImage buffImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        Graphics2D gg = buffImage.createGraphics();
        gg.setColor(Color.YELLOW);
        gg.fillRect(0, 0, 10, 10);
        gg.setColor(Color.BLACK);
        gg.drawRect(1, 1, 6, 6);
        gg.setColor(Color.BLUE);
        gg.fillRect(1, 1, 3, 3);
        gg.setColor(Color.RED);

        g2d.setPaint(new TexturePaint(buffImage, new Rectangle(10, 10)));
        g2d.fill(new RoundRectangle2D.Double(155, 30, 75, 100, 50, 50));

        g2d.setPaint(Color.WHITE);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));

        g2d.setPaint(Color.GREEN);
        g2d.draw(new Line2D.Double(395, 30, 320, 150));

        float[] dashes = { 10 };
        g2d.setPaint(Color.YELLOW);
        g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashes, 0));
        g2d.draw(new Line2D.Double(320, 30, 395, 150));
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section10/section10_08/Shapes.png)

<br>

## **Example 2: Using General Paths**

### ***Code***

#### *class* ***Shapes2JPanel***

```
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;

import javax.swing.JPanel;

public class Shapes2JPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random random = new Random();

        int[] xPoints = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
        int[] yPoints = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();
        star.moveTo(xPoints[0], yPoints[0]);

        for (int count = 1; count < xPoints.length; count++) {
            star.lineTo(xPoints[count], yPoints[count]);
        }
        star.closePath();

        g2d.translate(200, 200);

        for (int count = 1; count <= 20; count++) {
            g2d.rotate(Math.PI / 10.0);
            g2d.setColor(new Color(
                    random.nextInt(256),
                    random.nextInt(256),
                    random.nextInt(256)));
            g2d.fill(star);
        }

    }
}
```

#### *class* ***Shapes2***

```
import javax.swing.JFrame;

public class Shapes2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(396, 416);
        Shapes2JPanel shapes = new Shapes2JPanel();
        frame.add(shapes);
        frame.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section10/section10_08/Shapes2.png)

