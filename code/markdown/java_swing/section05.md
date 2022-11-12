# Drawing Arcs

### ***Code & Output***
#### *class* ***DrawRainbow*** 
```
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class DrawRainbow extends JPanel {
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    private Color[] colors = {
            Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
            Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED
    };

    public DrawRainbow() {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int radius = 20;
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        for (int counter = colors.length; counter > 0; counter--) {
            g.setColor(colors[counter - 1]);
            g.fillArc(centerX - counter * radius, centerY - counter * radius,
                    counter * radius * 2, counter * radius * 2, 0, 180);
        }
    }
}

```

#### *class* ***DrawRainbowTest***
```
import javax.swing.JFrame;

public class DrawRainbowTest {
    public static void main(String[] args) {
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(600, 600);
        application.add(panel);
        application.setVisible(true);
    }
}
```

#### ***Output***
![Rainbow](/code/assets/images/java_swing/section05/DrawRainbowTest.png "Rainbow")