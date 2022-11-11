# **Creating Simple Drawings**

|   | Content |
| - | ------- |
| 1 | <a href = "#01">Java's Coordinate System</a> |
| 2 | <a href = "#02">First Drawing Application</a> |

<br>

**<h2 id="01">Java's Coordinate System</h2>**

![](/code/assets/images/java_swing/section02/JavaCoordinateSystem.png)

<br>

**<h2 id="02">First Drawing Application</h2>**

### ***Code & Output***
#### *class* ***DrawPanel*** 
```
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }
}
```

#### *class* ***DrawPanelTest***
```
import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(500, 500);
        application.add(panel);
        application.setVisible(true);
    }
}
```

#### ***Output***
![Output](/code/assets/images/java_swing/section02/DrawPanelTest.png)