# **Using Objects with Graphics**

### ***Code & Output***
#### *class* ***MyLine*** 
```
import java.awt.Color;
import java.awt.Graphics;

public class MyLine {
    private int x1, y1, x2, y2;
    private Color myColor;

    public MyLine(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.myColor = color;
    }

    public void draw(Graphics g) {
        g.setColor(myColor);
        g.drawLine(x1, y1, x2, y2);
    }
}
```

#### *class* ***DrawPanel*** 
```
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
```

#### *class* ***DrawPanelTest***
```
import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(600, 600);
        application.add(panel);
        application.setVisible(true);
    }
}
```

#### ***Output***
![Panel](/code/assets/images/java_swing/section06/DrawPanelTest.png "Panel")