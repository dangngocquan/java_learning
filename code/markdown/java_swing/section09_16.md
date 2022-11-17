# **JPanel Subclass for Drawing with the Mouse**

## **Example**

### ***Code***

#### *class* ***PaintPanel***

```
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
    private int pointCount = 0;
    private Point[] points = new Point[10000];

    public PaintPanel() {
        addMouseMotionListener(
                new MouseMotionAdapter() {
                    public void mouseDragged(MouseEvent event) {
                        if (pointCount < points.length) {
                            points[pointCount] = event.getPoint();
                            ++pointCount;
                            repaint();
                        }
                    }
                });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < pointCount; i++) {
            g.fillOval(points[i].x, points[i].y, 10, 10);
        }
    }
}
```

#### *class* ***Painter***

```
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter {
    public static void main(String[] args) {
        JFrame application = new JFrame("Hehe");
        PaintPanel paintPanel = new PaintPanel();
        application.add(paintPanel, BorderLayout.CENTER);
        application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(1000, 600);
        application.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_16/Painter.png)