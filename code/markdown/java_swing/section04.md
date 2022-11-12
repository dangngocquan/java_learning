# **Colors and Filled Shapes**

|   | Content |
| - | ------- |
| 1 | <a href = "#01">Color</a> |
| 2 | <a href = "#02">Drawing Smiley</a> |

<br>

**<h2 id="01">Color</h2>**

### ***Declare a color***

```
public Color(int r, int g, int b)
```

<br>

**<h2 id="02">Drawing Smiley</h2>**

### ***Code & Output***
#### *class* ***DrawSmiley*** 
```
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        g.fillOval(50, 110, 120, 60);

        g.setColor(Color.YELLOW);
        g.fillOval(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
}
```

#### *class* ***DrawSmileyTest***
```
import javax.swing.JFrame;

public class DrawSmileyTest {
    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        JFrame applicatiion = new JFrame();
        applicatiion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicatiion.setSize(500, 500);
        applicatiion.add(panel);
        applicatiion.setVisible(true);
    }
}
```

#### ***Output***
![Smiley](/code/assets/images/java_swing/section04/DrawSmileyTest.png)